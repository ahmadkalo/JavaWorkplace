package SchereSteinPapier;

import java.util.Scanner;
import java.util.Random;

public class SchereSteinPapier {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        Random random = new Random();


        System.out.println("Willkommen zu Schere, Stein, Papier!");


        String[] optionen = {"Schere", "Stein", "Papier"};


        while (true) {

            int computerChoice = random.nextInt(3);


            System.out.println("Gib deine Wahl ein (Schere, Stein, Papier): ");
            String spielersOption = scanner.nextLine();


            if (!spielersOption.equalsIgnoreCase("Schere") &&
                    !spielersOption.equalsIgnoreCase("Stein") &&
                    !spielersOption.equalsIgnoreCase("Papier")) {
                System.out.println("Ungültige Eingabe. Bitte wähle Schere, Stein oder Papier.");
                continue;
            }


            System.out.println("Deine Wahl: " + spielersOption);
            System.out.println("Computer wählt: " + optionen[computerChoice]);


            if (spielersOption.equalsIgnoreCase(optionen[computerChoice])) {
                System.out.println("Unentschieden!");
            } else if (spielersOption.equalsIgnoreCase("Schere") && optionen[computerChoice].equals("Papier") ||
                    spielersOption.equalsIgnoreCase("Stein") && optionen[computerChoice].equals("Schere") ||
                    spielersOption.equalsIgnoreCase("Papier") && optionen[computerChoice].equals("Stein")) {
                System.out.println("Du gewinnst!");
            } else {
                System.out.println("Computer gewinnt!");
            }

            System.out.println("Möchtest du nochmal spielen? (ja/nein)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equalsIgnoreCase("ja")) {
                break;
            }
        }

        System.out.println("Danke fürs Spielen!");

        scanner.close();
    }
}

