//
//  FirstViewController.swift
//  RememberTheDay
//
//  Created by ChoiMun gyu on 2015. 10. 24..
//  Copyright © 2015년 cinari Inc. All rights reserved.
//

import UIKit
import Photos

class FirstViewController: UIViewController, UIGestureRecognizerDelegate {

    var imageView : UIImageView!
    var testDay1 = "08-08"
    var testDay2 = "09-16"
    var photoInfoList:[PhotoInfo] = []
    let scrollView = UIScrollView(frame: UIScreen.mainScreen().bounds)
    var scrollViewContentSize:CGFloat=0
    var screenBounds : CGRect!
    var startX : CGFloat!
    var endX : CGFloat!
    var endY : CGFloat!
    
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
        screenBounds = UIScreen.mainScreen().bounds
        startX = screenBounds.size.width * 0.1
        endX = screenBounds.size.width * 0.8
        endY = screenBounds.size.height * 0.4
    }
    
    
    // display photo to input view
    func displayThePhoto(view:UIView) {
        var startY = screenBounds.size.height * 0.1
        
        scrollViewContentSize += startY * CGFloat(photoInfoList.count+1)
        scrollViewContentSize += (endY * CGFloat(photoInfoList.count))

        for i in 0..<photoInfoList.count {
            let resizeCG = CGSizeMake(endX, endY)
            let resizedImage = imageResize(photoInfoList[i].photo, sizeChange: resizeCG)
            photoInfoList[i].pos = CGRect(x: startX, y: startY, width: endX, height: endY)

            imageView = UIImageView(image: resizedImage)
            imageView.contentMode = UIViewContentMode.ScaleAspectFit
            imageView.frame = photoInfoList[i].pos
            view.addSubview(imageView)
            startY = startY + endY + screenBounds.size.height * 0.05
        }
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
                if self.getTheDay(asset.creationDate!) == self.testDay1 || self.getTheDay(asset.creationDate!) == self.testDay2 {
                    let requestOptions = PHImageRequestOptions()
                    requestOptions.synchronous = true
                    PHImageManager.defaultManager().requestImageForAsset(asset, targetSize: self.screenBounds.size, contentMode: PHImageContentMode.AspectFill, options: requestOptions) { (result, info)  in
                        if let photoURL = info!["PHImageFileURLKey"] as! NSURL? {
                            let photo = NSData(contentsOfURL: photoURL)
                            let photoInfoObj = PhotoInfo(photoURL: photoURL, photo:UIImage(data:photo!)!)
                            self.photoInfoList.append(photoInfoObj)
                        }
                    }
                }
            }
        }
    }

    /// 현재 날짜를 MM-dd 형식으로 구한다.
    func getTodayDate() -> String {
        let date = NSDate()
        return getTheDay(date)
    }
    
    /// 입력된 날짜를 MM-dd형식으로 변환해줍니다.
    func getTheDay(date:NSDate) ->String {
        let dateFormatter = NSDateFormatter()
        dateFormatter.dateFormat = "MM-dd"
        let dateString = dateFormatter.stringFromDate(date)
        return dateString
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
   
}

