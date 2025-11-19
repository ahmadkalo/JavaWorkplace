package Composite;

public class CompositePatternExample {
    public static void main(String[] args) {
        // Einzelne Dateien
        File file1 = new File("Bild1.jpg");
        File file2 = new File("Bild2.jpg");
        File file3 = new File("Musik.mp3");
        File file4 = new File("Song.mp3");

        // Ordner erstellen
        Folder folder1 = new Folder("Bilder");
        Folder folder2 = new Folder("Musik");

        // Dateien zu Ordnern hinzufügen
        folder1.addComponent(file1);
        folder1.addComponent(file2);
        folder2.addComponent(file3);
        folder2.addComponent(file4);

        // Hauptordner erstellen
        Folder root = new Folder("Root");
        root.addComponent(folder1);
        root.addComponent(folder2);

        // Verzeichnisstruktur ausgeben
        root.showDetails();
    }
}
