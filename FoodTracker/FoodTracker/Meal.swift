//
//  Meal.swift
//  FoodTracker
//
//  Created by ChoiMun gyu on 2015. 9. 19..
//  Copyright © 2015년 Apple Inc. All rights reserved.
//

import UIKit

class Meal {
    var name:String
    var photo:UIImage?
    var rating:Int


    // MARK : Initialization
    init?(name:String, photo:UIImage?, rating:Int) {
        self.name = name
        self.photo = photo
        self.rating = rating
        
        if name.isEmpty || rating < 0 {
            return nil
        }
    }



}