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
 
    var isUserType:Bool = false
    
    var brain = CalculatorBrain()
    
    @IBAction func appendDigit(sender: UIButton) {
        let digit = sender.currentTitle!
        if isUserType {
            display.text = display.text! + digit
        } else {
            display.text = digit
            isUserType = true
        }
    }
    
    @IBAction func operate(sender: UIButton) {
        if isUserType {
            enter()
        }
       
        if let operation = sender.currentTitle {
            if let result = brain.performOperation(operation){
                displayValue = result
            } else{
                displayValue = 0
            }
        }
    }
    
    @IBAction func enter() {
        isUserType = false
        if let result = brain.pushOperand(displayValue) {
            displayValue = result
        } else {
            displayValue = 0
        }
    }
    
    var displayValue: Double {
        get {
            return NSNumberFormatter().numberFromString(display.text!)!.doubleValue
        }
        set {
            display.text = "\(newValue)"
        }
    }
}

