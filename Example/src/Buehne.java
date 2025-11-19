
public class Buehne {
	
	private double preis;
	private int verkauft;
	
	public Buehne(double preis) {
	
		this.preis = preis;
		this.verkauft = 0;
	}
	
	public void verkaufeTickets(int anzahl) {
		verkauft+= anzahl;
		
	}
	
	public int anzahlVerkaufterTickets() {
		return this.verkauft;
	}
	
	public double gesamtEinnahmen() {
		return verkauft*preis;
	}
	
	public static void main(String[] args) {
		
		
		Buehne buehne1 = new Buehne(2.4);
		buehne1.verkaufeTickets(6);
		
		System.out.println(buehne1.anzahlVerkaufterTickets());
		System.out.println(buehne1.gesamtEinnahmen());
		
		
		
				
	}
	
	
	
	
	
	
}
