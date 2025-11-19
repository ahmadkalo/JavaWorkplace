package Rechteck;

import java.util.Comparator;

public class ComparatorUmfang implements Comparator<Rechteck> {

	@Override
	public int compare(Rechteck o1, Rechteck o2) {
		if (o1.umfang() > o2.umfang()) {
			return 1;
		} else if (o1.umfang() < o2.umfang()) {
			return -1;
		} else {
			return 0;
		}

	}

}
