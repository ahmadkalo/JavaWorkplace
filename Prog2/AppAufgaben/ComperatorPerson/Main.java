package ComperatorPerson;


import java.util.Arrays;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {

		Person[] family = new Person[] { new Person("Mandy", 39), new Person("Andy", 43), new Person("Candy", 21) };

		System.out.println("Vorher: " + Arrays.toString(family));

		
		@SuppressWarnings("unused")
        PersonComparatorNachAlter a = new PersonComparatorNachAlter(); // zu erwähnen
		sort(family, new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getAlter() - o2.getAlter();
			}
		});

		System.out.println("Nachher: " + Arrays.toString(family));

	}

	public static void sort(Person[] people, Comparator<Person> comparator) {
		for (int i = people.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (comparator.compare(people[j], people[j + 1]) > 0) {
					// Dreieckstausch
					Person temp = people[j];
					people[j] = people[j + 1];
					people[j + 1] = temp;
				}
			}
		}
	}
}