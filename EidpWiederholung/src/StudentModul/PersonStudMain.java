package StudentModul;

public class PersonStudMain {

    public static void main(String[] args) {
        // Studenten
        Student phil = new Student("Phil", 2000);
        Student susi = new Student("Susi", 1999);
        Student ahmed = new Student("Ahmed", 1998);

        // Module
        Modul mathe = new Modul("Dlma", 6, 2);
        Modul informatik = new Modul("Informatik", 6, 2); // Begrenzte Teilnehmerzahl für Test

        // Wie viele Studenten gibt es
        System.out.print("Anzahl der Studenten: ");
        System.out.println(Student.getAnzahlObjekte());

        // Aufnahme in Mathe Modul
        try {
            mathe.aufnehmen(phil);
            mathe.aufnehmen(susi);
       
        } catch (KeinPlatzMehrException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Liste der Studenten die Mathe schreiben");
        mathe.druckeTNListe();

        try {
            phil.belegen(informatik);
        } catch (KeinPlatzMehrException e) {
            System.out.println(e.getMessage());
        }

        try {
            susi.belegen(informatik);
        } catch (KeinPlatzMehrException e) {
            System.out.println(e.getMessage());
        }

        try {
            ahmed.belegen(informatik);
        } catch (KeinPlatzMehrException e) {
            System.out.println(e.getMessage());
        }

       

       

        
    }

}
