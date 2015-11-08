//
//  PhotoInfo.swift
//  RememberTheDay
//
//  Created by ChoiMun gyu on 2015. 11. 7..
//  Copyright © 2015년 cinari Inc. All rights reserved.
//

import UIKit

class PhotoInfo {
    var photo :UIImage
    var pos:CGPoint
    var fileUrl:NSURL

    init(fileUrl:NSURL, photo:UIImage, pos:CGPoint) {
        self.fileUrl = fileUrl
        self.photo = photo
        self.pos = pos
    }
    
    init(fileUrl:NSURL) {
        self.fileUrl = fileUrl
        self.photo = UIImage(named: "not-available.jpg")!;
        self.pos = CGPoint(x: 0, y: 0)
    }
    
    
}
