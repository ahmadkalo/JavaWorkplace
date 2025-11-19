package DynArray;

import java.util.Iterator;

public class DynArray<T> implements Iterable<T> {

    private static int startGroesse = 2;

    private T[] array;
    public int size;

    @SuppressWarnings("unchecked")
    public DynArray() {
        array = (T[]) new Object[startGroesse];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() { // O(1)
        return size == 0;
    }

    public void set(int pos, T e) throws IndexOutOfBoundsException {
        if (pos < 0 || pos >= size)
            throw new IndexOutOfBoundsException("Position darf nicht görßer als die Anzahl der Elemente sein");
        array[pos] = e;
    }

    public T get(int pos) throws IndexOutOfBoundsException {
        if (pos < 0 || pos > size)
            throw new IndexOutOfBoundsException();
        return array[pos];
    }

    public void add(T e) {
        if (size >= array.length)
            increase();
        array[size++] = e;
    }

    public void insert(T e) {
        if (size >= array.length)
            increase();
        @SuppressWarnings("unchecked")
        T[] neu = (T[]) new Object[size + 1];
        neu[0] = e;
        for (int i = 0; i < size; i++) {
            neu[i + 1] = array[i];

        }
        array = neu;
        size++;

    }

    public String toString() {
        String s = ""; // O(n)
        for (int i = 0; i < size; i++)
            s = s + array[i] + " ";
        return s;
    }

    @SuppressWarnings("unchecked")
    public void increase() { // O(n)
        T[] neu = (T[]) new Object[array.length * 2];
        for (int i = 0; i < size; i++)
            neu[i] = array[i];
        array = neu;
    }

    public void remove(int pos) throws IndexOutOfBoundsException {
        if (pos < 0 || pos > size)
            throw new IndexOutOfBoundsException();
        for (int i = pos; i < size - 1; i++) {
            array[i] = array[i + 1]; // O(n)
        }
        array[size - 1] = null;
        size--;
    }

    public void remove() {
        if (isEmpty())
            return;
        for (int i = 0; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null;
        size--;
    }

    public boolean contains(T e) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(e)) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public void decrease() { // O(n)
        if (array.length <= startGroesse || size * 4 > array.length)
            return;
        T[] neu = (T[]) new Object[array.length / 2];
        for (int i = 0; i < size; i++)
            neu[i] = array[i];
        array = neu;
    }

    public void delete(T e) {
        for (int i = 0; i < size; i++) {
            if (array[i] == e) {
                for (int j = i; j < size - 1; j++) {
                    array[j] = array[j + 1];
                }
                array[size - 1] = null;
                size--;
                return;
            }
        }
    }


    public void show() {
        System.out.println("Size   " + "Length\t Array-Inhalt");
        System.out.print(size + "\t" + array.length + "\t");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]); // O(n)
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }


    public void reverse() {
        @SuppressWarnings("unchecked")
		T[] newArray = (T[]) new Object[array.length];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[size - 1 - i];
        }
       array = newArray;

    }


    @Override
    public Iterator<T> iterator() {

        return new DynArrayIterator();
    }

    public class DynArrayIterator implements Iterator<T> {
        int index = 0;

        @Override
        public boolean hasNext() {

            return index < size();
        }

        @Override
        public T next() {

            return array[index++];
        }

    }


}
