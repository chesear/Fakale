package controller;

import java.util.Scanner;

import model.KeySignature;
import model.Piece;
import model.TimeSignature;

public class Composer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean correct = false;
		boolean abort = false;
		String confirmation;
		
		TimeSignature timeSig;
		do {
			System.out.println("Time Signature (bpm beat): ");
			String timeSigRaw = scanner.nextLine();
			timeSig = new TimeSignature(timeSigRaw);
			System.out.println("You have entered " + timeSig + ".  Is this correct (y/n)? ");
			confirmation = scanner.nextLine();
			correct = confirmation.equalsIgnoreCase("Y");
			abort = confirmation.equalsIgnoreCase("EXIT");
		} while ((!correct || null == timeSig || timeSig.getBeatsPerMeasure() == 0 || timeSig.getBeatDuration() == 0) && !abort);
		
		KeySignature key;
		do {
			System.out.println("Key Signature: ");
			String keySigRaw = scanner.nextLine();
			key = new KeySignature(keySigRaw);
			System.out.println("You have entered " + key + ".  Is this correct (y/n)? ");
			confirmation = scanner.nextLine();
			correct = confirmation.equalsIgnoreCase("Y");
			abort = confirmation.equalsIgnoreCase("EXIT");
		} while ((!correct || null == key || key.equals("H")) && !abort);
		
		if (abort) {
			System.out.println("User triggered early termination.  Goodbye.");
			System.exit(0);
		}
		
		Piece piece = new Piece(key, timeSig);
		System.out.println("Your piece begins in the key of " + key + " in " + timeSig + " time.  Here we go!");
		
		scanner.close();
	}
}
