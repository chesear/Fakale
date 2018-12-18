package model;

import java.util.ArrayList;

public class Piece {

	private ArrayList<Measure> measures;
	
	public Piece(KeySignature key, TimeSignature timeSignature) {
		Measure first = new Measure(timeSignature, key);
		measures = new ArrayList<Measure>();
		measures.add(first);
	}

	public ArrayList<Measure> getMeasures() {
		return measures;
	}

	public void setMeasures(ArrayList<Measure> measures) {
		this.measures = measures;
	}
}
