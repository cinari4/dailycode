//
//  FirstViewController.swift
//  RememberTheDay
//
//  Created by ChoiMun gyu on 2015. 10. 24..
//  Copyright © 2015년 cinari Inc. All rights reserved.
//

import UIKit

class FirstViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        
        let imageName = "not-available.jpg"
        let image = UIImage(named: imageName);
        let imageView = UIImageView(image: image!);
        
        let bounds = UIScreen.mainScreen().bounds
        let screenWidth = bounds.size.width
        let screenHeight = bounds.size.height
        
        imageView.frame = CGRect(x: 0, y: 0, width: screenWidth, height: screenHeight)
        view.addSubview(imageView)

    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

