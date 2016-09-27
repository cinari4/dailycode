package com.github.cinari4.observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreRecord extends Subject {
	public List<Integer> scores = new ArrayList<Integer>();
	
	public void addScore(int score) {
		scores.add(score);
		notifyObservers();
	}
	
	public List<Integer> getScoreRecord() {
		return scores;
	}
}
