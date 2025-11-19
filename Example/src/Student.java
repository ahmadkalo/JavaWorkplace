import java.util.Iterator;

public class Student implements Iterable<Student> {


    String vorname;
    String nachname;
    int matrikelnummer;
    Student[] studenten;

    public Student(String vorname, String nachname, int matrikelnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.matrikelnummer = matrikelnummer;
    }

    @Override
    public String toString() {
        return this.vorname + " " + this.nachname + " " + this.matrikelnummer;
    }

    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < studenten.length;
            }

            @Override
            public Student next() {
                return studenten[index++];
            }
        };
    }

    public static void main(String[] args) {
        Student telman = new Student("Telman", "Rustamov", 101);
        Student ahmed = new Student("Ahmed", "Kalo", 102);
        Student[] studenten = {telman, ahmed};

        for (Student student : studenten) {
            System.out.println(student);
        }


    }


}
