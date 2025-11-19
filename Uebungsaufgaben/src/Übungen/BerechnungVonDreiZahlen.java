package Übungen;
import java.util.Scanner;

public class BerechnungVonDreiZahlen {
	
	public static void main(String[] args) {


	 Scanner scanner = new Scanner(System.in);

     System.out.println("Geben Sie drei ganze Zahlen ein:");
     int num1 = scanner.nextInt();
     int num2 = scanner.nextInt();
     int num3 = scanner.nextInt();

     int sum = num1 + num2 + num3;
     
     System.out.println("Die Summe der Zahlen ist: " + sum);
     scanner.close();
     
	}
	
}