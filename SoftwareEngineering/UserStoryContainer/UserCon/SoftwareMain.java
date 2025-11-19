package UserCon;


import java.util.InputMismatchException;
import java.util.Scanner;


public class SoftwareMain {

    public static void main(String[] args) throws ContainerException, PersistenceException {

        Container container = Container.getInstance();
        PersistenceStrategyStream<UserStory> strategy = new PersistenceStrategyStream<>(); 
        container.setPersistenceStrategy(strategy);

        erstelleAnwendung(container);
    }

    private static void erstelleAnwendung(Container container) throws PersistenceException {
        Scanner scanner = new Scanner(System.in);
        boolean programmLaeuft = true;
        boolean enterLaeuft = true;

        while (programmLaeuft) {

            System.out.println("+-----------------------------------------------------------------------+");
            System.out.println("| --{ Folgende Befehle sind für Sie verfügbar }--                       |");
            System.out.println("| > 'enter' um eine User Story zu erstellen                             |");
            System.out.println("| > 'load' um gespeicherte User Stories zu laden (falls vorhanden)      |");
            System.out.println("| > 'store' um eine erstellte User Story persistent zu speichern        |");
            System.out.println("| > 'help' um alle möglichen Befehle zu zeigen                          |");
            System.out.println("| > 'exit' um die Anwendung zu verlassen                                |");
            System.out.println("+-----------------------------------------------------------------------+");

            System.out.print("> ");
            String befehl = scanner.nextLine();

            if (befehl.equals("exit")) {
                System.out.println("Programm wird beendet.");
                break;
            } else if (befehl.equals("store")) {
                System.out.println("Bitte erstellen Sie zuerst eine User Story, dafür geben Sie 'enter' ein!");
                continue;
            } else if (befehl.equals("help")) {
                System.out.println("Mögliche Befehle: enter, load, store, help, exit");
                continue;
            } else if (befehl.equals("load")) {
                container.load();
                container.dump();
                continue;
            } else if (befehl.equals("enter")) {

                while (enterLaeuft) {
                    try {
                        System.out.println("ID der User Story eingeben:");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Titel der User Story eingeben:");
                        String titel = scanner.nextLine();

                        System.out.println("Akzeptanzkriterium der User Story eingeben:");
                        String akzeptanzkriterium = scanner.nextLine();

                        System.out.println("Mehrwert der User Story eingeben:");
                        int mehrwert = scanner.nextInt();

                        System.out.println("Strafewert der User Story eingeben:");
                        int strafewert = scanner.nextInt();

                        System.out.println("Aufwandswert der User Story eingeben:");
                        int aufwandswert = scanner.nextInt();

                        System.out.println("Risikowert der User Story eingeben:");
                        int risikowert = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Epic der User Story eingeben:");
                        String epic = scanner.nextLine();


                        UserStory userStory = new UserStory(id, titel, akzeptanzkriterium, mehrwert, strafewert, aufwandswert, risikowert, epic);
                        container.addUserStory(userStory);
                        boolean userStoryDa = true;
                        while (userStoryDa) {
                            System.out.println("+-----------------------------------------------------------------------+");
                            System.out.println("| > 'store' um die erstellte User Story persistent zu speichern         |");
                            System.out.println("| > 'help' um alle möglichen Befehle zu zeigen                          |");
                            System.out.println("| > 'dump' um Ihre bisherige User Stories zu zeigen                     |");
                            System.out.println("| > 'exit' um die Anwendung zu verlassen                                |");
                            System.out.println("+-----------------------------------------------------------------------+");

                            System.out.print("> ");
                            String befehl2 = scanner.nextLine();

                            if (befehl2.equalsIgnoreCase("store")) {
                                container.store();
                                System.out.println("User Story erfolgreich gespeichert.");
                                System.out.println("Möchten Sie eine weitere User Story eingeben?");
                                System.out.println("> ja");
                                System.out.println("> nein");
                                System.out.print("> ");
                                String befehl3 = scanner.nextLine();
                                if (befehl3.equalsIgnoreCase("ja")) {
                                    break;
                                }
                            } else if (befehl2.equalsIgnoreCase("exit")) {
                                System.out.println("Programm wird beendet.");
                                programmLaeuft = false;
                                enterLaeuft = false;
                                userStoryDa = false;
                            } else if (befehl2.equalsIgnoreCase("help")) {
                                System.out.println("Mögliche Befehle: store, help, zeigen, exit");
                                continue;
                            } else if (befehl2.equalsIgnoreCase("dump")) {
                                container.dump();
                                continue;
                            } else {
                                System.out.println("Ungültiger Befehl. Versuchen Sie es erneut.");
                            }
                        }
                    } catch (PersistenceException e) {
                        System.err.println("Fehler beim Speichern: " + e.getMessage());
                    } catch (NumberFormatException e) {
                        System.err.println("Fehler: Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
                    } catch (KeineGueltigeUserStoryException e) {
                        System.err.println("Fehler: " + e.getMessage());
                    } catch (InputMismatchException e) {
                        System.err.println("Fehler: Ihre EIngabe ist keine Zahl, bitte geben Sie eine Zahl ein.");
                        scanner.nextLine();
                    } catch (ContainerException e) {
                        System.err.println("Fehler: " + e.getMessage());
                    }
                }
            } else {
                System.out.println("ungültige Eingabe versuchen Sie bitte erneut!");
                continue;
            }

        }

        if (!container.isEmpty()) {
            System.out.println("Möchten Sie eine Übersicht Ihrer User Stories zeigen?");
            System.out.println("> ja");
            System.out.println("> nein");
            System.out.print("> ");
            String befehl3 = scanner.nextLine();
            if (befehl3.equalsIgnoreCase("ja")) {
                System.out.println("Übersicht Ihrer User Stories:");
                container.dump();
            }

        } else {
            System.out.println("Vielen Dank für die Nutzung unserer Anwendung!");

        }
        scanner.close();
    }

}
