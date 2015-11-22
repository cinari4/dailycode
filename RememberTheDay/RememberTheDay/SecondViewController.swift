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
    
    var photoInfoList:[PhotoInfo] = []
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        let firstViewController = storyboard!.instantiateViewControllerWithIdentifier("firstViewController") as! FirstViewController
        photoInfoList = firstViewController.photoInfoList

        let camera = GMSCameraPosition.cameraWithLatitude(-33.868,
            longitude:151.2086, zoom:2)
        let mapView = GMSMapView.mapWithFrame(CGRectZero, camera:camera)
        
        let marker = GMSMarker()
        marker.position = camera.target
        marker.snippet = "Hello World"
        marker.appearAnimation = kGMSMarkerAnimationPop
        marker.map = mapView
        
        
        let marker2 = GMSMarker()
        marker2.position = CLLocationCoordinate2DMake(+65.68289500, -17.54892833)
        marker2.snippet = "Hello World"
        marker2.appearAnimation = kGMSMarkerAnimationPop
        marker2.map = mapView
        
        self.view = mapView

    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
}

