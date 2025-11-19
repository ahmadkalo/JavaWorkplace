package Übungen;
import java.util.Scanner;

public class Notendurchschnitt {
    
    @SuppressWarnings("unused")
	public static void main(String[] args) {
    	
    	int anzahlNoten;
    	double notenschnitt, notenschnittGerundet;
    	double gesamtwertNoten = 0;
        
    Scanner NotenScanner = new Scanner(System.in);
    
    System.out.println("Wie viele Noten möchten Sie eingeben: ");
    anzahlNoten = NotenScanner.nextInt();
    
    for(int i = 0; i < anzahlNoten; i++) {
    	
    	 
    	System.out.println("Note " + (i+1) + " eingeben:");
    	int aktuelleNote = NotenScanner.nextInt();
    	
    	gesamtwertNoten = gesamtwertNoten + aktuelleNote;
    	
    	}
    
    	NotenScanner.close();

    	notenschnitt = gesamtwertNoten/anzahlNoten;
    	
    	
    	System.out.println("Notenanzahl: " + anzahlNoten);
    		System.out.println("Gesamtwert: " + gesamtwertNoten);
    		System.out.println("Notenschnitt: " + notenschnitt);
    			
    	
    }
    
}
