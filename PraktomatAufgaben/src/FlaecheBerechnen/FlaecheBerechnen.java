package FlaecheBerechnen;


public class FlaecheBerechnen {

	public static float flaecheBerechnen(float[][] coord) {
		float x1; // x_i
		float x2; // x_i+1
		float y1; // y_i
		float y2; // y_i+1

		int n = coord.length; // Anzahl der Eckpunkte
		float sum = 0; // Summe (Sigma)
		float flaeche;

		for (int i = 0; i < n; i++) {
			x1 = coord[i][0];
			x2 = coord[(i + 1) % n][0];

			y1 = coord[i][1];
			y2 = coord[(i + 1) % n][1];

			// {0, 0}, {1, 0}, {1, 1}, {0, 1}

			sum += (x1 + x2) * (y2 - y1);
		}

		flaeche = Math.abs(sum / 2); // Betrag ist dafür da, um die Zahl im positiven Bereich zu behalten

		return flaeche;
	}

	public static void main(String[] args) {

		float[][] beispiel1 = { { 0, 0 }, { 1, 0 }, { 1, 1 }, { 0, 1 } }; // Eckpunkte

		System.out.println(flaecheBerechnen(beispiel1));

	}

}

