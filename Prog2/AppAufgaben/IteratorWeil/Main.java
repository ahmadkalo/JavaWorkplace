package IteratorWeil;

import java.util.Iterator;
import java.util.Random;

// Importieren der benötigten Klassen

public class Main {
	
	static Random r = new Random(); // Erstellen eines Random-Objekts für zufällige Zahlen

	// Die Hauptmethode, die das Programm startet
	public static void main(String[] args) {
		
		Integer[][] arr2 = { {1, 2, 3}, {4, 5}, {6, 7, 8, 9}}; // Ein 2D-Array von Integern

		DynArray<Double> dynarr = new DynArray<>(); // Eine dynamische Array-Instanz für Double-Werte
		for (int i = 0; i < 3; i++) {
			dynarr.add(r.nextDouble(4.0))  ; // Füge 3 zufällige Double-Werte zum dynamischen Array hinzu
		} 
		
		EVL<String> evl = new EVL<>(); // Eine verkettete Liste von Strings
		evl.insert("Hallo"); // Füge "Hallo" zur Liste hinzu
		evl.insert("du"); // Füge "du" zur Liste hinzu
		evl.insert("da"); // Füge "da" zur Liste hinzu
		
		testIterator2DArray(arr2); // Teste den Iterator für das 2D-Array
		System.out.println("-----------------------------");
		
		testDynarrayIterator(dynarr); // Teste den Iterator für das dynamische Array
		System.out.println("-----------------------------");
		
		
		
		testEVLIterator(evl); // Teste den Iterator für die verkettete Liste
		System.out.println("-----------------------------");
	}
	
	// Eine Methode zum Testen des Iterators für das 2D-Array
	public static void testIterator2DArray(Integer[][] arr) {
		Iterator<Integer> it = new ZeilenIterator2DArray<>(arr); // Erstelle einen Iterator für das 2D-Array
		System.out.println("Iterator2DArray"); // Gib eine Nachricht aus
		System.out.print("{ ");
		while (it.hasNext()) {
			System.out.print(it.next() + " "); // Gib die Werte des 2D-Arrays durch den Iterator aus
		}
		System.out.println("}");
	}
	
	// Eine generische Methode zum Testen des Iterators für das dynamische Array
	public static <T> void testDynarrayIterator(DynArray<T> darr) {
		Iterator<T> it = new DynArrayIterator<>(darr); // Erstelle einen Iterator für das dynamische Array
		System.out.println("DynArrayIterator"); // Gib eine Nachricht aus
		while (it.hasNext()) {
			System.out.print(it.next() + " "); // Gib die Werte des dynamischen Arrays durch den Iterator aus
		}
		System.out.println();
	}
	
	// Eine generische Methode zum Testen des Iterators für die verkettete Liste
	public static <T> void testEVLIterator(EVL<T> evl) {
		Iterator<T> it = evl.new EVLIterator(); // Erstelle einen Iterator für die verkettete Liste
		System.out.println("EVLIterator"); // Gib eine Nachricht aus
		while (it.hasNext())
			System.out.print(it.next() + " "); // Gib die Werte der verketteten Liste durch den Iterator aus
		System.out.println();
	}
}
