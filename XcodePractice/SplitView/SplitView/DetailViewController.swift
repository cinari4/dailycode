//
//  DetailViewController.swift
//  SplitView
//
//  Created by ChoiMun gyu on 2015. 10. 14..
//  Copyright © 2015년 Apple Inc. All rights reserved.
//

import UIKit

class DetailViewController: UIViewController {

    @IBOutlet weak var detailDescriptionLabel: UILabel!
    @IBOutlet weak var webView: UIWebView!


    var detailItem: AnyObject? {
        didSet {
            // Update the view.
            self.configureView()
        }
    }

    func configureView() {
        if let detail: AnyObject = self.detailItem {
            if let myWebView = self.webView {
                let url = NSURL(string: detailItem as! String)
                let request = NSURLRequest(URL:url!)
                myWebView.scalesPageToFit = true
                myWebView.loadRequest(request)
            }
        }
    }

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        self.configureView()
    }

    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }


}

