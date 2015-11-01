//
//  FirstViewController.swift
//  RememberTheDay
//
//  Created by ChoiMun gyu on 2015. 10. 24..
//  Copyright © 2015년 cinari Inc. All rights reserved.
//

import UIKit
import Photos

class FirstViewController: UIViewController {

    var assetCollection: PHAssetCollection!
    var photosAsset: PHFetchResult!
    var index: Int = 0
    var imageView : UIImageView!
    var testDay1 = "10-09"
    var testDay2 = "03-12"
    var imageList:[UIImage] = []
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        getTheDayPhotoList()
        if imageList.count == 0 {
            loadDefaultImage()
        } else {
            displayThePhoto()
        }
        
    }
    
    func displayThePhoto() {
        let bounds = UIScreen.mainScreen().bounds
        let startX = bounds.size.width * 0.1
        var startY = bounds.size.height * 0.1
        let endX = bounds.size.width * 0.8
        let endY = bounds.size.height * 0.4
        
        for i in 0..<imageList.count {
            let resizeCG = CGSizeMake(endX, endY)
            let resizedImage = imageResize(imageList[i], sizeChange: resizeCG)
            imageView = UIImageView(image: resizedImage)
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
    
    /// 과거의 오늘 사진들을 가져온다.
    func getTheDayPhotoList() {
        let fetchOptions: PHFetchOptions = PHFetchOptions()
        fetchOptions.sortDescriptors = [NSSortDescriptor(key: "creationDate", ascending: true)]
        
        let fetchResult = PHAsset.fetchAssetsWithMediaType(PHAssetMediaType.Image, options: fetchOptions)
        
        fetchResult.enumerateObjectsUsingBlock { (object, _, _) in
            if let asset = object as? PHAsset {
                if self.getTheDay(asset.creationDate!) == self.testDay1 || self.getTheDay(asset.creationDate!) == self.testDay2 {
                    PHImageManager.defaultManager().requestImageForAsset(asset, targetSize: UIScreen.mainScreen().bounds.size, contentMode: PHImageContentMode.AspectFill, options: PHImageRequestOptions()) { (result, info)  in
                        if(result != nil) {
                            self.imageList.append(result!)
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

