//
//  PhotoInfo.swift
//  RememberTheDay
//
//  Created by ChoiMun gyu on 2015. 11. 7..
//  Copyright © 2015년 cinari Inc. All rights reserved.
//

import UIKit
import CoreLocation

class PhotoInfo {
    var photo :UIImage
    var pos:CGRect
    var photoURL:NSURL
    var location:CLLocation
    var creationDate:NSDate

    init(photoURL:NSURL, photo:UIImage, location:CLLocation, creationDate:NSDate) {
        self.photoURL = photoURL
        self.photo = photo
        self.pos = CGRect(x: 0, y: 0, width:0, height:0)
        self.location = location
        self.creationDate = creationDate
    }
}
