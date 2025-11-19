public class Test {

    public static void main(String[] args) {
        // Altsystem-Instanz erstellen
        Altsystem altsystem = new Altsystem();

        // Adapter mit Altsystem verbinden
        EditorInterface adapter = new Adapter(altsystem);

        // Editor mit Adapter verwenden
        Editor editor = new Editor(adapter);

        // Farbe erstellen
        Farbe rot = new Farbe("Rot");

        // Linie speichern (in Zentimetern)
        editor.saveLinie(rot, 15); // Sollte eine Ausgabe mit 150 mm erzeugen
    }

}
