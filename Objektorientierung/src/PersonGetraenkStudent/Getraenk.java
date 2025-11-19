package PersonGetraenkStudent;


public class Getraenk {
	
	/* Klassenmethoden */

	public static void main(String[] args) {
		
		Getraenk cola = new Getraenk("Cola", 200, 250, 0);
		Getraenk bier = new Getraenk("Bier", 200, 200, 16);
		Getraenk vodka = new Getraenk("Vodka", 20, 300, 18);
		
		System.out.println(cola.toString());
		System.out.println(bier.toString());
		System.out.println(vodka.toString());
		
	}

	/* Instanzvariablen */
	String name;
	int abgabeMengeProGlas;
	int preisInCent;
	int freigabealter;
	
	/* Konstruktor */
	public Getraenk(String name, int abgabeMengeProGlas, int preisInCent, int freigabealter) {
		
		this.name = name;
		this.abgabeMengeProGlas = abgabeMengeProGlas;
		this.preisInCent = preisInCent;
		this.freigabealter = freigabealter;
	}
	

	public String toString() {
	
	return "Name: " + this.name + ", Menge: " + this.abgabeMengeProGlas + ", Preis: "+ this.preisInCent + ", Altersfreigabe: " + this.freigabealter;
	} 
	
}
	
	

