package com.github.cinari4.observer.not;

public class Client {
	public static void main(String[] args) {
		ScoreRecord scoreRecord = new ScoreRecord();
		DataSheetView dataSheetView3 = new DataSheetView(scoreRecord, 3);
		DataSheetView dataSheetView5 = new DataSheetView(scoreRecord, 5);
		MinMaxView minMaxView = new MinMaxView(scoreRecord);
		
		scoreRecord.addDataSheetView(dataSheetView3);
		scoreRecord.addDataSheetView(dataSheetView5);
		scoreRecord.setMinMaxView(minMaxView);
		
		for (int i = 1; i <= 5; i++) {
			int score = i * 10;
			System.out.println("Adding : " + score);
			scoreRecord.addScore(score);
		}
	}
}
