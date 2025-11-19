package Vektorwinkel;

public class Vektorwinkel {

	public static double winkel(double[] a, double[] b) {
		double sp = skalarprodukt(a, b);
		double normA = norm(a);
		double normB = norm(b);
		double cosWinkel = sp / (normA * normB);
		double winkel = Math.acos(cosWinkel);

		double grad = winkel * 180 / Math.PI;

		return grad;

	}

	public static double norm(double[] vector1) {
		double sp = 0.0;
		sp = skalarprodukt(vector1, vector1);

		return Math.sqrt(sp);
	}

	public static double skalarprodukt(double[] vector1, double[] vector2) {
		double vector1Komponent;
		double vector2Komponent;

		double summe = 0.0;

		for (int i = 0; i < vector1.length; i++) {
			vector1Komponent = vector1[i];
			vector2Komponent = vector2[i];
			summe = summe + vector1Komponent * vector2Komponent;

		}

		return summe;
	}

	public static void main(String[] args) {

		double[] a = { 1, 2 };
		double[] b = { 2, 1 };
		System.out.println(winkel(a, b));

	}

}
