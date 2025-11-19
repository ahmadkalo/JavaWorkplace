package EinfacheBoolescheOperation;

public class EinfacheBoolescheOperation {

	public static void main(String[] args) {
		boolean wert1 = true;
		boolean wert2 = false;
		boolean ergebnisA, ergebnisB, ergebnisC, ergebnisD;

		ergebnisA = (wert1 & wert2) | wert1;
		ergebnisB = (wert1 & wert2) | !wert1;
		ergebnisC = !((!wert1) & wert2);
		ergebnisD = !(((5 < 7) & wert1) || wert2);
		System.out.println("(wert1&wert2)|wert1=" + ergebnisA);
		System.out.println("(wert1&wert2)|!wert1=" + ergebnisB);
		System.out.println("!((!wert1)&wert2)=" + ergebnisC);
		System.out.println("!(((5<7)&wert1)||wert2)=" + ergebnisD);

	}
}
