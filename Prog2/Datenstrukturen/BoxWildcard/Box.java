package BoxWildcard;

public class Box<T> {

    private T inhalt;

    public T getInhalt() {
        return inhalt;
    }

    public void setInhalt(T inhalt) {
        this.inhalt = inhalt;
    }

    public static void main(String[] args) {
        Box<Integer> intBox = new Box<>();
        intBox.setInhalt(123);
        
        // Der folgende Kommentar erklärt, warum der Fehler nicht zur Compilezeit erkannt wird:
        // Die Verwendung eines "raw" Typs (also ohne generische Typangabe) in Java hebt die Typsicherheit auf.
        // Beim Kompilieren wird die Typinformation entfernt (Type Erasure), wodurch es möglich wird,
        // Objekte unterschiedlichen Typs in den generischen Container zu legen, ohne dass der Compiler dies bemerkt.
        // Deshalb kann der Compiler nicht verhindern, dass ein String in eine Box<Integer> gesetzt wird,
        // wenn eine rohe Typisierung (Box rawBox) verwendet wird.
        
        Box<?> rawBox = intBox; // Raw-Typ - verliert generische Typinformation
       // rawBox.setInhalt("Hallo"); // Hier wird ein String in eine Box<Integer> gesetzt
        
        Integer intValue = (Integer) rawBox.getInhalt(); // ClassCastException zur Laufzeit!
        System.out.println(intValue);
    }
}
