package SuchbaumVsBinBaum;

import DynArray.DynArray;
import Menge.Menge;


public class MengeUtil {

	public static <T> void merge(Menge<T> a, Menge<T> b) {

		for (T element : b) {

			if (!a.contains(element)) {

				a.insert(element);
			}
		}
	}

	public static <T extends Comparable<T>> Menge<T> cut(Menge<T> a, Menge<T> b) {
		SuchBaumMenge<T> schnittMenge = new SuchBaumMenge<>();

		for (T element : b) {
			if (a.contains(element)) {
				schnittMenge.insert(element);
			}
		}

		return schnittMenge;
	}

	public static <T extends Comparable<T>> DynArray<T> sort(Menge<T> menge) {
		
		SuchBaumMenge<T> baum = new SuchBaumMenge<>();
		for (T element : menge) {
			baum.insert(element);
		}

		
		return baum.inorder();
	}

}