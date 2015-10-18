//
//  CalculatorBrain.swift
//  Calculator
//
//  Created by ChoiMun gyu on 2015. 10. 18..
//  Copyright © 2015년 Apple Inc. All rights reserved.
//

import Foundation

class CalculatorBrain {
    
    enum Op {
        case Operand(Double)
        case UnaryOperation(String, Double -> Double)
        case BinaryOperation(String, (Double, Double) -> Double)
    }
    
    //var opStack = Array<Op>()
    var opStack = [Op]()
    
    //var knownOps = Dictionary<String, Op>()
    var knownOps = [String:Op]()
    
    init() {
        //knownOps["×"] = Op.BinaryOperation("×") {$0 * $1}
        knownOps["×"] = Op.BinaryOperation("×", *)
        
        knownOps["÷"] = Op.BinaryOperation("÷") {$1 / $0}
        
        //knownOps["+"] = Op.BinaryOperation("+") {$0 + $1}
        knownOps["+"] = Op.BinaryOperation("+", +)
        
        knownOps["-"] = Op.BinaryOperation("-") {$1 - $0}
        
        //knownOps["√"] = Op.UnaryOperation("√") {sqrt($0)}
        knownOps["√"] = Op.UnaryOperation("√", sqrt)

    }
    
    func pushOperand(operand: Double) {
        opStack.append(Op.Operand(operand))
    }
    
    func performOperation(symbol: String) {
        if let operation = knownOps[symbol] {
            opStack.append(operation)
        }
    }
}