package ObjektKiste;

public class ObjektKiste {

	private Object inhalt;

	public void set(Object o) {
		this.inhalt = o;
	}

	public Object get() {
		return inhalt;
	}

	public static void main(String[] args) {
		// Objekte der ObjektKiste-Klasse erstellen
		ObjektKiste kiste1 = new ObjektKiste();
		ObjektKiste kiste2 = new ObjektKiste();

		// Objekte setzen
		kiste1.set("Dies ist ein String");
		kiste2.set(42);

		// Objekte abrufen und ausgeben
		String stringObjekt = (String) kiste1.get();
		int intObjekt = (int) kiste2.get();

		System.out.println("Inhalt der ersten Kiste: " + stringObjekt);
		System.out.println("Inhalt der zweiten Kiste: " + intObjekt);
	}
}
