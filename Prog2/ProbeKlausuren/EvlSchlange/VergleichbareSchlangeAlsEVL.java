package EvlSchlange;

public class VergleichbareSchlangeAlsEVL<T extends Comparable<T>> extends SchlangeAlsEVL<T>
	 implements Comparable<VergleichbareSchlangeAlsEVL<T>> {

	public int compareTo(VergleichbareSchlangeAlsEVL<T> vergleichsSchlange) {
		// Vergleiche Länge
		if (this.size() != vergleichsSchlange.size())
			return this.size() - vergleichsSchlange.size();
		// Vergleiche Elemente
		int returnValue;
		for (int pos = 0; pos < size(); pos++) {
			returnValue = get(pos).compareTo(vergleichsSchlange.get(pos));
			if (0 != returnValue)
				return returnValue;
		}
		// Schlangen sind gleich
		return 0;
	}
	
}