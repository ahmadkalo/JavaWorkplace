package PersonException;


public class Main {

	
	public static void main(String[] args) {
	
		
	
	Person mika = new Person ("Mika");
	Person jona = new Person ("Jona");
	Person luka = new Person ("Luka");
	try {
	mika.schlafen();
	mika.heiraten(jona);
	mika.schlafen(luka);
	
	
		
	} catch (IllegalArgumentException e) {
		System.out.println("Hier ist ein Fehler aufgetreten" + e.getMessage());
		
	}
	
	catch (Exception e) {
		System.out.println("Wanung mit flascher Person geschlafen" + e.getMessage());
		
	}
	
	finally {
		System.out.println("Das was hier steht passiert immer");
	}
	
	
	}
}

