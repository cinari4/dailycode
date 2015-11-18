//
//  ImageViewController.swift
//  RememberTheDay
//
//  Created by ChoiMun gyu on 2015. 11. 10..
//  Copyright © 2015년 cinari Inc. All rights reserved.
//

import UIKit
import CoreLocation

class ImageViewController: UIViewController {

    var uiImage: UIImage!
    let imageView = UIImageView(frame: UIScreen.mainScreen().bounds)
    var location:CLLocation!
    var screenBounds : CGRect!
    var startX : CGFloat!
    var startY : CGFloat!
    var photoWidth : CGFloat!
    var photoHeight : CGFloat!
    
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        let tap = UITapGestureRecognizer(target: self, action: Selector("tappedMe"))
        
        imageView.backgroundColor = UIColor.blackColor()
        imageView.addGestureRecognizer(tap)
        imageView.userInteractionEnabled = true
    }
    
    override func viewDidAppear(animated: Bool) {
        setScreenPoint()
        
        let resizeCG = CGSizeMake(photoWidth, photoHeight)
        let resizedImage = imageResize(self.uiImage, sizeChange: resizeCG)

        let resizeimageView = UIImageView(image: resizedImage)
        resizeimageView.contentMode = UIViewContentMode.ScaleAspectFit
        resizeimageView.frame = CGRect(x: startX, y: startY, width: photoWidth, height: photoHeight)
        
        self.view.addSubview(imageView)
        self.view.addSubview(resizeimageView)
    }
    
    func tappedMe()
    {
         self.dismissViewControllerAnimated(true, completion: {});
    }
    
    func setScreenPoint() {
        screenBounds = UIScreen.mainScreen().bounds
        photoWidth = screenBounds.size.width
        photoHeight = (photoWidth/4)*3
        startY = (screenBounds.size.height - photoHeight)/2
        startX = 0
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

}

