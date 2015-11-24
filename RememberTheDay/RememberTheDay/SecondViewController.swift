//
//  SecondViewController.swift
//  RememberTheDay
//
//  Created by ChoiMun gyu on 2015. 10. 24..
//  Copyright © 2015년 cinari Inc. All rights reserved.
//

import UIKit
import Foundation
import GoogleMaps;

class SecondViewController: UIViewController {
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        
        if(photoInfoList.count > 0) {
            let camera = GMSCameraPosition.cameraWithLatitude(photoInfoList[0].location.coordinate.latitude,
                longitude:photoInfoList[0].location.coordinate.longitude, zoom:2)
            let mapView = GMSMapView.mapWithFrame(CGRectZero, camera:camera)
            
            for i in 0..<photoInfoList.count {
                let marker = GMSMarker()
                marker.position = CLLocationCoordinate2DMake(photoInfoList[i].location.coordinate.latitude, photoInfoList[i].location.coordinate.longitude)
                marker.snippet = "Hello World"
                marker.appearAnimation = kGMSMarkerAnimationPop
                marker.map = mapView
            }
            self.view = mapView
        }

    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
}

