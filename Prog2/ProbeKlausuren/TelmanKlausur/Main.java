package TelmanKlausur;

public class Main {

	public static void main(String[] args) {
		
	Liste<Integer> liste = new Liste<>();
	liste.insert(1);
	liste.insert(2);
	liste.insert(3);
	liste.insert(4);
	
	liste.append(1);
	
	System.out.println(liste.get(1));
	
	System.out.println(liste);
		
	}
}
