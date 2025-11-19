package EinzelneAufgaben;

public class Funktion {

	public int f(int x) {

		return 3 * x + 7;
	}

	public int g(int x, int y) {
		return 5 * x - 2 * y;
	}

	public int fg(int x, int y) {
		return f(g(x, y));
	}

	public static void main(String[] args) {

		Funktion Berechnung = new Funktion();

		int x = 1;
		int y = 4;

		int Ergebnis = Berechnung.fg(x, y);

		System.out.println("Das Ergebnis der Rechnung für x = " + x + " und y = " + y + " ist: " + Ergebnis);
	}

}
