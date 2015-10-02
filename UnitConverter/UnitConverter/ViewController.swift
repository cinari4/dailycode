//
//  ViewController.swift
//  UnitConverter
//
//  Created by ChoiMun gyu on 2015. 10. 2..
//  Copyright © 2015년 Apple Inc. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var lbsText: UITextField!
    @IBOutlet weak var lbsLabel: UILabel!
    @IBAction func convertLbs(sender: AnyObject) {
        let lbsToKgRate = 0.453592
        let inputLbs = ((lbsText.text! as NSString).doubleValue) * lbsToKgRate
        let resultText = "Kg : \(inputLbs)"
        lbsLabel.text = resultText
    }
    
    @IBAction func textFieldReturn(sender: AnyObject) {
        sender.resignFirstResponder()
    }
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

