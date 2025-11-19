package Übungen;
import java.util.Scanner;

public class LoginAufgabe {

    public static void main(String[] args) {

        String username = "admin";
        String password = "123456";
        String enteredUsername, enteredPassword;
        int attempts = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte username eingeben: ");
        enteredUsername = scanner.next();

        if (enteredUsername.equals(username)) {
            while (attempts < 3) {
                System.out.println("Bitte password eingeben: ");
                enteredPassword = scanner.next();

                if (enteredPassword.equals(password)) {
                    System.out.println("Login erfolgreich");
                    break; // Beenden Sie die Schleife, wenn das Passwort korrekt ist
                } else {
                    attempts++;
                    System.out.println("Passwort nicht korrekt. Versuch " + (attempts + 1) + " von 3.");
                }
            }

            if (attempts == 3) {
                System.out.println("Sie haben dreimal falsch eingegeben. Das Programm wird beendet.");
            }
        } else {
            System.out.println("Username ist nicht vorhanden");
        }

        scanner.close();
    }
}
