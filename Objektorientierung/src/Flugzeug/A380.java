package Flugzeug;

public class A380 extends Passagierflugzeug {

	private static int anzahl;

	public static int getAnzahl() {
		return anzahl;
	}

	public A380() {
		super(79.8, 558, 4 * 320);
		anzahl++;

	}

	public String toString() {

		return super.toString() + " A380";
	}

}
