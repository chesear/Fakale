package model;

import java.util.ArrayList;

public class Measure {

	private TimeSignature timeSignature;
	private KeySignature keySignature;
	private ArrayList<Note> notes;
	
	public Measure(Measure prev) {
		this(prev.getTimeSignature(), prev.getKeySignature());
	}
	
	public Measure(TimeSignature timeSignature, Measure prev) {
		this(timeSignature, prev.getKeySignature());
	}
	
	public Measure(KeySignature keySignature, Measure prev) {
		this(prev.getTimeSignature(), keySignature);
	}
	
	public Measure(TimeSignature timeSignature, KeySignature keySignature) {
		timeSignature = timeSignature;
		keySignature = keySignature;
		notes = new ArrayList<Note>();
	}

	public TimeSignature getTimeSignature() {
		return timeSignature;
	}

	public void setTimeSignature(TimeSignature timeSignature) {
		this.timeSignature = timeSignature;
	}

	public KeySignature getKeySignature() {
		return keySignature;
	}

	public void setKeySignature(KeySignature keySignature) {
		this.keySignature = keySignature;
	}

	public ArrayList<Note> getNotes() {
		return notes;
	}

	public void setNotes(ArrayList<Note> notes) {
		this.notes = notes;
	}
}
