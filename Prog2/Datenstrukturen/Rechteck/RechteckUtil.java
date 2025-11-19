package Rechteck;

import java.util.Comparator;
import java.util.Iterator;

import Folge.Folge;
import Folge.FolgeAlsDynArray;

public class RechteckUtil {

	public static Rechteck min(Folge<Rechteck> f, Comparator<Rechteck> com) {
		if (f.isEmpty()) {
			return null;
		}

		Rechteck minRechteck = f.get(0);
		for (Rechteck r : f) {
			if (com.compare(r, minRechteck) < 0) {
				minRechteck = r;
			}
		}
		return minRechteck;
	}

	public static void main(String[] args) {

		Rechteck recht1 = new Rechteck(1.2, 1.2);
		Rechteck recht2 = new Rechteck(1.5, 0.4);
		Rechteck recht3 = new Rechteck(2.5, 0.2);

		System.out.println("Fläche: " + recht1.fleache() + " Umfang: " + recht1.umfang());
		System.out.println("Fläche: " + recht2.fleache() + " Umfang: " + recht2.umfang());
		System.out.println("Fläche: " + recht3.fleache() + " Umfang: " + recht3.umfang());
		System.out.println("*******************************************************");

		Folge<Rechteck> f = new FolgeAlsDynArray<Rechteck>();
		@SuppressWarnings("unused")
		ComparatorUmfang comparatorUmfang = new ComparatorUmfang();
		@SuppressWarnings("unused")
		ComparatorFlaeche comparatorFlaeche = new ComparatorFlaeche();

		f.insert(0, recht1);
		f.insert(1, recht2);
		f.insert(2, recht3);
		
		System.out.println("Methode 1, um zu iterieren");
		for (Rechteck i : f) {
			System.out.println(i);
		}
		
		System.out.println("Methode 2, um zu iterieren");
		Iterator<Rechteck> it = f.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}

		System.out.println("*******************************************************");
		Rechteck minUmfangRechteck = min(f, Rechteck.vergleichNachUmfang);
		System.out.println("Das kleinste Rechteck basierend auf den Umfang: " + minUmfangRechteck);

		Rechteck minFlaecheRechteck = min(f, Rechteck.vergleichNachFlaeche);
		System.out.println("Das kleinste Rechteck basierend auf die Fläche: " + minFlaecheRechteck);

	}

}
