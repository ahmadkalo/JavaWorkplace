package Singleton;

public class DatabaseConnection {
    private static DatabaseConnection instance;

    // Privater Konstruktor, um direkte Instanziierung zu verhindern
    private DatabaseConnection() {
        System.out.println("Verbindung zur Datenbank hergestellt!");
    }

    // Methode zur Rückgabe der einzigen Instanz
    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    // Beispielmethode zum Simulieren einer Datenbankabfrage
    public void query(String sql) {
        System.out.println("SQL Query ausgeführt: " + sql);
    }


}
