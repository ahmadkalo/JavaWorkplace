package ArrayBasics;

import java.util.Arrays;

public class GroeßeDesArrays {
	
	public static void main(String[] args) {
		// Array initialisieren
		int[] array = { 1, 2, 3, 4, 5 };

		// Ausgabe des ursprünglichen Arrays
		System.out.println("Ursprüngliches Array: " + Arrays.toString(array));

		// Neue Größe des Arrays und Wert, der hinzugefügt werden soll
		int newSize = array.length + 1;
		int newValue = 6;

		// Neues Array mit geänderter Größe erstellen
		int[] newArray = new int[newSize];

		// Alte Elemente in das neue Array kopieren
		for (int i = 0; i < array.length; i++) {
			newArray[i] = array[i];
		}

		// Neuen Wert hinzufügen
		newArray[newSize - 1] = newValue;

		// Ausgabe des neuen Arrays
		System.out.println("Neues Array:          " + Arrays.toString(newArray));
	}
}
