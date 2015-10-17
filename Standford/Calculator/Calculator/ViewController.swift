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
        let operation = sender.currentTitle!
        if isUserType {
            enter()
        }
        switch operation {
        case "×": performOpertaion {$0 * $1}
        case "÷": performOpertaion {$1 / $0}
        case "+": performOpertaion {$0 + $1}
        case "−": performOpertaion {$1 - $0}
        case "√": performOpertaion { sqrt($0) }
          
        default: break
        }
    }
    
    private func performOpertaion(operation: (Double, Double) -> Double) {
        if operandStack.count >= 2 {
            displayValue = operation(operandStack.removeLast(), operandStack.removeLast())
            enter()
        }
    }
    
    private func performOpertaion(operation: Double -> Double) {
        if operandStack.count >= 1 {
            displayValue = operation(operandStack.removeLast())
            enter()
        }
    }

    var operandStack: Array<Double> = Array<Double>()
    @IBAction func enter() {
        isUserType = false
        operandStack.append(displayValue)
        print("\(operandStack)")
    }
    
    var displayValue: Double {
        get {
            return NSNumberFormatter().numberFromString(display.text!)!.doubleValue
        }
        set {
            display.text = "\(newValue)"
            isUserType = false
        }
    }
}

