package ToDo;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
    private ArrayList<Task> tasks;
    private Scanner scanner;

    public TaskManager() {
        tasks = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;
        while (running) {
            printMenu();
            int choice = getValidInput(1, 5);

            switch (choice) {
                case 1:
                    addTask();
                    break;
                case 2:
                    markTaskAsCompleted();
                    break;
                case 3:
                    deleteTask();
                    break;
                case 4:
                    showTasks();
                    break;
                case 5:
                    running = false;
                    System.out.println("Programm wird beendet. Auf Wiedersehen!");
                    break;
            }
        }
        scanner.close();
    }

    private void printMenu() {
        System.out.println("\n=== Task Manager ===");
        System.out.println("1. Neue Aufgabe hinzufügen");
        System.out.println("2. Aufgabe als erledigt markieren");
        System.out.println("3. Aufgabe löschen");
        System.out.println("4. Alle Aufgaben anzeigen");
        System.out.println("5. Beenden");
        System.out.print("Bitte wählen Sie eine Option (1-5): ");
    }

    private int getValidInput(int min, int max) {
        int choice = -1;
        while (choice < min || choice > max) {
            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < min || choice > max) {
                    System.out.print("Bitte geben Sie eine Zahl zwischen " + min + " und " + max + " ein: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Ungültige Eingabe. Bitte geben Sie eine Zahl zwischen " + min + " und " + max + " ein: ");
            }
        }
        return choice;
    }

    private void addTask() {
        System.out.print("Geben Sie die neue Aufgabe ein: ");
        String description = scanner.nextLine().trim();
        if (!description.isEmpty()) {
            tasks.add(new Task(description));
            System.out.println("Aufgabe wurde hinzugefügt!");
        } else {
            System.out.println("Die Aufgabe darf nicht leer sein!");
        }
    }

    private void markTaskAsCompleted() {
        if (tasks.isEmpty()) {
            System.out.println("Keine Aufgaben vorhanden!");
            return;
        }

        showTasks();
        System.out.print("Welche Aufgabe möchten Sie als erledigt markieren? (1-" + tasks.size() + "): ");
        int index = getValidInput(1, tasks.size()) - 1;
        Task task = tasks.get(index);
        task.setCompleted(true);
        System.out.println("Aufgabe wurde als erledigt markiert!");
    }

    private void deleteTask() {
        if (tasks.isEmpty()) {
            System.out.println("Keine Aufgaben vorhanden!");
            return;
        }

        showTasks();
        System.out.print("Welche Aufgabe möchten Sie löschen? (1-" + tasks.size() + "): ");
        int index = getValidInput(1, tasks.size()) - 1;
        tasks.remove(index);
        System.out.println("Aufgabe wurde gelöscht!");
    }

    private void showTasks() {
        if (tasks.isEmpty()) {
            System.out.println("Keine Aufgaben vorhanden!");
            return;
        }

        System.out.println("\nAlle Aufgaben:");
        for (int i = 0; i < tasks.size(); i++) {
            Task task = tasks.get(i);
            System.out.printf("%d. %s [%s]%n",
                    i + 1,
                    task.getDescription(),
                    task.isCompleted() ? "Erledigt" : "Offen"
            );
        }
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.start();
    }
}

class Task {
    private String description;
    private boolean completed;

    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
}