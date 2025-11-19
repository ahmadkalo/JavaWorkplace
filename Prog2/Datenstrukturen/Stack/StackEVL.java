package Stack;

import EVL.EVL;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class StackEVL<T> implements Stack<T>, Iterable<T> {

    private EVL<T> evl;

    public StackEVL() {
        this.evl = new EVL<T>();
    }

    @Override
    public void push(T value) {
        evl.insert(value);
    }

    @Override
    public void pop() {
        try {

            evl.removeFirst();

        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Stack is empty");
        }
    }

    @Override
    public T top() {
        try {
            return evl.getFirst();
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException("Stack is empty");
        }
    }

    @Override
    public int size() {
        return evl.size();
    }

    @Override
    public boolean isEmpty() {
        return evl.isEmpty();
    }

    public static <T> Stack<T> umgekehrt(StackEVL<T> stack) {
        StackEVL<T> stack2 = new StackEVL<T>();

        while (!stack.isEmpty()) {

            stack2.push(stack.top());
            stack.pop();
        }

        return stack2;
    }

    public static <T extends Comparable<T>> void sortiereStack(Stack<T> stack) {
        Stack<T> st = new StackEVL<T>();

        while (!stack.isEmpty()) {
            T temp = stack.top();
            stack.pop();

            while (!st.isEmpty() && st.top().compareTo(temp) > 0) {
                stack.push(st.top());
                st.pop();
            }
            st.push(temp);
        }

        while (!st.isEmpty()) {
            stack.push(st.top());
            st.pop();
        }
    }


    public static <T> void frequency(Stack<T> a, T e) {
        int count = 0;
        for (T f : a) {
            if (f.equals(e)) {
                count++;
            }
        }
        System.out.println("Das Element " + e + " kommt " + count + " Mal vor");


    }


    public static <T extends Comparable<T>> void entferneElementeÜber(StackEVL<T> stack, T grenzwert) {
        StackEVL<T> hilfsStack = new StackEVL<T>();


        while (!stack.isEmpty()) {
            if (stack.top().compareTo(grenzwert) <= 0) {
                hilfsStack.push(stack.top());
            }
            stack.pop();
        }


        while (!hilfsStack.isEmpty()) {
            stack.push(hilfsStack.top());
            hilfsStack.pop();
        }
    }


    public static <T> StackEVL<T> mergeStacks(StackEVL<T> stack1, StackEVL<T> stack2) {
        StackEVL<T> mergedStack = new StackEVL<T>();


        for (T e : stack1) {
            mergedStack.push(e);

        }

        for (T e : stack2) {
            mergedStack.push(e);

        }

        return mergedStack;
    }

    public static <T> StackEVL<T> kopiereStack(StackEVL<T> original) {
        StackEVL<T> hilfsStack = new StackEVL<T>();
        StackEVL<T> kopie = new StackEVL<T>();

        for (T elem : original) {
            hilfsStack.push(elem);
        }

        while (!hilfsStack.isEmpty()) {
            kopie.push(hilfsStack.top());
            hilfsStack.pop();
        }

        return kopie;
    }


    public static <T extends Number> double berechneSumme(StackEVL<T> stack) {
        double summe = 0;


        for (T e : stack) {
            summe += e.doubleValue();

        }


        return summe;
    }

    @Override
    public String toString() {
        return evl.toString();
    }

    @Override
    public Iterator<T> iterator() {

        return evl.iterator();
    }

    public static void main(String[] args) {

        StackEVL<Integer> ahmed = new StackEVL<Integer>();

        ahmed.push(2);
        ahmed.push(1);
        ahmed.push(5);
        ahmed.push(5);
        ahmed.push(7);
        ahmed.push(4);


        StackEVL<Integer> telman = new StackEVL<Integer>();

        telman.push(2);
        telman.push(1);
        telman.push(5);
        telman.push(5);
        telman.push(7);
        telman.push(4);

        sortiereStack(ahmed);
        StackEVL<Integer> a = mergeStacks(ahmed, telman);
        System.out.println("Merged " + a);
        frequency(telman, 5);

        entferneElementeÜber(telman, 3);

        System.out.println(berechneSumme(telman));

        System.out.println();
        Iterator<Integer> stackIter = telman.iterator();
        while (stackIter.hasNext()) {
            System.out.print(stackIter.next() + " ");

        }

        Stack<Integer> s = umgekehrt(telman);
        System.out.println();
        System.out.println("Umgekehrt: " + s);

    }

}
