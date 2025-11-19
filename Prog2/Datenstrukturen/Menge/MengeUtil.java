package Menge;

public class MengeUtil {
    // Statische Methode zum Verschmelzen von zwei Mengen
    public static <T> void merge(Menge<T> a, Menge<T> b) {
        // Solange Menge b nicht leer ist
        while (!b.isEmpty()) {
            // Holen Sie ein Element aus Menge b
            T element = b.get();
            // Überprüfen, ob das Element bereits in Menge a enthalten ist
            if (!a.contains(element)) {
                // Wenn das Element nicht in Menge a enthalten ist, fügen Sie es hinzu
                a.insert(element);
             // Löschen Sie das Element aus Menge b, da es bereits verschmolzen wurde
                b.delete(element);
            } else {
            	 b.delete(element);
            	
            }
            
           
        }
    }
}
