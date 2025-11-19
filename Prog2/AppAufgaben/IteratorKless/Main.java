package IteratorKless;

import java.util.Arrays;
import java.util.Iterator;


public class Main {

    /* Klassenmethoden */

    public static void main(String[] args) {

        int summe;

        /* Variante 1: Array */

        int[] array = {1,2,3};

        // for-Schleife
        summe = 0;
        for (int i = 0; i < array.length; i++) {
            summe += array[i];
        }
        System.out.println("Summe mit Array und for-Schleife: " + summe);

        // Iterator
        summe = 0;
        Iterator<Integer> arrayIterator = Arrays.stream(array).iterator();
        while (arrayIterator.hasNext()) {
            summe += arrayIterator.next();
        }
        System.out.println("Summe mit Array und Iterator: " + summe);

        // forEach-Schleife
        summe = 0;
        for (int value : array) {
            summe += value;
        }
        System.out.println("Summe mit Array und forEach-Schleife: " + summe);

        /* Variante 2: Dynamisches Array */

        DynArray<Integer> dynarr = new DynArray<>();
        dynarr.add(1);
        dynarr.add(2);
        dynarr.add(3);

        // for-Schleife
        summe = 0;
        for (int i = 0; i < dynarr.size(); i++) {
            summe += dynarr.get(i);
        }
        System.out.println("Summe mit dynamischen Array und for-Schleife: " + summe);

        // Iterator
        summe = 0;
        Iterator<Integer> dynarrIter = dynarr.iterator();
        while (dynarrIter.hasNext()) {
            summe += dynarrIter.next();
        }
        System.out.println("Summe mit dynamischen Array und Iterator: " + summe);

        // forEach-Schleife
        summe = 0;
        for (Integer value : dynarr) {
            summe += value;
        }
        System.out.println("Summe mit dynamischen Array und forEach-Schleife: " + summe);

        /* Variante 3: Verkettete Liste */

        EVL<Integer> list = new EVL<>();
        list.append(1);
        list.append(2);
        list.append(3);

        // while-Schleife
        summe = 0;
        while (!list.isEmpty()) {
            summe += list.getFirst();
            list.removeFirst();         // Achtung: Liste wird beim Durchlaufen geleert! Geht ohne Iterator leider nicht anders :(
        }
        System.out.println("Summe mit verketteter Liste und while-Schleife: " + summe);

        list.append(1);
        list.append(2);
        list.append(3);

        // Iterator
        summe = 0;
        Iterator<Integer> listIter = list.iterator();
        while (listIter.hasNext()) {
            summe += listIter.next();
        }
        System.out.println("Summe mit verketteter Liste und Iterator: " + summe);

        // forEach-Schleife
        summe = 0;
        for (Integer value : list) {
            summe += value;
        }
        System.out.println("Summe mit verketteter Liste und forEach-Schleife: " + summe);

        /* Variante 4: Menge */

        Menge<Integer> menge = new MengeEVL<>();
        menge.insert(1);
        menge.insert(2);
        menge.insert(3);

        // while-Schleife
        summe = 0;
        while (!menge.isEmpty()) {
            int zahl = menge.get();
            summe += zahl;
            menge.delete(zahl);     // Achtung: Menge wird beim Durchlaufen geleert! Geht ohne Iterator leider nicht anders :(
        }
        System.out.println("Summe mit Menge und while-Schleife: " + summe);

        menge.insert(1);
        menge.insert(2);
        menge.insert(3);

        // Iterator
        summe = 0;
        Iterator<Integer> mengeIter = menge.iterator();
        while (mengeIter.hasNext()) {
            summe += mengeIter.next();
        }
        System.out.println("Summe mit Menge und Iterator: " + summe);

        // forEach-Schleife
        summe = 0;
        for (Integer value : menge) {
            summe += value;
        }
        System.out.println("Summe mit Menge und forEach-Schleife: " + summe);
    }
}
