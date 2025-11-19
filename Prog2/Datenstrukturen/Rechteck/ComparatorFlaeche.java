package Rechteck;

import java.util.Comparator;

public class ComparatorFlaeche implements Comparator<Rechteck> {

	@Override
	public int compare(Rechteck o1, Rechteck o2) {
		if (o1.fleache() > o2.fleache()) {
			return 1;
		} else if (o1.fleache() < o2.fleache()) {
			return -1;
		} else {
			return 0;
		}

	}

}
