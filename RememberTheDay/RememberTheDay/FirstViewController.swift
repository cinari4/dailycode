//
//  FirstViewController.swift
//  RememberTheDay
//
//  Created by ChoiMun gyu on 2015. 10. 24..
//  Copyright © 2015년 cinari Inc. All rights reserved.
//

import UIKit

class FirstViewController: UIViewController, UIImagePickerControllerDelegate, UINavigationControllerDelegate {
    @IBAction func testBtn(sender: AnyObject) {
        let imagePickerViewController = UIImagePickerController()
        imagePickerViewController.delegate = self
        self.presentViewController(imagePickerViewController,
            animated: true,
            completion: nil)
    }

    let imagePicker = UIImagePickerController()
    
    override func viewDidLoad() {
        super.viewDidLoad()

        let imageName = "not-available.jpg"
        let image = UIImage(named: imageName);
        let imageView = UIImageView(image: image!);
        
        let bounds = UIScreen.mainScreen().bounds
        let screenWidth = bounds.size.width
        let screenHeight = bounds.size.height
        
        imageView.frame = CGRect(x: 0, y: 0, width: screenWidth/2, height: screenHeight/2)
        view.addSubview(imageView)
        
        imagePicker.delegate = self
        imagePicker.allowsEditing = false
        imagePicker.sourceType = .PhotoLibrary
        
        presentViewController(imagePicker, animated: true, completion: nil)
        
        

    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

