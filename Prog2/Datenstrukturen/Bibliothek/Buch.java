package Bibliothek;

public class Buch implements Comparable<Buch> {

    private String titel;
    private Autor autor;

    public Buch(String titel, Autor autor) {
        this.titel = titel;
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public Autor getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return titel + " von " + autor.toString();
    }

    @Override
    public int compareTo(Buch other) {
        return this.titel.equals(other.titel) ? this.autor.compareTo(other.autor) : titel.compareTo(other.titel);
    }
}

