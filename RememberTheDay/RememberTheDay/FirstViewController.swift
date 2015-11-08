//
//  FirstViewController.swift
//  RememberTheDay
//
//  Created by ChoiMun gyu on 2015. 10. 24..
//  Copyright © 2015년 cinari Inc. All rights reserved.
//

import UIKit
import Photos
import AssetsLibrary



class FirstViewController: UIViewController, UIGestureRecognizerDelegate {

    var imageView : UIImageView!
    var testDay1 = "08-08"
    var testDay2 = "09-16"
    var photoInfoList:[PhotoInfo] = []
    let scrollView = UIScrollView(frame: UIScreen.mainScreen().bounds)
    var scrollViewContentSize:CGFloat=0
    
    override func viewDidLoad() {
        super.viewDidLoad()

        // get photo list
        getTheDayPhotoList()
        
        // check count and set default image
        if photoInfoList.count == 0 {
            loadDefaultImage()
        } else {
            displayThePhoto(self.scrollView)
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
    
    // view tap gesture handler
    func handleTap(gestureRecognizer: UIGestureRecognizer) {
        print("finally tapped")
        let currentLocation : CGPoint = gestureRecognizer.locationInView(scrollView)
        print(currentLocation)
    }
    
    // display photo to input view
    func displayThePhoto(view:UIView) {
        let bounds = UIScreen.mainScreen().bounds
        let startX = bounds.size.width * 0.1
        var startY = bounds.size.height * 0.1
        let endX = bounds.size.width * 0.8
        let endY = bounds.size.height * 0.4
        
        scrollViewContentSize += startY * CGFloat(photoInfoList.count+1)
        scrollViewContentSize += (endY * CGFloat(photoInfoList.count))
        
        for i in 0..<photoInfoList.count {
            let resizeCG = CGSizeMake(endX, endY)
            let resizedImage = imageResize(photoInfoList[i].photo, sizeChange: resizeCG)
            photoInfoList[i].pos = CGPoint(x: startX, y: startY)
            imageView = UIImageView(image: resizedImage)
            imageView.contentMode = UIViewContentMode.ScaleAspectFit
            imageView.frame = CGRect(x: startX, y: startY, width: endX, height: endY)
            view.addSubview(imageView)
            startY = startY + endY + bounds.size.height * 0.05
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
    
    /// 과거의 오늘 사진의 url을 가져온다.
    func getTheDayPhotoList() {
        let fetchOptions: PHFetchOptions = PHFetchOptions()
        fetchOptions.sortDescriptors = [NSSortDescriptor(key: "creationDate", ascending: true)]
        
        let fetchResult = PHAsset.fetchAssetsWithMediaType(PHAssetMediaType.Image, options: fetchOptions)
        
        fetchResult.enumerateObjectsUsingBlock { (object, _, _) in
            if let asset = object as? PHAsset {
                if self.getTheDay(asset.creationDate!) == self.testDay1 || self.getTheDay(asset.creationDate!) == self.testDay2 {
                    let requestOptions = PHImageRequestOptions()
                    PHImageManager.defaultManager().requestImageForAsset(asset, targetSize: UIScreen.mainScreen().bounds.size, contentMode: PHImageContentMode.AspectFill, options: requestOptions) { (result, info)  in

                        if let imageURL = info!["PHImageFileURLKey"] as! NSURL? {
                            let photo = PhotoInfo(fileUrl: imageURL)
                            self.photoInfoList.append(photo)
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
        
        let bounds = UIScreen.mainScreen().bounds
        let screenWidth = bounds.size.width
        let screenHeight = bounds.size.height
        
        imageView.frame = CGRect(x: screenWidth/4, y: screenHeight/8, width: screenWidth/2, height: screenHeight/3)
        view.addSubview(imageView)
    }
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    
}

