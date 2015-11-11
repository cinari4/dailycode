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
    let imageView = UIImageView(frame: UIScreen.mainScreen().bounds)
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        let tap = UITapGestureRecognizer(target: self, action: Selector("tappedMe"))
        imageView.addGestureRecognizer(tap)
        imageView.userInteractionEnabled = true
    }
    
    override func viewDidAppear(animated: Bool) {
        imageView.image = self.uiImage
        self.view.addSubview(imageView)
    }
    
    func tappedMe()
    {
         self.dismissViewControllerAnimated(true, completion: {});
    }
}

