package StackKlammern;

import java.util.Stack;

public class StackKlammern {
	// Die Methode zur Überprüfung der korrekten Klammerstruktur
	public static boolean check(String[] s) {
		Stack<String> stack = new Stack<>();

		// Iteriere über das Array mit einer normalen for-Schleife
		for (int i = 0; i < s.length; i++) {
			String str = s[i];

			// Überprüfe, ob das aktuelle Element eine öffnende Klammer ist
			if (offen(str)) {
				stack.push(str);
				
			}
			// Überprüfe, ob das aktuelle Element eine schließende Klammer ist
			if (geschlossen(str)) {
				
				if (stack.isEmpty() || !vergleiche(stack.pop(), str)) {
					return false;
					
				} 
			} 
		}

		
		return stack.isEmpty();
	}

	// Überprüfe, ob ein String eine öffnende Klammer ist
	private static boolean offen(String str) {
		return str.equals("(") || str.equals("begin") || str.equals("[") || str.equals("{") || str.equals("start");
	}

	// Überprüfe, ob ein String eine schließende Klammer ist
	private static boolean geschlossen(String str) {
		return str.equals(")") || str.equals("end") || str.equals("]") || str.equals("}") || str.equals("stop");
	}

	// Überprüfe, ob eine öffnende und eine schließende Klammer zusammenpassen
	private static boolean vergleiche(String offen, String geschlossen) {
		return (offen.equals("(") && geschlossen.equals(")")) || (offen.equals("begin") && geschlossen.equals("end"))
				|| (offen.equals("[") && geschlossen.equals("]")) || (offen.equals("{") && geschlossen.equals("}"))
				|| (offen.equals("start") && geschlossen.equals("stop"));
	}
	
	public static String zeigeArray(Object[] a) {
		
		String object = "";
		for (int i = 0; i < a.length; i++) {
			object += (String) a[i] + " ";
			
		}return object;
		
	}

	
	public static void main(String[] args) {
		
		String[] ErsterAusdruck = { "(", "2", "(", "2", "*","3", ")", "+", "(", "1","*","2", ")", ")",")" };
		String[] ZweiterAusdruck = { "begin", "2", "*", "5", "end", "[", "5", "]" };
		String[] DritterAusdruck = { "start", "stop", "(", ")", "start", "stop" };
		String[] VierterAusdruck = { "{", "}", "ahmed", "kalo","}" };
		String[] FünfterAusdruck = { "{", "}","}" };
		
		System.out.println("Erster Ausdruck: " + (check(ErsterAusdruck) ? "Der Ausdruck " + zeigeArray(ErsterAusdruck) + "stimmt" : "Der Ausdruck " + zeigeArray(ErsterAusdruck) + "stimmt leider nicht")); 
		System.out.println("Zweiter Ausdruck: " + (check(ZweiterAusdruck) ? "Der Ausdruck " + zeigeArray(ZweiterAusdruck) + "stimmt" : "Der Ausdruck " + zeigeArray(ZweiterAusdruck) + "stimmt leider nicht")); 
		System.out.println("Dritter Ausdruck: " + (check(DritterAusdruck) ? "Der Ausdruck " + zeigeArray(DritterAusdruck) + "stimmt" : "Der Ausdruck " + zeigeArray(DritterAusdruck) + "stimmt leider nicht")); 
		System.out.println("Vierter Ausdruck: " + (check(VierterAusdruck) ? "Der Ausdruck " + zeigeArray(VierterAusdruck) + "stimmt" : "Der Ausdruck " + zeigeArray(VierterAusdruck) + "stimmt leider nicht"));
		System.out.println("Fünfter Ausdruck: " + (check(FünfterAusdruck) ? "Der Ausdruck " + zeigeArray(FünfterAusdruck) + "stimmt" : "Der Ausdruck " + zeigeArray(FünfterAusdruck) + "stimmt leider nicht"));
	}
	
	
}
