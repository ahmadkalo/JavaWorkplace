package Menge;

import java.util.Random;

public class MainTest {
	static Random r = new Random();

	public static void main(String[] args) {

		Lotto lottoZahlen = new Lotto();
		Lotto tippZahlen = new Lotto();

		einlesenTipps(tippZahlen);
		System.out.println("Zahlen für den Lottotipp: " + tippZahlen);

		ziehenLottoZahlen(lottoZahlen);
		System.out.println("Ziehen der Lottozahlen: " + lottoZahlen);

		bekanntMachungSortiert(lottoZahlen);
		System.out.println("Ziehen der Lottozahlen sortiert: " + lottoZahlen);

		System.out.println("Anzahl der Übereinstimmungen: " + bestimmungDerUebereinstimmungen(lottoZahlen, tippZahlen));
	}

	private static int bestimmungDerUebereinstimmungen(Menge lottoZahlen, Menge tippZahlen) {
		int anzahlDerRichtigen = 0;
		for (int i = 0; i < tippZahlen.size(); i++) {
			for (int j = 0; j < lottoZahlen.size(); j++) {
				if (tippZahlen.get(i) == lottoZahlen.get(j)) {
					anzahlDerRichtigen++;

				}
			}
		}
		return anzahlDerRichtigen;

	}

	public static Menge einlesenTipps(Menge tipp) {

		tipp.insert(7);
		tipp.insert(23);
		tipp.insert(40);
		tipp.insert(26);
		tipp.insert(18);
		tipp.insert(33);
		return tipp;
	}

	public static Menge ziehenLottoZahlen(Menge lottoZahlen) {

		lottoZahlen.insert(r.nextInt(49) + 1);
		lottoZahlen.insert(r.nextInt(49) + 1);
		lottoZahlen.insert(r.nextInt(49) + 1);
		lottoZahlen.insert(r.nextInt(49) + 1);
		lottoZahlen.insert(r.nextInt(49) + 1);
		lottoZahlen.insert(r.nextInt(49) + 1);

		return lottoZahlen;

	}

	public static Menge bekanntMachung() {
		return null;

	}

	public static void bekanntMachungSortiert(Menge sortiert) {
		for (int i = 1; i < sortiert.size(); i++) {
			int currentValue = sortiert.get(i);
			int previous = i - 1;
			while (previous >= 0 && sortiert.get(previous) > currentValue) {
				sortiert.set(previous + 1, sortiert.get(previous));
				previous--;
			}
			sortiert.set(previous + 1, currentValue);
		}
	}

}
