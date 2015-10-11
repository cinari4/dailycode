//
//  ViewController.swift
//  Storyboard
//
//  Created by ChoiMun gyu on 2015. 10. 10..
//  Copyright © 2015년 Apple Inc. All rights reserved.
//

import UIKit

class ViewController: UIViewController {
    
    @IBOutlet weak var scene1Label: UILabel!

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }

    override func prepareForSegue(segue: UIStoryboardSegue, sender: AnyObject?) {
        let dest = segue.destinationViewController as! Scene2ViewController
        dest.labelText = "Arrive from scene1"
    }
    
    @IBAction func returned(segue: UIStoryboardSegue) {
        scene1Label.text = "returned from scene2"
    }
}

