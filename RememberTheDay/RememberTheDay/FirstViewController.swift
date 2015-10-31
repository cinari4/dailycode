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
    var testDay = "10-09"
    
    override func viewDidLoad() {
        super.viewDidLoad()

        let imageName = "not-available.jpg"
        let image = UIImage(named: imageName)
        imageView = UIImageView(image: image!)
        
        let bounds = UIScreen.mainScreen().bounds
        let screenWidth = bounds.size.width
        let screenHeight = bounds.size.height
        
        imageView.frame = CGRect(x: screenWidth/4, y: screenHeight/8, width: screenWidth/2, height: screenHeight/3)
        view.addSubview(imageView)
        displayTheDayPhoto()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    /// 과거의 오늘 사진을 출력해준다.
    func displayTheDayPhoto(){
        let fetchOptions: PHFetchOptions = PHFetchOptions()
        fetchOptions.sortDescriptors = [NSSortDescriptor(key: "creationDate", ascending: true)]
        
        let fetchResult = PHAsset.fetchAssetsWithMediaType(PHAssetMediaType.Image, options: fetchOptions)

        fetchResult.enumerateObjectsUsingBlock { (object, _, _) in
            if let asset = object as? PHAsset {
                if self.getTheDay(asset.creationDate!) == self.testDay {
                    PHImageManager.defaultManager().requestImageForAsset(asset, targetSize: UIScreen.mainScreen().bounds.size, contentMode: PHImageContentMode.AspectFill, options: PHImageRequestOptions()) { (result, info) -> Void in
                        
                        self.imageView.image = result;
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
    
    ///
    func displayLastPhoto() {
        let fetchOptions: PHFetchOptions = PHFetchOptions()
        fetchOptions.sortDescriptors = [NSSortDescriptor(key: "creationDate", ascending: true)]
        
        let fetchResult = PHAsset.fetchAssetsWithMediaType(PHAssetMediaType.Image, options: fetchOptions)
        
        if (fetchResult.lastObject != nil) {
            let lastAsset: PHAsset = fetchResult.lastObject as! PHAsset
            PHImageManager.defaultManager().requestImageForAsset(lastAsset, targetSize: UIScreen.mainScreen().bounds.size, contentMode: PHImageContentMode.AspectFill, options: PHImageRequestOptions()) { (result, info) -> Void in
                
                self.imageView.image = result;
            }
        }
    }
    
}

