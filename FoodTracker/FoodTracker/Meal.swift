//
//  Meal.swift
//  FoodTracker
//
//  Created by ChoiMun gyu on 2015. 9. 19..
//  Copyright © 2015년 Apple Inc. All rights reserved.
//

import UIKit

class Meal: NSObject, NSCoding {
    // MARK : PROPERTIES
    var name:String
    var photo:UIImage?
    var rating:Int

    static let DocumentsDirectory = NSFileManager().URLsForDirectory(.DocumentDirectory, inDomains: .UserDomainMask).first!
    static let ArchiveURL = DocumentsDirectory.URLByAppendingPathComponent("meals")
    
    struct PropertyKey {
        static let nameKey = "name"
        static let photoKey = "photo"
        static let ratingKey = "rating"
    }
    
    // MARK : Initialization
    init?(name:String, photo:UIImage?, rating:Int) {
        self.name = name
        self.photo = photo
        self.rating = rating
        
        super.init()
        
        if name.isEmpty || rating < 0 {
            return nil
        }
    }

    func encodeWithCoder(aCoder: NSCoder) {
        aCoder.encodeObject(name, forKey: PropertyKey.nameKey)
        aCoder.encodeObject(photo, forKey: PropertyKey.photoKey)
        aCoder.encodeInteger(rating, forKey: PropertyKey.ratingKey)
    }
    
    required convenience init?(coder aDecoder: NSCoder) {
        let name = aDecoder.decodeObjectForKey(PropertyKey.nameKey) as! String
        let photo = aDecoder.decodeObjectForKey(PropertyKey.photoKey) as? UIImage
        let rating = aDecoder.decodeIntegerForKey(PropertyKey.ratingKey)
        
        self.init(name: name, photo: photo, rating: rating)
    }
    
}