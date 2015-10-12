//
//  AttractionTablewViewController.swift
//  TableViewStory
//
//  Created by ChoiMun gyu on 2015. 10. 12..
//  Copyright © 2015년 Apple Inc. All rights reserved.
//

import UIKit

class AttractionTablewViewController: UITableViewController {

    var attractionImages = [String]()
    var attractionNames = [String]()
    var webAddresses = [String]()
    
    override func viewDidLoad() {
        super.viewDidLoad()
        
        attractionNames = ["Buckingham Palace",
            "The Eiffel Tower",
            "The Grand Canyon",
            "Windsor Castle",
            "Empire State Building"]
        
        webAddresses = ["http://en.wikipedia.org/wiki/Buckingham_Palace",
            "http://en.wikipedia.org/wiki/Eiffel_Tower",
            "http://en.wikipedia.org/wiki/Grand_Canyon",
            "http://en.wikipedia.org/wiki/Windsor_Castle",
            "http://en.wikipedia.org/wiki/Empire_State_Building"]
        
        attractionImages = ["buckingham_palace.jpg",
            "eiffel_tower.jpg",
            "grand_canyon.jpg",
            "windsor_castle.jpg",
            "empire_state_building.jpg"]
        
        tableView.estimatedRowHeight = 50
        
    }
    
    override func numberOfSectionsInTableView(tableView: UITableView) -> Int {
        // Return the number of sections.
        return 1
    }
    
    override func tableView(tableView: UITableView, numberOfRowsInSection section: Int) -> Int {
        return attractionNames.count
    }
    
    override func tableView(tableView: UITableView, cellForRowAtIndexPath indexPath: NSIndexPath) -> UITableViewCell {
        let cell =
        self.tableView.dequeueReusableCellWithIdentifier(
            "AttractionTableCell", forIndexPath: indexPath)
            as! AttractionTableViewCell
        
        let row = indexPath.row
        cell.attractionLabel.font = UIFont.preferredFontForTextStyle(UIFontTextStyleHeadline)
        cell.attractionLabel.text = attractionNames[row]
        cell.attractionImage.image = UIImage(named: attractionImages[row])
        return cell
        
    }



}
