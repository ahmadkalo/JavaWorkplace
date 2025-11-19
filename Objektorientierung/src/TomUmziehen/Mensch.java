package TomUmziehen;

public class Mensch {
	
	String name;
	int age;
	String adresse;
	
	public Mensch(String name, int age, String adresse) {
		
		this.name = name;
		this.age = age;
		this.adresse = adresse;
		
	}
	public void umziehen(String neueAdresse) {
		
		adresse = neueAdresse;
		
	}
	

}
