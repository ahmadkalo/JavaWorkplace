package Schlange;

import java.util.Iterator;
import java.util.NoSuchElementException;

import DynArray.DynArray;

public class SchlangeAlsArray<T> implements Schlange<T> {

    private DynArray<T> schlange;

    public SchlangeAlsArray() {
        schlange = new DynArray<T>();
    }

    public int size() {
        return schlange.size();

    }

    @Override
    public boolean isEmpty() {
        return schlange.isEmpty();
    }

    @Override
    public void enqueue(T value) {
        schlange.add(value);
    }

    @Override
    public void dequeue() {
        schlange.remove();

    }

    @Override
    public T front() {

        if (isEmpty()) {
            throw new IllegalStateException("Die Schlange ist leer");
        }
        return schlange.get(0);
    }

    @Override
    public String toString() {
        return schlange.toString();
    }

    @Override
    public Iterator<T> iterator() {

        return schlange.iterator();
    }

    public static <T> void frequency(Schlange<T> schlange, T elementToCount) {
        int count = 0;
      

        for (T e : schlange) {
            if (e.equals(elementToCount)) {
                count++;
            }
        }

        System.out.println("Das Element " + elementToCount + " kommt " + count + " Mal in der Schlange vor.");
    }


    public static <T extends Comparable<T>> Schlange<T> removeDuplicatesAhmed(Schlange<T> orginaleSchlange) {
        Schlange<T> neueSchlange = new SchlangeAlsArray<T>();
        DynArray<T> dynTemp = new DynArray<T>();

        for (int i = 0; i < orginaleSchlange.size(); i++) {
            boolean doppelt = false;
            T temp = orginaleSchlange.front();
            orginaleSchlange.dequeue();

            for (int j = 0; j < dynTemp.size(); j++) {
                if (temp.compareTo(dynTemp.get(j)) == 0) {
                    doppelt = true;
                    break;
                }

            }
            if (!doppelt) {
                neueSchlange.enqueue(temp);
                dynTemp.add(temp);
            }

            orginaleSchlange.enqueue(temp);
        }
        return neueSchlange;

    }


    public static <T extends Comparable<T>> T findMinMitSchlange(Schlange<T> e) {
        if (e.isEmpty()) {
            throw new NoSuchElementException();
        }
        T min = e.front();
        for (T tmp : e) {

            if (tmp.compareTo(min) < 0) {
                min = tmp;
            }
        }

        return min;
    }

    public static <T extends Comparable<T>> T findMaxMitSchlange(Schlange<T> e) {
        if (e.isEmpty()) {
            throw new NoSuchElementException();
        }
        T max = e.front();

        for (T tmp : e) {

            if (tmp.compareTo(max) > 0) {
                max = tmp;
            }
        }
        return max;
    }


    public static <T> Schlange<T> removeDuplicates(Schlange<T> schlange) {
        Schlange<T> ohneDuplikate = new SchlangeAlsArray<T>();

        for (T item : schlange) {
            if (!contains(ohneDuplikate, item)) {
                ohneDuplikate.enqueue(item);
            }
        }
        return ohneDuplikate;
    }

    public static <T> Schlange<T> findDuplicates(Schlange<T> schlange) {
        Schlange<T> duplicates = new SchlangeAlsArray<T>();
        Schlange<T> seen = new SchlangeAlsArray<T>();

        for (T item : schlange) {
            if (contains(seen, item) && !contains(duplicates, item)) {
                duplicates.enqueue(item);
            } else {
                seen.enqueue(item);
            }
        }
        return duplicates;
    }

    public static <T> boolean contains(Schlange<T> s, T comp) {



        for (T item : s) {
            if (item.equals(comp)) {
               return true;
            }

        }
        return false;

    }

    public static void main(String[] args) {

        Schlange<Integer> schlange = new SchlangeAlsArray<Integer>();
        schlange.enqueue(1);
        schlange.enqueue(1);
        schlange.enqueue(2);
        schlange.enqueue(3);
        schlange.enqueue(3);
        schlange.enqueue(5);
        schlange.enqueue(5);
        schlange.enqueue(5);
        schlange.enqueue(2);
        schlange.enqueue(5);


        System.out.println(schlange);
        System.out.println(schlange.front());
        System.out.println(schlange.size());

        frequency(schlange, 5);
        Schlange<Integer> a = findDuplicates(schlange);
        System.out.println("Elemente die Mehrmals auftauchen: " + a);

        Schlange<Integer> ohneDuplikate = removeDuplicates(schlange);

        System.out.println("Die Schlange ohne Duplikate:  " + ohneDuplikate);
        System.out.println("Der kleineste Wert in der Schlange: " + findMinMitSchlange(schlange));
        System.out.println("Der größte Wert in der Schlange: " + findMaxMitSchlange(schlange));
    }

}
