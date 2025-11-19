package Flugzeug;

public class FlugzeugTest {

	/*
	 * der Zähler sollte objekt unabhängig sein, da es sonst für jedes Fahrzeug ein
	 * zähler entsehen kann, der nicht höher als eins gehen kann, also nur sich
	 * selber zählt. Wir brauchen also objektunabhänigien Zähler, klassenvariablen
	 * kommen immer mit "static"
	 * 
	 * für Klassenvariablen gibt es auch so eine Art Konstruktor, den nennt man den
	 * statischen Instialisier, der wird einmalig aufgerufen sobald man die Klasse
	 * benutzt
	 */

	public static void main(String[] args) {

		Segelflugzeug sf = new Segelflugzeug(17.0); // Sitz ist definiert also können wir das als Parameter nicht
													// bestimmen
		System.out.println(sf);

		Passagierflugzeug pg = new Passagierflugzeug(10.97, 4, 1.3);
		System.out.println(pg);

		A380 a380 = new A380();
		System.out.println(a380);

		System.out.println(Flugzeug.getAnzahl());
		System.out.println(Segelflugzeug.getAnzahl());
		System.out.println(Passagierflugzeug.getAnzahl());
		System.out.println(A380.getAnzahl());

	}

}
