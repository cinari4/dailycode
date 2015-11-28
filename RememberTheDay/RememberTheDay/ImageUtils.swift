//
//  ImageUtils.swift
//  RememberTheDay
//
//  Created by ChoiMun gyu on 2015. 11. 28..
//  Copyright © 2015년 cinari Inc. All rights reserved.
//

import Foundation
import UIKit

/// 이미지 리사이즈
func imageResize (imageObj:UIImage, sizeChange:CGSize)-> UIImage{
    let hasAlpha = false
    let scale: CGFloat = 0.0 // Automatically use scale factor of main screen
    
    UIGraphicsBeginImageContextWithOptions(sizeChange, !hasAlpha, scale)
    imageObj.drawInRect(CGRect(origin: CGPointZero, size: sizeChange))
    
    let scaledImage = UIGraphicsGetImageFromCurrentImageContext()
    return scaledImage
}