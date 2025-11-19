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

    public static void main(String[] args) {


        // Singleton-Instanz abrufen
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        db1.query("SELECT * FROM users");

        // Eine weitere Instanz abrufen (es bleibt die gleiche)
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        db2.query("SELECT * FROM orders");

        // Überprüfung, dass beide Instanzen gleich sind
        System.out.println(db1 == db2); // Gibt "true" aus
    }
}
