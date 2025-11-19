package RateDieNummer;

import java.util.Scanner;
import java.util.Random;

public class NummerRaten {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        int gerateneNummer = 0;
        int anzahlVersuche = 0;


        System.out.println("Willkommen zum Zahlenratespiel!");
        System.out.println("Ich habe mir eine Zahl zwischen 1 und 100 ausgedacht.");
        System.out.println("Kannst du sie erraten?");


        while (gerateneNummer != randomNumber) {
            System.out.print("Gib deine Schätzung ein: ");
            gerateneNummer = scanner.nextInt();
            anzahlVersuche++;

            if (gerateneNummer < randomNumber) {
                System.out.println("Niedrig! Versuch es noch einmal.");
            } else if (gerateneNummer > randomNumber) {
                System.out.println("Hoch! Versuch es noch einmal.");
            } else {
                System.out.println("Herzlichen Glückwunsch! Du hast die richtige Zahl erraten.");
                System.out.println("Du hast " + anzahlVersuche + " Versuche benötigt.");
            }
        }


        scanner.close();
    }
}

