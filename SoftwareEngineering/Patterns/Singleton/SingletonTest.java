package Singleton;

public class SingletonTest {

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
