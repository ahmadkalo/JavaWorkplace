package Übungen;
public class Geburtstagszähler {
	
	
	// Wie wählen eine for Schrleife, weil sie eine Zählerschleife ist 
	// Diese Schleife wird genau dann verwendet, wenn man ganz genau weiß, wie oft die Schleife durchlaufen soll
	
	
	public static void main(String[] args) {
	
	
		int ZielAlter = 17;
		int Tage = 365;
		int Gesamt = ZielAlter*Tage;
		
		for(int i = 0; i <= Gesamt; i++) {		
		
			if(i ==Gesamt)
			System.out.println("Seit meiner Geburt im Jahre 2001 sind bis zu meinem 17. Lebensjahr "+ i +" Tage vergangen");
			else
			System.out.println(i);
		
		}
		
	}
	
}