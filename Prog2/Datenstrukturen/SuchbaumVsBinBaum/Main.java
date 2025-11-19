package SuchbaumVsBinBaum;

import java.util.Iterator;

public class Main {
	public static void main(String[] args) {
		SuchBaumMenge<Integer> a = new SuchBaumMenge<>();
		SuchBaumMenge<Integer> b = new SuchBaumMenge<>();

		int[] mengeA = { 25, 7, 2024, 23, 0, 47 };
		int[] mengeB = { 47, 11, 0, 8, 15 };

		for (int e : mengeA) {
			a.insert(e);
		}

		for (int e : mengeB) {
			b.insert(e);
		}
		
		System.out.println("Schnittmenge von a und b:" + MengeUtil.cut(a, b));
		System.out.println("MengeA sortiert nach Inoder: " + MengeUtil.sort(a));
		
		
		
		System.out.println("Menge a und b vor dem Mergen:");
		zeigeMengen(a, b);

		// Mergen der Mengen
		MengeUtil.merge(a, b);

		// Anzeigen der Mengen nach dem Mergen
		System.out.println("Menge a nach b dem Mergen:");
		zeigeMengen(a, b);
		
		
		
	}

	private static void zeigeMengen(SuchBaumMenge<Integer> a, SuchBaumMenge<Integer> b) {
		// Menge a mit BfsIterator anzeigen
		String summe = "";
		Iterator<Integer> baumIter = a.iterator();
		while (baumIter.hasNext()) {
			summe += baumIter.next() + " ";
		}
		System.out.println("Menge a mit BfsIterator: " + summe);
		// oder Bfs mit forEach
		System.out.print("Menge a Mit Bfs forEach: ");
		for (Integer val : a) {
			System.out.print(val + " ");
		}
		System.out.println();

		// Menge b mit BfsIterator anzeigen

		String summe1 = "";
		Iterator<Integer> baumIter1 = b.iterator();
		while (baumIter1.hasNext()) {
			summe1 += baumIter1.next() + " ";
		}
		System.out.println("Menge b mit BfsIterator: " + summe1);
		// oder Bfs mit forEach
		System.out.print("Menge b Mit Bfs forEach: ");
		for (Integer val : b) {
			System.out.print(val + " ");
		}
		System.out.println();
	}

}
