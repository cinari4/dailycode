//
//  Scene2ViewController.swift
//  Storyboard
//
//  Created by ChoiMun gyu on 2015. 10. 11..
//  Copyright © 2015년 Apple Inc. All rights reserved.
//

import UIKit

class Scene2ViewController: UIViewController {
    
    @IBOutlet weak var scene2Label: UILabel!

    var labelText: String?
    
    override func viewDidLoad() {
        super.viewDidLoad()
        scene2Label.text = labelText
        // Do any additional setup after loading the view.
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    

    /*
    // MARK: - Navigation

    // In a storyboard-based application, you will often want to do a little preparation before navigation
    override func prepareForSegue(segue: UIStoryboardSegue, sender: AnyObject?) {
        // Get the new view controller using segue.destinationViewController.
        // Pass the selected object to the new view controller.
    }
    */

}
