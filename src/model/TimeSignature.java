package model;

public class TimeSignature {

	private int beatsPerMeasure;
	private int beatDuration;
	private String rawFormat = "\\d+ \\d+";
	
	public TimeSignature(String rawFraction) {
		this(0, 0);
		if (rawFraction.matches(rawFormat)) {
			String[] parts = rawFraction.split(" ");
			this.setBeatsPerMeasure(Integer.valueOf(parts[0]));
			this.setBeatDuration(Integer.valueOf(parts[1]));
		} else {
			System.out.println("Invalid time signature.  Try again.");
		}
	}
	
	public TimeSignature(int bpm, int beatDur) {
		beatsPerMeasure = bpm;
		beatDuration = beatDur;
	}
	
	public String toString() {
		return beatsPerMeasure + " / " + beatDuration;
	}
	
	public int getBeatsPerMeasure() {
		return beatsPerMeasure;
	}
	
	public void setBeatsPerMeasure(int beatsPerMeasure) {
		this.beatsPerMeasure = beatsPerMeasure;
	}
	
	public int getBeatDuration() {
		return beatDuration;
	}
	
	public void setBeatDuration(int beatDuration) {
		this.beatDuration = beatDuration;
	}
}
