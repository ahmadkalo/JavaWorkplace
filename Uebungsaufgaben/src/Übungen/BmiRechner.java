package Übungen;
import java.util.Scanner;

public class BmiRechner {
	
	public static void main(String[] args) {
		
		double KörperGewicht;
		double Körpergröße;
		
		Scanner KörperGewichtSc = new Scanner(System.in);
		
		System.out.println("Geben Sie bitte das Körpergewicht ein: ");
		KörperGewicht = KörperGewichtSc.nextDouble();
		
		System.out.println("Geben Sie bitte die Körpergröße in Metern zum Quadrat ein: ");
		Körpergröße = KörperGewichtSc.nextDouble();
		
		
		
		System.out.println(KörperGewicht/(Körpergröße*Körpergröße));
		KörperGewichtSc.close();
	}

}
