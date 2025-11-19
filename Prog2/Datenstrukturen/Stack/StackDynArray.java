package Stack;

import java.util.Iterator;
import java.util.NoSuchElementException;

import DynArray.DynArray;
import Schlange.Schlange;

public class StackDynArray<T> implements Stack<T>, Iterable<T> {

    DynArray<T> array;

    public StackDynArray() {
        this.array = new DynArray<T>();
    }

    @Override
    public void push(T value) {

        array.insert(value);
    }

    @Override
    public void pop() {

        array.remove(0);

    }

    @Override
    public T top() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        return array.get(0);
    }

    @Override
    public int size() {

        return array.size;
    }

    @Override
    public boolean isEmpty() {

        return array.isEmpty();
    }

    @Override
    public Iterator<T> iterator() {
        return array.iterator();
    }

    public static <T extends Comparable<T>> T getMin(Stack<T> e) {
        Iterator<T> iterator = e.iterator();
        T min = iterator.next();

        for (T tmp : e) {
            if (tmp.compareTo(min) < 0) {
                min = tmp;
            }
        }
        return min;
    }

    public static void main(String[] args) {

        Stack<Integer> stackArray = new StackDynArray<Integer>();

        stackArray.push(4);
        stackArray.push(3);
        stackArray.push(7);
        stackArray.push(1);
        stackArray.push(9);
        stackArray.push(5);


        for (Integer a : stackArray) {
            System.out.println(a);
        }

        System.out.println("Min: " + getMin(stackArray));

    }

}
