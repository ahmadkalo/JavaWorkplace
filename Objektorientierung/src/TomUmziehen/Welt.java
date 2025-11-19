package TomUmziehen;
public class Welt {
	
	public static void main (String[] args) {
		
		Mensch Tom = new Mensch("Tom", 22, "Geothe Straße");  // Instanz
		
		Tom.umziehen("Wurzer Straße");
			
		System.out.println(Tom.name);
		System.out.println(Tom.age);
		System.out.println(Tom.adresse);
		
		
	}

}
