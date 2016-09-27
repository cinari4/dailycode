package com.github.cinari4.observer.not;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord {
	private List<Integer> scores = new ArrayList<Integer>();
	
	private List<DataSheetView> dataSheetViews = new ArrayList<DataSheetView>();
	private MinMaxView minMaxView;

	public void setMinMaxView(MinMaxView minMaxView) {
		this.minMaxView = minMaxView;
	}
	
	public void setDataSheetView(DataSheetView dataSheetView) {
		this.dataSheetViews = dataSheetViews;
	}

	public void addDataSheetView(DataSheetView dataSheetView) {
		dataSheetViews.add(dataSheetView);
	}
	
	public void addScore(int score) {
		scores.add(score);
		for (DataSheetView dataSheetView : dataSheetViews) {
			dataSheetView.update();
		}
		minMaxView.update();
	}
	
	public List<Integer> getScoreRecord() {
		return scores;
	}
	
	
}
