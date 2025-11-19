package MittelErde;

public class Main {

	public static void main(String[] args) {

		Hobbit frodo = new Hobbit("Frodo", 94);
		Magier ahmed = new Magier("Ahmed", 2000);
		Hobbit sam = new Hobbit("Sam", 89);
		Wesen[] AnzahlVonWesen = { frodo, ahmed, sam };
		
		
		
		for (int i = 0; i < AnzahlVonWesen.length; i++) {
			status(AnzahlVonWesen[i]); 
		}
		
		
		frodo.wirdVerwundet(30);
		frodo.wirdVerwundet(140);
	
		ahmed.heilt(frodo);
		frodo.gruss();

		status(frodo);
		
		
	}

	public static void status(Wesen wesen) {
		System.out.println("-----------------------------------------------");
		System.out.println(wesen);
		

	}

}
