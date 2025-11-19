package ComparableStud;

import java.util.Comparator;

import Menge.Menge;
import Menge.MengeDynArray;

public class StudUtil {

	public static Stud[] sort(Menge<Stud> m) {
		int size = m.size();
		Stud[] sortedArray = new Stud[size];

		for (int i = 0; i < size; i++) {
			sortedArray[i] = m.get();
			m.delete(sortedArray[i]);
		}

		// Insertion sort algorithm
		for (int i = 1; i < size; i++) {
			Stud currentValue = sortedArray[i];
			int j = i - 1;

			while (j >= 0 && sortedArray[j].compareTo(currentValue) > 0) {
				sortedArray[j + 1] = sortedArray[j];
				j = j - 1;
			}
			sortedArray[j + 1] = currentValue;
		}

		return sortedArray;
	}

	public static void main(String[] args) {
		Stud a = new Stud("Anna");
		Stud b = new Stud("Benjamin");
		Stud c = new Stud("Carlos");
		Stud d = new Stud("Dora");

		@SuppressWarnings("unused")
		Comparator<Stud> com = (Stud o1, Stud o2) -> {
			if (o1.getMatNr() > o2.getMatNr()) {
				return 1;

			} else if (o1.getMatNr() < o2.getMatNr()) {
				return -1;

			} else {
				return 0;
			}

		};

		Menge<Stud> m = new MengeDynArray<Stud>();
		m.insert(c);
		m.insert(d);
		m.insert(a);
		m.insert(b);
		System.out.println("Menge unsortiert:");
		m.show();
		System.out.println("Menge bzw. Array sortiert:");

		Stud[] arr = sort(m);

		for (Stud s : arr) {
			System.out.print(s + " ");
		}

	}
}