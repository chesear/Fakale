package model;

public class KeySignature {

	private Pitch key;
	private Mode mode;
	private String rawFormat = "[a-gA-G]{1}[bs]?[mM]?";
	
	public KeySignature(String keySigRaw) {
		this(Pitch.H, null);
		if (keySigRaw.matches(rawFormat)) {
			try {
				if (keySigRaw.endsWith("m")) {
					this.setMode(Mode.MINOR);
					this.setKey(Pitch.valueOf(keySigRaw.substring(0, keySigRaw.length() - 1)));
				} else if (keySigRaw.endsWith("M")) {
					this.setMode(Mode.MAJOR);
					this.setKey(Pitch.valueOf(keySigRaw.substring(0, keySigRaw.length() - 1)));
				} else {
					this.setMode(Mode.MAJOR);
					this.setKey(Pitch.valueOf(keySigRaw));
				}
			} catch (Exception e) {
				System.out.println("Invalid key signature.  Please be precise.");
			}
		} else {
			System.out.println("Invalid key signature.  Try again.");
		}
	}
	
	public KeySignature(Pitch key, Mode mode) {
		key = key;
		mode = mode;
	}
	
	public String toString() {
		return key + " " + mode;
	}
	
	public Pitch getKey() {
		return key;
	}
	
	public void setKey(Pitch key) {
		this.key = key;
	}
	
	public Mode getMode() {
		return mode;
	}
	
	public void setMode(Mode mode) {
		this.mode = mode;
	}
}
