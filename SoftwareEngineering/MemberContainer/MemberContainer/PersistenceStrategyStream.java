package MemberContainer;
import java.io.*;
import java.util.List;

public class PersistenceStrategyStream<E> implements PersistenceStrategy<E> {

    private String location = "objects.ser";

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public void save(List<E> member) throws PersistenceException {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;

        try {
            File file = new File(location);
            if (file.isDirectory()) {
                throw new PersistenceException(PersistenceException.ExceptionType.ConnectionNotAvailable, "Verzeichnisse können nicht als Speicherort verwendet werden!");
            }

            // Ein FileOutputStream wird erstellt, um Bytes in die angegebene Datei zu schreiben.
           // Die Hauptaufgabe des FileOutputStream ist es also, eine Verbindung zur angegebenen Datei herzustellen,
            // sodass die Bytes dorthin geschrieben werden können.
            fos = new FileOutputStream(location);
            // Ein ObjectOutputStream wird über den FileOutputStream gelegt. Dieser ermöglicht es, Objekte
            // (in unserem Fall die Liste von Member-Objekten) in den Stream zu schreiben, indem sie serialisiert werden.
            // Die Serialisierung wandelt die Objekte in eine Abfolge von Bytes um, die dann in die Datei geschrieben werden.
            oos = new ObjectOutputStream(fos);
            //Die Methode writeObject() nimmt die Liste (die List<Member>) und zerlegt sie in eine
            // Byte-Repräsentation. Diese Byte-Darstellung wird durch den FileOutputStream in
            // die Datei geschrieben, sodass die Liste persistent gespeichert wird.
            oos.writeObject(member);

            // (Input/Output Exception) ist eine überprüfte Ausnahme in Java, die in Situationen auftritt,
            // in denen beim Lesen oder Schreiben von Daten ein Fehler auftritt

        } catch (IOException e) {
            throw new PersistenceException(PersistenceException.ExceptionType.ConnectionNotAvailable, "Fehler beim Speichern der Daten!");
        } finally {
            try {
                if (oos != null) {
                    oos.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                throw new PersistenceException(PersistenceException.ExceptionType.ConnectionNotAvailable, "Fehler beim Schließen des Streams!");
            }
        }
    }

    @Override
    public List<E> load() throws PersistenceException {
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        List<E> newListe = null;
        try {
            File file = new File(location);
            if (file.isDirectory()) {
                throw new PersistenceException(PersistenceException.ExceptionType.ConnectionNotAvailable, "Verzeichnisse können nicht geladen werden!");
            }
            // Ein neuer FileInputStream wird erstellt, um die Datei zu öffnen, die durch den Pfad location
            //  angegeben wird. Dieser Stream liest die Byte-Daten aus der Datei.
            fis = new FileInputStream(location);
            //Der ObjectInputStream wird mit dem FileInputStream verbunden,
            // um die Byte-Daten in Java-Objekte zu konvertieren.
            ois = new ObjectInputStream(fis);
            Object obj = ois.readObject();
           // Das gelesene Objekt wird überprüft, ob es eine Instanz von List<?> ist. Dies ist wichtig,
            // weil wir erwarten, dass das Objekt eine Liste von Membern ist.
            if (obj instanceof List<?>) {
                newListe = (List<E>) obj;
            } else {
                throw new PersistenceException(PersistenceException.ExceptionType.ConnectionNotAvailable, "Daten im falschen Format!");
            }
        } catch (IOException | ClassNotFoundException e) {
            throw new PersistenceException(PersistenceException.ExceptionType.ConnectionNotAvailable, "Fehler beim Laden der Daten!");
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (fis != null) {
                    fis.close();
                }
            } catch (IOException e) {
                throw new PersistenceException(PersistenceException.ExceptionType.ConnectionNotAvailable, "Fehler beim Schließen des Streams!");
            }
        }
        return newListe;
    }

}