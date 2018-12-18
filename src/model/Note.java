package model;

public class Note {

	private Pitch pitch;
	private Duration duration;
	private Octave octave;
	
	public Note(Note prev) {
		this(prev.getPitch(), prev.getDuration(), prev.getOctave());
	}
	
	public Note(Pitch pitch, Note prev) {
		this(pitch, prev.getDuration(), prev.getOctave());
	}
	
	public Note(Pitch pitch, Duration duration, Note prev) {
		this(pitch, duration, prev.getOctave());
	}
	
	public Note(Pitch pitch, Duration duration, Octave octave) {
		pitch = pitch;
		duration = duration;
		octave = octave;
	}

	public Pitch getPitch() {
		return pitch;
	}

	public void setPitch(Pitch pitch) {
		this.pitch = pitch;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public Octave getOctave() {
		return octave;
	}

	public void setOctave(Octave octave) {
		this.octave = octave;
	}
	
	
}
