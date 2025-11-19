package EinzelneAufgaben;

public class Buehne {

	private double preis;
	private int verkauft;

	public Buehne(double preis, int verkauft) {

		this.preis = preis;
		this.verkauft = 0;
	}

	public void verkaufeTicket(int anzahl) {
		verkauft += anzahl;

	}
	public int anzVerkaufterTickets() {
		return this.verkauft;
	}
	
	public double gesamtEinkommen() {
		
		return verkauft*preis;
	}
	
	public static void main(String[] args) {
		Buehne a = new Buehne(2.4, 0);
		a.verkaufeTicket(4);
		
		System.out.println(a.gesamtEinkommen());
		
	}
}

// Speicherbild für die Objekte

// Buehne Objekt 1:

//   preis = 45.00 Euro          
//   verkauft = 2 Tickets          

//
// Buehne Objekt 2:

//   preis = 60.00 Euro            
//   verkauft = 3 Tickets          

//
// Gesamt:

// Gesamteinnahmen = 270.00 Euro  

