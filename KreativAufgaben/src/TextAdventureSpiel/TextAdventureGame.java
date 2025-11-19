package TextAdventureSpiel;

import java.util.Scanner;

public class TextAdventureGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Player player = new Player("Held", 100);
        boolean gameRunning = true;
        System.out.println("--------------------------------");
        System.out.println("Willkommen zum Abenteuer-Spiel!");
        System.out.println("Du bist ein Held in einem magischen Land.");

        while (gameRunning) {
            System.out.println("\nWas möchtest du tun?");
            System.out.println("1. Erkunden");
            System.out.println("2. Status anzeigen");
            System.out.println("3. Beenden");
            System.out.print("Wähle eine Option: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                explore(scanner, player);
            } else if (choice == 2) {
                player.showStatus();
            } else if (choice == 3) {
                gameRunning = false;
                System.out.println("Danke fürs Spielen!");
            } else {
                System.out.println("Ungültige Auswahl, bitte versuche es erneut.");
            }
        }

        scanner.close();
    }

    public static void explore(Scanner scanner, Player player) {
        System.out.println("---------------------------");
        System.out.println("\nDu erkundest die Gegend...");
        int event = (int) (Math.random() * 3);

        if (event == 0) {
            System.out.println("Du findest einen Heiltrank!");
            player.heal(20);
        } else if (event == 1) {
            System.out.println("Ein Monster greift an!");
            fightMonster(scanner, player);
        } else {
            System.out.println("Es ist nichts passiert.");
        }
    }

    public static void fightMonster(Scanner scanner, Player player) {
        int monsterHealth = 30;
        while (monsterHealth > 0 && player.getHealth() > 0) {

            System.out.println("Monster HP: " + monsterHealth);
            System.out.println("1. Angreifen");
            System.out.println("2. Fliehen");
            System.out.print("Wähle eine Option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            if (choice == 1) {
                int damageDealt = (int) (Math.random() * 10) + 5;
                int damageTaken = (int) (Math.random() * 10) + 5;
                System.out.println("Du greifst das Monster an und verursachst " + damageDealt + " Schaden!");
                monsterHealth -= damageDealt;
                if (monsterHealth > 0) {
                    System.out.println("Das Monster schlägt zurück und verursacht " + damageTaken + " Schaden!");
                    player.takeDamage(damageTaken);
                }
            } else if (choice == 2) {
                System.out.println("Du fliehst vor dem Kampf!");
                return;
            } else {
                System.out.println("Ungültige Auswahl, bitte versuche es erneut.");
            }
        }

        if (monsterHealth <= 0) {
            System.out.println("Du hast das Monster besiegt!");
        }

        if (player.getHealth() <= 0) {
            System.out.println("Du wurdest besiegt. Spiel vorbei.");
            System.exit(0);
        }
    }
}

class Player {
    private String name;
    private int health;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void showStatus() {
        System.out.println("Name: " + name);
        System.out.println("Gesundheit: " + health);
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public void heal(int amount) {
        health += amount;
        if (health > 100) {
            health = 100;
        }
        System.out.println("Du wurdest um " + amount + " Gesundheitspunkte geheilt.");
    }
}
