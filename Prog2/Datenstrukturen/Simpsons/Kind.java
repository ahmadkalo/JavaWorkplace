package Simpsons;

import Person.Person;

import Paar.Paar;

public class Kind extends Person {

	private Paar<Person, Person> eltern; // Eine private Instanzvariable vom Typ Paar mit zwei Person-Objekten als Typ

	public Kind(String name, int geburtsjahr) {
		super(name, geburtsjahr);
		this.eltern = null; // Zu Beginn hat das Kind keine Eltern
	}

	public void setEltern(Person vater, Person mutter) { // Methode zum Setzen der Eltern des Kindes
		this.eltern = new Paar<>(vater, mutter); // Erstelle ein neues Paar-Objekt mit Vater und Mutter und setze es als Eltern des Kindes

	}

	public Paar<Person, Person> getEltern() { // Methode zum Abrufen der Eltern des Kindes
		return eltern; // Gib das Paar-Objekt mit den Eltern zurück
	}

	public static boolean geschwister(Kind a, Kind b) { // Statische Methode zum Überprüfen, ob zwei Kinder Geschwister sind

		Paar<Person, Person> elternA = a.getEltern(); // Holen der Eltern des ersten Kindes
		Paar<Person, Person> elternB = b.getEltern(); // Holen der Eltern des zweiten Kindes
		return elternA.equals(elternB);  // Überprüfe, ob die Eltern gleich sind
	}

	public static void main(String[] args) {
		// Objekte erstellen für die erste Generation
		Person abe = new Person("Abe", 1925);
		Person mona = new Person("Mona", 1926);
		Person clancy = new Person("Clancy", 1929);
		Person jackie = new Person("Jackie", 1931);
		// Objekte erstellen für die zweite Generation
		Person herb = new Kind("Herb", 1960);
		Person homer = new Kind("Homer", 1970);
		Person marge = new Kind("Marge", 1972);
		Person selma = new Kind("Selma", 1960);
		Person patty = new Kind("Patty", 1957);
		// Objekte erstellen für die drite Generation
		Person bart = new Kind("Bart", 1980);
		Person lisa = new Kind("Lisa", 1982);
		Person maggie = new Kind("maggie", 2020);

		try {

			// Setzen der Eltern der zweiten Generation
			((Kind) herb).setEltern(abe, null);
			((Kind) homer).setEltern(abe, mona);
			((Kind) marge).setEltern(clancy, jackie);
			((Kind) selma).setEltern(clancy, jackie);
			((Kind) patty).setEltern(clancy, jackie);
			// Setzen der Eltern der dritten Generation
			((Kind) bart).setEltern(homer, marge);
			((Kind) lisa).setEltern(homer, marge);
			((Kind) maggie).setEltern(homer, marge);

			// Überprüfen, ob Herb und Homer Geschwister sind
			System.out.println("Herb und Abe sind Geschwister: " + Kind.geschwister((Kind) herb, (Kind) homer));

		} catch (EinElternTeilFehltException e) {
			System.out.println("Ein Elternteil fehlt");

			// Überprüfen, ob Bart und Lisa Geschwister sind
			System.out.println("Bart und Lisa sind Geschwister: " + Kind.geschwister((Kind) bart, (Kind) lisa));
			// Überprüfen, ob Lisa und Maggie Geschwister sind
			System.out.println("Lisa und Maggie sind Geschwister: " + Kind.geschwister((Kind) lisa, (Kind) maggie));
			// Überprüfen, ob Marge und Selma Geschwister sind
			System.out.println("Marge und Selma sind Geschwister: " + Kind.geschwister((Kind) marge, (Kind) selma));
			
			System.out.println(Kind.family((Kind) maggie));
			System.out.println(Kind.dAlter(Kind.family((Kind) bart)));
			
		

		}

	}

	public static Paar<Kind, Paar<Person, Person>> family(Kind kind) { // Methode zur Erstellung einer Familie
		return new Paar<>(kind, kind.getEltern());  // Gib ein Paar-Objekt zurück, das aus dem Kind und seinen Eltern besteht
	}

	public static int dAlter(Paar<Kind, Paar<Person, Person>> familie) { // Methode zur Berechnung des Altersunterschieds in der Familie
		int bartGeburtsjahr = familie.getErstes().getGeburtsjahr(); // Hole das Geburtsjahr von Bart
		int durchschnittsalter = (familie.getZweites().getErstes().getGeburtsjahr()
				+ familie.getZweites().getZweites().getGeburtsjahr()) / 2;// Berechne das Durchschnittsalter der Eltern
		return bartGeburtsjahr - durchschnittsalter;  // Berechne den Altersunterschied
	}
}
