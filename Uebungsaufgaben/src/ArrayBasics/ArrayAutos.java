package ArrayBasics;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayAutos {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
	
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Wie viele Auto Marken sollen gespeichert werden?");
	int anzahlAutos = scanner.nextInt();
	
	String[] autoMarken = new String[anzahlAutos];
	System.out.println("Bitte " + anzahlAutos + " Automarken eingeben:" );
	
	for(int i = 0; i < anzahlAutos; i++) {
		autoMarken[i] = scanner.next();
		
		
	}
	
		System.out.println(Arrays.toString(autoMarken));


	}
	
}

		