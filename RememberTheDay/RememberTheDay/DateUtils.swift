//
//  DateUtils.swift
//  RememberTheDay
//
//  Created by ChoiMun gyu on 2015. 11. 24..
//  Copyright © 2015년 cinari Inc. All rights reserved.
//

import Foundation


/// 현재 날짜를 MM-dd 형식으로 구한다.
func getTodayDate() -> String {
    let date = NSDate()
    return getTheDay(date)
}

/// 입력된 날짜를 MM-dd형식으로 변환해줍니다.
func getTheDay(date:NSDate) ->String {
    let dateFormatter = NSDateFormatter()
    dateFormatter.dateFormat = "MM-dd"
    let dateString = dateFormatter.stringFromDate(date)
    return dateString
}

/// 입력된 날짜를 MM-dd형식으로 변환해줍니다.
func getPhotoDay(date:NSDate) ->String {
    let dateFormatter = NSDateFormatter()
    dateFormatter.dateFormat = "yyyy-MM-dd"
    let dateString = dateFormatter.stringFromDate(date)
    return dateString
}