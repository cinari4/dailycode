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
// when passed as an argument, does not make a copy


// Properties
// Property Observers
// Lazy Initialization

/*
    let image = UIImage(named: "foo")

    if let image = UIImage(named: "foo"){
        // image was successfully created
    } else {
        // couldn't create the image
    }

*/


// Initialization
// - Creating Objects
// let x = CalculatorBrain()
// let z = [String]()
// let commaSeperatedArrayElements: String = ",".join(myArray)



/*
AnyObject
    Special "Type"(actially it's a protocol)
    used primarily for compatibility with existing object-c-based apis

    var destinationViewController : AnyObject
    var toolbarItems: [AnyObject]

Casting AnyObject
    we 'force' an AnyObject to be something else by 'casting' it using the as keyword...
        let calVC = destinationViewController as CalculatorViewController

    to protect against a crash, we can use if let with as?
        if let calcVC = destinationViewController as? CalculatorViewController {...}
        ... as? return an Optional

    or we can check before we even try to do as with the is keyword...
        if destinationViewController is CalculatorViewController { ... }

Casting array of AnyObject
    for item in toolbarItems {
            if let toolbarItem = item as? UIBarButtonItem {
                ..
            }
    }
    
    for toolbarItem in  toobarItems as [UIBarButtonItem]

*/



/* 
    some Array<T> Methods

    append(T)
    insert(T, atIndex: Int)
    splice(Array<T>, atIndex: Int)

    removeAtIndex(Int)
    removeRange(Range)
    replaceRange(Range, [T])
    sort(isOrderedBefore: (T, T) -> Bool)
    
    filter(includeElement: (T) -> Bool) -> [T]
    map(transform: (T) -> U) -> [U]
    reduce(initial: U, combile: (U, T) -> U) -> U
*/



/*
String.Index
    advance
    splice
    rangeOfString
    description -> String
    endIndex -> String.Index
    hasPrefix(String) -> Bool
    hasSuffix(String) -> Bool
    toInt() -> Int?
    capitalizedString -> String
    lowercaseString -> String
    uppercaseString -> String
    join(Array) -> String
    componentsSeperatedByString(String) -> [String]

*/



/*
Type Conversion
    let d: Dobule = 37.5
    let f: Float = 37.5
    let x = Int(d)
    let xd = Double(x)
    let cgf = CGFloat(d)
    let a = Array("abc")
    let s = String(["a","b"])
*/


/*
Assertions
    assert(()->Bool, "message")
    assert(validation() != nil, "message")

*/
