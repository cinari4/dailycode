//
//  ImageViewController.swift
//  RememberTheDay
//
//  Created by ChoiMun gyu on 2015. 11. 10..
//  Copyright © 2015년 cinari Inc. All rights reserved.
//

import UIKit

class ImageViewController: UIViewController {

    var uiImage: UIImage!
    
    override func viewDidLoad() {
        super.viewDidLoad()
    }
    
    override func viewDidAppear(animated: Bool) {
        let imageView = UIImageView(frame: UIScreen.mainScreen().bounds)
        imageView.image = self.uiImage
        self.view.addSubview(imageView)
    }
}

