package ObjektKiste;

public class Kiste<T> {

	private T inhalt;

	public Kiste(T inhalt) {
		inhalt = null;
	}

	public void set(T o) {
		this.inhalt = o;
	}

	public T get() {
		return inhalt;
	}

	public static void main(String[] args) {
		// Objekte der generischen Kiste-Klasse erstellen
		Kiste<String> kiste1 = new Kiste<>("Dies ist ein String");
		Kiste<Integer> kiste2 = new Kiste<>(42);

		// Objekte abrufen und ausgeben
		String stringObjekt = kiste1.get();
		int intObjekt = kiste2.get();

		System.out.println("Inhalt der ersten Kiste: " + stringObjekt);
		System.out.println("Inhalt der zweiten Kiste: " + intObjekt);
	}
}
