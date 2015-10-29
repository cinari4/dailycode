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
        displayLastPhoto()
        getPhotoDate()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    func getPhotoDate(){
        let fetchOptions: PHFetchOptions = PHFetchOptions()
        fetchOptions.sortDescriptors = [NSSortDescriptor(key: "creationDate", ascending: true)]
        
        let fetchResult = PHAsset.fetchAssetsWithMediaType(PHAssetMediaType.Image, options: fetchOptions)
        let date = NSDate()
        print(getTheDay(date))

        fetchResult.enumerateObjectsUsingBlock { (object, _, _) in
            if let asset = object as? PHAsset {
                print(self.getTheDay(asset.creationDate!))
            }
        }
    }
    
    func getTheDay(date:NSDate) ->String {
        let calendar = NSCalendar.currentCalendar()
        let components = calendar.components([.Year, .Month, .Day], fromDate: date )
        
        let year =  components.year
        let month = components.month
        let day = components.day
        return String(year) + String(month) + String(day)
    }
    
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

