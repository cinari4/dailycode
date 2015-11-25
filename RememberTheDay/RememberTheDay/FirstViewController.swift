//
//  FirstViewController.swift
//  RememberTheDay
//
//  Created by ChoiMun gyu on 2015. 10. 24..
//  Copyright © 2015년 cinari Inc. All rights reserved.
//

import UIKit
import Photos

var photoInfoList:[PhotoInfo] = []
var screenBounds = UIScreen.mainScreen().bounds
let NO_PLACE_NAME = "The location could not be found."


class FirstViewController: UIViewController, UIGestureRecognizerDelegate {

    var imageView : UIImageView!
    var testDay1 = "08-08"
    var testDay2 = "09-16"
    let scrollView = UIScrollView(frame: UIScreen.mainScreen().bounds)
    var scrollViewContentSize:CGFloat=0
    
    var startX : CGFloat!
    var startY : CGFloat!
    var photoWidth : CGFloat!
    var photoHeight : CGFloat!
    var labelWidth : CGFloat!
    var labelHeight : CGFloat!
    
    enum JSONError: String, ErrorType {
        case NoData = "ERROR: no data"
        case ConversionFailed = "ERROR: conversion from JSON failed"
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        setDisplayPoints()
        
        // get photo list
        getTheDayPhotoList()
        
        // check count and set default image
        if photoInfoList.count == 0 {
            loadDefaultImage()
        } else {
            displayThePhoto(scrollView)
        }
        
        // add gesture on view
        addTapGesture()
        
    }
    
    // add tap Gesture
    func addTapGesture() {
        let gestureRecognizer = UITapGestureRecognizer(target: self, action: "handleTap:")
        self.view.addGestureRecognizer(gestureRecognizer)
        scrollView.contentSize = CGSizeMake(UIScreen.mainScreen().bounds.size.width, scrollViewContentSize)
        self.view.addSubview(scrollView)
    }
    
    // check what photo u tapped
    func getTappedPicture(point:CGPoint) ->Int {
        for i in 0..<photoInfoList.count {
            if CGRectContainsPoint(photoInfoList[i].pos, point) {
                return i
            }
        }
        return -1
    }
    
    // view tap gesture handler
    func handleTap(gestureRecognizer: UIGestureRecognizer) {
        let currentLocation : CGPoint = gestureRecognizer.locationInView(scrollView)
        let clickedPhoto = getTappedPicture(currentLocation)
        
        if clickedPhoto >= 0 {
            let storyboard = UIStoryboard(name: "Main", bundle: nil)
            let imageViewController = storyboard.instantiateViewControllerWithIdentifier("imageViewControllerIdentifier") as! ImageViewController
            imageViewController.uiImage = photoInfoList[clickedPhoto].photo
            self.presentViewController(imageViewController, animated: true, completion: nil)
        }
    }
    
    // set display points
    func setDisplayPoints() {
        startX = screenBounds.size.width * 0.1
        startY = screenBounds.size.height * 0.1
        photoWidth = screenBounds.size.width * 0.8
        photoHeight = screenBounds.size.height * 0.4
        labelWidth = screenBounds.size.width * 0.8
        labelHeight = screenBounds.size.height * 0.05
    }
    
    // display photo to input view
    func displayThePhoto(view:UIView) {
        scrollViewContentSize += startY * CGFloat(photoInfoList.count+1)
        scrollViewContentSize += (photoHeight * CGFloat(photoInfoList.count))

        for i in 0..<photoInfoList.count {
            getGeoCodeAddress(photoInfoList[i].location, index: i)
            let resizeCG = CGSizeMake(photoWidth, photoHeight)
            let resizedImage = imageResize(photoInfoList[i].photo, sizeChange: resizeCG)
            let imageRect = CGRect(x: startX, y: startY, width: photoWidth, height: photoHeight)
            photoInfoList[i].pos = imageRect

            imageView = UIImageView(image: resizedImage)
            imageView.contentMode = UIViewContentMode.ScaleAspectFit
            imageView.frame = photoInfoList[i].pos
            setLabel(imageRect, view:view, creationDate: photoInfoList[i].creationDate)
            view.addSubview(imageView)
            startY = startY + photoWidth + screenBounds.size.height * 0.05
        }
    }
    
    func setLabel(rect:CGRect, view:UIView, creationDate:NSDate) {
        let labelRect = CGRect(x:rect.minX, y:rect.maxY + 10, width:labelWidth, height:labelHeight )
        let label = UILabel(frame: labelRect)
        label.textAlignment = NSTextAlignment.Center
        label.text = getPhotoDay(creationDate)
        view.addSubview(label)
    }
    
    /// 이미지 리사이즈
    func imageResize (imageObj:UIImage, sizeChange:CGSize)-> UIImage{
        let hasAlpha = false
        let scale: CGFloat = 0.0 // Automatically use scale factor of main screen
        
        UIGraphicsBeginImageContextWithOptions(sizeChange, !hasAlpha, scale)
        imageObj.drawInRect(CGRect(origin: CGPointZero, size: sizeChange))
        
        let scaledImage = UIGraphicsGetImageFromCurrentImageContext()
        return scaledImage
    }
    
    /// 과거의 오늘 사진의 url, image를 가져온다.
    func getTheDayPhotoList() {
        let fetchOptions: PHFetchOptions = PHFetchOptions()
        fetchOptions.sortDescriptors = [NSSortDescriptor(key: "creationDate", ascending: true)]
        
        let fetchResult = PHAsset.fetchAssetsWithMediaType(PHAssetMediaType.Image, options: fetchOptions)
        
        fetchResult.enumerateObjectsUsingBlock { (object, _, _) in
            if let asset = object as? PHAsset {
                if getTheDay(asset.creationDate!) == self.testDay1 || getTheDay(asset.creationDate!) == self.testDay2 {
                    let requestOptions = PHImageRequestOptions()
                    requestOptions.synchronous = true
                    PHImageManager.defaultManager().requestImageForAsset(asset, targetSize: screenBounds.size, contentMode: PHImageContentMode.AspectFill, options: requestOptions) { (result, info)  in
                        if let photoURL = info!["PHImageFileURLKey"] as! NSURL? {
                            let photo = NSData(contentsOfURL: photoURL)
                            var location:CLLocation!
                            if asset.location == nil {
                                location = CLLocation(latitude: 0, longitude: 0)
                            } else {
                                location = asset.location
                            }
                            let photoInfoObj = PhotoInfo(photoURL: photoURL, photo:UIImage(data:photo!)!, location:location, creationDate:asset.creationDate!)
                            photoInfoList.append(photoInfoObj)
                        }
                    }
                }
            }
        }
    }

    
    // 기본 이미지 로드
    func loadDefaultImage() {
        let imageName = "not-available.jpg"
        let image = UIImage(named: imageName)
        imageView = UIImageView(image: image!)
        
        let screenWidth = screenBounds.size.width
        let screenHeight = screenBounds.size.height
        
        imageView.frame = CGRect(x: screenWidth/4, y: screenHeight/8, width: screenWidth/2, height: screenHeight/3)
        view.addSubview(imageView)
    }

    override func shouldAutorotate() -> Bool {
        // Lock autorotate
        return false
    }
    
    override func supportedInterfaceOrientations() -> UIInterfaceOrientationMask {
        // Only allow Portrait
        let orientation: UIInterfaceOrientationMask = [UIInterfaceOrientationMask.Portrait, UIInterfaceOrientationMask.PortraitUpsideDown]
        return orientation
    }

    override func preferredInterfaceOrientationForPresentation() -> UIInterfaceOrientation {
        // Only allow Portrait
        return UIInterfaceOrientation.Portrait
    }
    
    func getGeoCodeAddress(location:CLLocation, index:Int) ->String {
        let latlng = String(location.coordinate.latitude) + "," + String(location.coordinate.longitude)
        let urlPath = "http://maps.googleapis.com/maps/api/geocode/json?sensor=false&language=ko&latlng=" + latlng
        guard let endpoint = NSURL(string: urlPath) else { print("Error creating endpoint");return NO_PLACE_NAME }
        let request = NSMutableURLRequest(URL:endpoint)
        NSURLSession.sharedSession().dataTaskWithRequest(request) { (data, response, error) -> Void in
            do {
                guard let dat = data else { throw JSONError.NoData }
                guard let json = try NSJSONSerialization.JSONObjectWithData(dat, options: []) as? NSDictionary else { throw JSONError.ConversionFailed }
                if(json["status"] as! String == "OK") {
                    let allResults = json["results"] as! Array<Dictionary<NSObject, AnyObject>>
                    let lookupAddressResults = allResults[0] as Dictionary<NSObject, AnyObject>
                    photoInfoList[index].address = lookupAddressResults["formatted_address"] as! String
                }
                
            } catch let error as JSONError {
                print(error.rawValue)
            } catch {
                print(error)
            }
            }.resume()
        return NO_PLACE_NAME
    }

}

