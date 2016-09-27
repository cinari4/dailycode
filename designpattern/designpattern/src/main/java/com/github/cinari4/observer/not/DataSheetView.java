package com.github.cinari4.observer.not;

import java.util.List;

public class DataSheetView {
	private ScoreRecord scoreRecord;
	private int viewCount;
	
	public DataSheetView(ScoreRecord scoreRecord, int viewCount) {
		this.scoreRecord = scoreRecord;
		this.viewCount = viewCount;
	}
	
	public void update() {
		List<Integer> record = scoreRecord.getScoreRecord();
		displayScores(record, viewCount);
	}

	private void displayScores(List<Integer> record, int viewCount) {
		System.out.println("List of " + viewCount + " entries : ");
		for (int i = 0 ; i < viewCount && i < record.size(); i++) {
			System.out.print(record.get(i) + " ");
		}
		System.out.println();
	}
}
