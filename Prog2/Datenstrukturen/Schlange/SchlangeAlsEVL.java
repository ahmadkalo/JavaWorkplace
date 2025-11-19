package Schlange;

import java.util.Iterator;
import java.util.Queue;

import EVL.EVL;

public class SchlangeAlsEVL<T> implements Schlange<T> {

    private EVL<T> schlange;

    public SchlangeAlsEVL() {
        schlange = new EVL<T>();
    }

    @Override
    public int size() {
        return schlange.size();

    }

    @Override
    public boolean isEmpty() {
        return schlange.isEmpty();
    }

    @Override
    public void enqueue(T value) {
        schlange.append(value);
    }

    @Override
    public void dequeue() {
        schlange.removeFirst();

    }

    @Override
    public T front() {

        if (isEmpty()) {
            throw new IllegalStateException("Die Schlange ist leer");
        }
        return schlange.getFirst();
    }

    @Override
    public String toString() {
        return schlange.toString();
    }


    public static void main(String[] args) {

        SchlangeAlsEVL<Integer> ahmeeeed = new SchlangeAlsEVL<Integer>();
        ahmeeeed.enqueue(1);
        ahmeeeed.enqueue(2);
        ahmeeeed.enqueue(3);
        ahmeeeed.enqueue(4);

        ahmeeeed.dequeue();

        System.out.println(ahmeeeed.front());
        System.out.println(ahmeeeed);
        System.out.println(ahmeeeed.size());


    }

    @Override
    public Iterator<T> iterator() {

        return schlange.iterator();
    }

}
