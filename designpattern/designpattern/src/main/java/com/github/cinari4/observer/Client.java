package com.github.cinari4.observer;

import com.github.cinari4.observer.DataSheetView;
import com.github.cinari4.observer.MinMaxView;
import com.github.cinari4.observer.ScoreRecord;

public class Client {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
		DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
		MinMaxView minMaxView = new MinMaxView(scoreRecord);
		
		scoreRecord.attach(dataSheetView3);
		scoreRecord.attach(dataSheetView5);
		scoreRecord.attach(minMaxView);
		
		for (int i = 1; i <= 5; i++) {
			int score = i * 10;
			System.out.println("Adding : " + score);
			scoreRecord.addScore(score);
		}
	}
}
