//
//  Init.swift
//  RememberTheDay
//
//  Created by ChoiMun gyu on 2015. 11. 28..
//  Copyright © 2015년 cinari Inc. All rights reserved.
//

import Foundation
import UIKit
import Photos

var photoInfoList:[PhotoInfo] = []
var screenBounds = UIScreen.mainScreen().bounds
let NO_PLACE_NAME = "The location could not be found."

enum JSONError: String, ErrorType {
    case NoData = "ERROR: no data"
    case ConversionFailed = "ERROR: conversion from JSON failed"
}

func getGeoCodeAddress(location:CLLocation, index:Int) ->String {
    let latlng = String(location.coordinate.latitude) + "," + String(location.coordinate.longitude)
    let urlPath = "http://maps.googleapis.com/maps/api/geocode/json?sensor=false&language=ko&latlng=" + latlng
    guard let endpoint = NSURL(string: urlPath) else { print("Error creating endpoint");return NO_PLACE_NAME }
    let request = NSMutableURLRequest(URL:endpoint)
    NSURLSession.sharedSession().dataTaskWithRequest(request) { (data, response, error) -> Void in
        do {
            guard let dat = data else { throw JSONError.NoData }
            guard let json = try NSJSONSerialization.JSONObjectWithData(dat, options: []) as? NSDictionary else { throw JSONError.ConversionFailed }
            if(json["status"] as! String == "OK") {
                let allResults = json["results"] as! Array<Dictionary<NSObject, AnyObject>>
                let lookupAddressResults = allResults[0] as Dictionary<NSObject, AnyObject>
                photoInfoList[index].address = lookupAddressResults["formatted_address"] as! String
            }
            
        } catch let error as JSONError {
            print(error.rawValue)
        } catch {
            print(error)
        }
        }.resume()
    return NO_PLACE_NAME
}