package Weg;


public class Weg {

	Punkt[] punkte;

	public Weg(int x, int y) {
		this.punkte = new Punkt[] { new Punkt(x, y) };
	}

	public int getAnzahl() {
		return punkte.length;
	}

	public void verlaengern(Weg w) {

		Punkt[] neuerWeg = new Punkt[this.getAnzahl() + w.getAnzahl()];
		int i = 0;

		// put points of original path in new array
		for (int j = 0; j < punkte.length; j++) {
			neuerWeg[i] = punkte[j];
			i++;
		}

		// put points of path "w" in new array
		for (int j = 0; j < w.punkte.length; j++) {
			neuerWeg[i] = w.punkte[j];
			i++;
		}

		this.punkte = neuerWeg;
	}

	public String toString() {
		String result = "";

		for (int i = 0; i < punkte.length; i++) {
			// add the point punkte[i] into result
			result += this.punkte[i].toString();

			// if punkte[i] is not the last point
			if (i + 1 != this.getAnzahl())
				result += "-";
		}

		return result;

	}
}
