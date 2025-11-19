package AllIteratorTest;

import java.util.Arrays;
import java.util.Iterator;

import DynArray.DynArray;
import EVL.EVL;
import Menge.Menge;
import Menge.MengeEVL;

public class IteratorTest {

	/* Klassenmethoden */

	public static void main(String[] args) {

		/* Variante 1: Array */

		int[] array = { 1, 2, 3 };

		zeigeMeinArray(array);
		System.out.println("------------------------------------------------");

		/* Variante 2: Dynamisches Array */

		DynArray<String> dynarr = new DynArray<String>();
		zeigeMeinDynArray(dynarr);
		System.out.println("------------------------------------------------");

		/* Variante 3: Verkettete Liste */

		EVL<Integer> list = new EVL<Integer>();
		zeigeMeineListe(list);
		System.out.println("---------------------------------------------------");

		/* Variante 4: Menge */

		Menge<Integer> menge = new MengeEVL<Integer>();
		zeigeMeineMenge(menge);
		System.out.println("---------------------------------------------------");
	}

	private static void zeigeMeineMenge(Menge<Integer> menge) {
		menge.insert(1);
		menge.insert(2);
		menge.insert(3);

		// while-Schleife
		String summe = "";
		while (!menge.isEmpty()) {
			int zahl = menge.get();
			summe += zahl;
			menge.delete(zahl); 
		
		}
		System.out.println("Summe mit Menge und while-Schleife: " + summe);

		menge.insert(1);
		menge.insert(2);
		menge.insert(3);

		// Iterator
		 summe = "";
		Iterator<Integer> mengeIter = menge.iterator();
		while (mengeIter.hasNext()) {
			summe += mengeIter.next() + " ";
		}
		System.out.println("Deine Menge mit Iterator: " + summe);

		// forEach-Schleife
		summe = "";
		for (Integer value : menge) {
			summe += value + " ";
		}
		System.out.println("Deine Menge mit forEach-Schleife: " + summe);
	}

	private static void zeigeMeineListe(EVL<Integer> list) {
		list.append(5);
		list.append(6);
		list.append(7);

		// while-Schleife
		String summe = "";
		while (!list.isEmpty()) {
			summe += list.getFirst() + " ";
			list.removeFirst(); // Achtung: Liste wird beim Durchlaufen geleert! Geht ohne Iterator leider nicht
								// anders :(
		}
		System.out.println("Deine verkettete Liste mit while-Schleife: " + summe);

		list.append(5);
		list.append(6);
		list.append(7);

		// forEach-Schleife
		summe = "";
		for (Integer value : list) {
			summe += value + " ";
		}
		System.out.println("Deine verkettete Liste mit forEach-Schleife: " + summe);

		// Iterator
		summe = "";
		Iterator<Integer> listIter = list.iterator();
		while (listIter.hasNext()) {
			summe += listIter.next() + " ";
		}
		System.out.println("Deine verkettete Liste mit  Iterator: " + summe);
	}

	private static void zeigeMeinDynArray(DynArray<String> dynarr) {
		dynarr.add("Ahmed");
		dynarr.add("Telman");
		dynarr.add("Delyar");

		// for-Schleife
		String summe = "";
		for (int i = 0; i < dynarr.size(); i++) {
			summe += dynarr.get(i) + " ";
		}
		System.out.println("Dein dynamisches Array mit for Schleife: " + summe);

		// Iterator
		summe = "";
		Iterator<String> dynarrIter = dynarr.iterator();
		while (dynarrIter.hasNext()) {
			summe += dynarrIter.next() + " ";
		}
		System.out.println("Dein dynamisches Array mit Iterator: " + summe);

		// forEach-Schleife
		summe = "";
		for (String value : dynarr) {
			summe += value + " ";
		}
		System.out.println("Dein dynamisches Array mit forEach Schleife: " + summe);
	}

	private static void zeigeMeinArray(int[] array) {
		// for-Schleife
		String summe = "";
		for (int i = 0; i < array.length; i++) {
			summe += array[i] + " ";

		}
		System.out.print("Dein Array mit for Schleife: " + summe);
		System.out.println();

		// Iterator
		summe = "";
		Iterator<Integer> arrayIterator = Arrays.stream(array).iterator();
		while (arrayIterator.hasNext()) {
			summe += arrayIterator.next() + " ";
		}
		System.out.print("Dein Array mit Iterator: " + summe);
		System.out.println();

		// forEach-Schleife
		summe = "";
		for (int value : array) {
			summe += value + " ";
		}
		System.out.println("Summe mit Array und forEach-Schleife: " + summe);
	}

}
