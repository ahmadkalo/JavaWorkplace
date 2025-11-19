package EvlSchlange;

import java.util.Comparator;

public class SchlangeComparatorLaenge implements Comparator<Schlange<Object>> {
// vergleiche zwei Schlangen anhand ihrer Länge
	@SuppressWarnings("rawtypes")
	@Override
	public int compare(Schlange s1, Schlange s2) {
		return s1.size() - s2.size();
	}
}
