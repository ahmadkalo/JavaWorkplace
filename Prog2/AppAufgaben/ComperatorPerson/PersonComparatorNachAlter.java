package ComperatorPerson;


import java.util.Comparator;

public class PersonComparatorNachAlter implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getAlter() > o2.getAlter()) {
			return 1;

		} else if (o1.getAlter() < o2.getAlter()) {
			return -1;
		} else {
			return 0;
		}
	}
}