package Bibliothek;

import Folge.Folge;
import Folge.FolgeAlsDynArray;
import Menge.Menge;

public class Main {

	public static void ausgeben(Bibliothek<?> bibliothek) { // er weiß nicht über den Typen aber er kann garanteiren
															// dass es von Typ Buch und Untertyp von Buch ist
		for (Buch b : bibliothek) {

			System.out.println(b);
		}
	}

	public static void hinzufuegen(Bibliothek<Buch> bibliothek, Menge<? extends Buch> menge) {
		for (Buch b : menge) {
			bibliothek.hinzufuegen(b);
		}
	}

	public static Folge<Buch> insertionSort(Bibliothek<?> bibliothek) {
		Folge<Buch> folge = new FolgeAlsDynArray<Buch>();

		for (Buch b : bibliothek) {
			for (int i = 0; i < folge.size(); i++) {
				if (b.compareTo(folge.get(i)) < 0) {
					folge.insert(i, b);
					break;

				}
			}
		}
		return folge;

	}

	public static void main(String[] args) {
		Autor autor1 = new Autor("George R. R. Martin");
		Autor autor2 = new Autor("Geothe");

		Buch buch1 = new Buch("Faust", autor2);
		Buch buch2 = new Buch("Dance of the Dragons", autor1);
		Buch buch3 = new Buch("A Song of Ice and Fire", autor1);

		Bibliothek<Buch> bibliothek = new Bibliothek<Buch>();
		
		bibliothek.hinzufuegen(buch1);
		bibliothek.hinzufuegen(buch2);
		bibliothek.hinzufuegen(buch3);

		
		System.out.println("Bücher in der Bibliothek:");
		ausgeben(bibliothek);

       }
	}
