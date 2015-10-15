//
//  ViewController.swift
//  Calculator
//
//  Created by ChoiMun gyu on 2015. 10. 16..
//  Copyright © 2015년 Apple Inc. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var display: UILabel!
    @IBAction func appendDigit(sender: UIButton) {
        let digit = sender.currentTitle
        print("digit = \(digit)")
    }
    
}

