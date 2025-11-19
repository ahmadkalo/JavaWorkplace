package EinzelneAufgaben;

public class Kursschwankungen {

	public static int berechneScwankungen(int kauftag, int verkaufstag, int[] kursschwankungen) {
		int summe = 0;
		for (int i = kauftag; i < verkaufstag; i++) {
			summe += kursschwankungen[i];
		}

		return summe;
	}

	public static void main(String[] args) {
		int[] kursschwankungen = { 2, -4, 3, -1, 4, -1, 5, -9, 2, -6, 5, -3, 5 };

		int kauftag = 2;
		int verkaufstag = 7; //
		int ergebnis = berechneScwankungen(kauftag, verkaufstag, kursschwankungen);

		System.out.println("Wenn man am " + (kauftag + 1) + ". Tag gekauft und am " + verkaufstag
				+ ". Tag wieder verkauft hätte, hätte man einen Gewinn von " + ergebnis + "€");

	}

}
