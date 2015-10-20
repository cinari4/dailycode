//: Playground - noun: a place where people can play

import UIKit

// An Optional is just an enum
enum Optional<T> {
    case None
    case Some(T)
}

// Array
var a = Array<String>()
var a1 = [String]()

let animals = ["Giraffe", "Cow", "Doggie", "Bord"]
for animal in animals {
    print("\(animal)")
}


// Dictionary
var pac10teamRankings = Dictionary<String, Int>()
pac10teamRankings = ["Standford":2, "cal":10]
for (key, value) in pac10teamRankings {
    print("\(key) = \(value)")
}

// A Range in Swift in just two end points of a sensible type
// Range is generic
struct Range<T> {
    var startIndex: T
    var endIndex: T
}


// NSObject
// Base class for all Object-C class

// NSNumber
// Generic number-holding class
let n = NSNumber(double: 35.5)
let intversion = n.intValue

// NSData


class CalculatorBrain {
    
}
struct Vertext {
    
}
enum Op {
    
}


// value (struct and enum)
// copied when passed as an argument to a function
// copied when assigned to a different variable
// Immutable if assigned to a variable with let
// Remember that function parameters are, by default, constants
// you can put the keyword var on an parameter , and it will be mutable, but it's still a copy
// you must note any func that can mutate a struct/ enum with the keyword mutating

// Reference (class)
// stored in the heap and reference counted ( automatically)
// constant pointers to a class(let) still can mutate by calling methods and changing properties
