package Übungen;
import java.util.Scanner;

public class BankKonto {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int kontostand = 500;
		int geheimCode = 2322;
		int eingabeCode;
		int nummerEingabe;
		int attempts = 0;

		Scanner KontoScanner = new Scanner(System.in);

		boolean weitererDurchlauf = true;
		while (weitererDurchlauf) {
			System.out.println("+------------------------------------------------------------------------------------------+");
			System.out.println(">> Bitte Wählen Sie: [Kontostand anzeigen], [Auszahlung], [Einzahlung], [Hilfe], [Ende], <<");
			String eingabe = KontoScanner.nextLine();

			
			if (eingabe.equalsIgnoreCase("Kontostand anzeigen")) {
				while (attempts < 3) {
					System.out.println("Bitte geben Sie Ihren Geheimcode an: ");
					eingabeCode = KontoScanner.nextInt();
					KontoScanner.nextLine(); 
					if (eingabeCode == geheimCode) {
						System.out.println("Ihr Kontostand lautet " + kontostand + "€");
						break;

					} else {
						attempts++;
						if (attempts == 3) {
							System.out.println("Sie haben dreimal einen falschen Geheimcode eingegeben. Das Programm wird beendet :(");
							weitererDurchlauf = false;

						} else {
							System.out.println("Der eigegebene Code ist leider unglütig, bitte versuchen Sie es erneut");
						}
					}
				}

			} else if (eingabe.equalsIgnoreCase("Auszahlung")) {
				while (attempts < 3) {
					System.out.println("Bitte geben Sie Ihren Geheimcode an: ");
					eingabeCode = KontoScanner.nextInt();
					KontoScanner.nextLine(); 
					if (eingabeCode == geheimCode) {
						System.out.println("Bitte geben Sie den Betrag an, den Sie auszahlen möchten");
						nummerEingabe = KontoScanner.nextInt();
						KontoScanner.nextLine(); 
						kontostand = kontostand - nummerEingabe;
						System.out.println("Auszahlung erfolgreich, Ihr Kontostand lautet jetzt: " + kontostand + "€");
						break;

					} else {
						attempts++;
						if (attempts == 3) {
							System.out.println("Sie haben dreimal einen falschen Geheimcode eingegeben. Das Programm wird beendet.");
							weitererDurchlauf = false;

						} else {
							System.out.println("Der eigegebene Code ist leider unglütig, bitte versuchen Sie es erneut");
						}
					}
				}

			} else if (eingabe.equalsIgnoreCase("Einzahlung")) {
				while (attempts < 3) {
					System.out.println("Bitte geben Sie Ihren Geheimcode an: ");
					eingabeCode = KontoScanner.nextInt();
					if (eingabeCode == geheimCode) {
						System.out.println("Bitte geben Sie den Betrag an, den Sie einzahlen möchten");
						nummerEingabe = KontoScanner.nextInt();
						kontostand = nummerEingabe + kontostand;
						System.out.println("Einzahlung erfolgreich, Ihr Kontostand lautet jetzt: " + kontostand + "€");
						break;
						
					} else {
						attempts++;
						if (attempts == 3) {
							System.out.println("Sie haben dreimal einen falschen Geheimcode eingegeben. Das Programm wird beendet.");
							weitererDurchlauf = false;

						} else {
							System.out.println("Der eigegebene Code ist leider unglütig, bitte versuchen Sie es erneut");
						}
					}
				}
			} else if (eingabe.equalsIgnoreCase("Hilfe")) {
				System.out.println("Bitte wenden Sie sich an einen Mitarbeiter in der Filiale");

				
			} else if (eingabe.equalsIgnoreCase("Ende")) {
				System.out.println("Möchten Sie das Programm wirklich beenden? false beendet das Programm (true/false)");
				weitererDurchlauf = KontoScanner.nextBoolean();
				KontoScanner.nextLine(); 
				if (weitererDurchlauf == false) {
					System.out.println("Programm beendet, ich wünsche Ihnen einen schönen Tag noch :)");
				}

				
			} else {
				System.out.println("Ungültige Eingabe, bitte halten Sie sich an die Eingaben");
				KontoScanner.nextLine(); 
			}
		}

		System.out.println("+-----------------------------------------------------------------------------------------------+");
	}

}