package ContainerTerminal;

import java.util.Scanner;

// Klasse für die Simulation eines Containerterminals
public class ContainerTerminal {
    final int height; // Die feste Höhe des Krans
    Crane crane; // Der Kran im Containerterminal
    char[][] containers; // Ein 2D-Array zur Darstellung der Container im Terminal

    // Konstruktor für das Containerterminal
    public ContainerTerminal(int spalten, int zeilen) {
        this.height = spalten; // Setzt die Höhe des Krans
        this.containers = new char[spalten + 2][zeilen]; // Initialisiert das 2D-Array für die Container
        this.crane = new Crane(zeilen / 2); // Erstellt einen Kran in der Mitte des Terminals
        this.containers[0][crane.xPos] = crane.toChar(); // Setzt die Position des Krans im Terminal
    }

    // Methode zum Hinzufügen eines Containers auf einem bestimmten Stapel
    public void addContainer(int spalten) {
        if (spalten >= containers[0].length || spalten < 0)
            System.out.println("Diese Spalte existiert nicht");
        else {
            boolean added = false;
            for (int i = containers.length - 1; i > 1; i--) {
                if (containers[i][spalten] == '\0') {
                    containers[i][spalten] = '□';
                    added = true;
                    break;
                }
            }
            if (!added)
                System.out.println("Die angegebene Spalte enthält bereits die maximale Anzahl von Containern");
        }
    }

    // Methode zum Bewegen des Krans nach rechts
    public void moveCraneRight() {
        if (crane.xPos != this.containers[0].length - 1) {
            this.crane.xPos++;
            this.containers[0][crane.xPos] = crane.toChar();
            this.containers[0][crane.xPos - 1] = '\0';
            if (this.containers[1][crane.xPos - 1] != '\0') {
                this.containers[1][crane.xPos] = '□';
                this.containers[1][crane.xPos - 1] = '\0';
            }
        } else
            System.out.println("Der Kran kann nicht weiter nach rechts bewegt werden");
    }

    // Methode zum Bewegen des Krans nach links
    public void moveCraneLeft() {
        if (crane.xPos != 0) {
            this.crane.xPos--;
            this.containers[0][crane.xPos] = crane.toChar();
            this.containers[0][crane.xPos + 1] = '\0';
            if (this.containers[1][crane.xPos + 1] != '\0') {
                this.containers[1][crane.xPos] = '□';
                this.containers[1][crane.xPos + 1] = '\0';
            }
        } else
            System.out.println("Der Kran kann nicht weiter nach links bewegt werden");
    }

    // Methode zum Aufnehmen eines Containers durch den Kran
    public void pickUpContainer() {
        for (int i = 2; i < containers.length; i++) {
            if (this.containers[i][crane.xPos] == '□') {
                this.containers[i][crane.xPos] = '\0';
                this.containers[1][crane.xPos] = '□';
                break;
            }
        }
    }

    // Methode zum Absetzen eines Containers durch den Kran
    public void dropContainer() {
        if (this.containers[1][crane.xPos] != '\0') {
            if (this.containers[2][crane.xPos] == '□')
                System.out.println("Nicht genügend Platz, um den Container abzusetzen");
            else {
                for (int i = containers.length - 1; i > 1; i--) {
                    if (this.containers[i][crane.xPos] != '□') {
                        this.containers[1][crane.xPos] = '\0';
                        this.containers[i][crane.xPos] = '□';
                        break;
                    }
                }
            }
        } else
            System.out.println("Der Kran hat keinen Container aufgenommen");
    }

    // Methode zur Erzeugung einer textuellen Darstellung des Terminalzustands
    public String toString() {
        String result = "";
        for (char[] row : this.containers) {
            for (char c : row) {
                if (c != '\0')
                    result += c;
                else
                    result += ' ';
            }
            result += '\n';
        }
        return result;
    }

    // Methode zur Anzeige einer Legende und eines Menüs für die Benutzerinteraktion
    public void displayInfo() {
        System.out.println("Legende: " + "^: Kran | " + "□: Container");
        System.out.println("Menü: " + "W: Aufnehmen | " + "A: Links | " + "S: Ablegen | " + "D: Rechts | " + "X: Beenden");
    }

    // Die main-Methode zum Testen des Containerterminals und Interagieren mit dem Benutzer
    public static void main(String[] args) {
        ContainerTerminal ct = new ContainerTerminal(3, 5); // Erzeugt ein Containerterminal
        ct.addContainer(0); // Fügt einige Container hinzu
        ct.addContainer(1);
        ct.addContainer(1);
        ct.addContainer(2);
        ct.addContainer(3);
        ct.addContainer(3);
        ct.addContainer(3);
        ct.addContainer(4);
        ct.addContainer(4);

        Scanner sc = new Scanner(System.in);
        ct.displayInfo(); // Zeigt Legende und Menü an
        System.out.println(ct.toString()); // Zeigt den aktuellen Terminalzustand an

        // Endlosschleife für die Benutzerinteraktion
        while (true) {
            char input = sc.next().charAt(0); // Liest die Benutzereingabe ein
            if (input == 'W')
                ct.pickUpContainer(); // Nimmt einen Container auf
            else if (input == 'A')
                ct.moveCraneLeft(); // Bewegt den Kran nach links
            else if (input == 'D')
                ct.moveCraneRight(); // Bewegt den Kran nach rechts
            else if (input == 'S')
                ct.dropContainer(); // Setzt einen Container ab
            else if (input == 'X')
                break; // Beendet die Endlosschleife
            else {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine der angegebenen Optionen ein");

			}
			ct.displayInfo();
			System.out.println(ct.toString());

		}
		sc.close();

	}

}
