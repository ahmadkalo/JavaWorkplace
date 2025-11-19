package Übungen;
import java.util.Scanner;

public class AlterStrafe {

		@SuppressWarnings("resource")
		public static void main(String[] args) {
			
			int Alter;
			
			
			Scanner AlterSc = new Scanner(System.in);
			
			System.out.println("Geben Sie bitte Ihr Alter ein: ");
			Alter = AlterSc.nextInt();
			
			if(Alter >= 0) {
				System.out.println("Fehler, Sie müssen ein Alter als Zahl eingeben");
				
			} else if(Alter > 0 && Alter <= 14) {
				System.out.println("Sie sind strafunmüdig");
				
			} else if (Alter > 14 && Alter < 18) {
				
				System.out.println("Sie sind bedingt strafunmüdig");
			} else 
				
				System.out.println("Sie sind strafmüdig");
			
	}

}
