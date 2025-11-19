package WürfelSpiele;

import java.util.Scanner;

public class TestSpiel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name des menschlichen Spielers: ");
        String name = scanner.nextLine();

        Spieler mensch = new Spieler(name);
        Spieler computer = new Spieler("Computer");

        // simples Spiel starten
       // Spiel.simplesSpiel(mensch, computer);

        // Beispiele für weitere Spiele:
         //Spiel.filzlaus(mensch, computer);
        // Spiel.sechserPasch(mensch, computer);
        Spiel.grosseHausnummer(mensch, computer);
    }
}
