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
    
    init?(photo:UIImage) {
        self.photo = photo
        self.pos = CGPoint(x: 0, y: 0)
    }
}
