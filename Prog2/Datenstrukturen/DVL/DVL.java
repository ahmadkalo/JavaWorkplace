package DVL;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class DVL<T> implements Iterable<T> {

    DVLListenElem first;
    DVLListenElem last;
    int size;

    public class DVLListenElem {
        DVLListenElem prev;
        public T value;
        public DVLListenElem next;

        DVLListenElem(T v) {
            prev = null;
            value = v;
            next = null;
        }
    }

    public DVL() {
        last = null;
        first = null;
        size = 0;
    }

    @Override
    public Iterator<T> iterator() {
        return new DVLIterator();
    }

    class DVLIterator implements Iterator<T> {
        DVLListenElem cursor = first;

        @Override
        public boolean hasNext() {
            return cursor != null;
        }

        @Override
        public T next() {
            T value = cursor.value;
            cursor = cursor.next;
            return value;
        }
    }


    public int size() {
        return this.size;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insert(T v) {

        DVLListenElem neu = new DVLListenElem(v);

        if (isEmpty()) {
            last = neu;
            first = neu;
        } else {
            first.prev = neu;
            neu.next = first;
            first = neu;
        }
        size++;
    }

    public void append(T v) {

        DVLListenElem neu = new DVLListenElem(v);
        if (isEmpty()) {
            first = neu;
            last = neu;
        } else {
            last.next = neu;
            neu.prev = last;
            last = neu;
        }
        size++;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            last = null;
            first = null;
        } else {
            first = first.next;
            first.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = null;
            last = null;
        } else {
            last = last.prev;
            last.next = null;
        }
        size--;
    }

    public void delete(T v) {
        if (!isEmpty()) {
            if (first.value.equals(v)) {

                removeFirst();
                return;
            }

            DVLListenElem current = first;
            while (current.next != null && !current.next.value.equals(v)) {
                current = current.next;
            }
            if (current.next != null) {
                current.next = current.next.next;

                size--;
            }
        }
    }

    public boolean contains(T v) {
        DVLListenElem current = first;
        while (current != null) {
            if (current.value.equals(v)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public T getFirst() throws NoSuchElementException {
        if (first == null) {
            throw new NoSuchElementException("Liste leer");
        }
        return first.value;
    }

    public T getLast() throws NoSuchElementException {
        if (last == null) {
            throw new NoSuchElementException("Liste leer");
        }
        return last.value;
    }

    public void swap(T a, T b) {
        // Exception falls eins der Werte nicht enthalten ist
        if (!contains(a) || !contains(b)) {
            throw new NoSuchElementException("Tausch ist unmöglich, weil das zu tauschende Element nicht existiert");
        }

        // Suche nach a
        DVLListenElem current = first;
        while (current != null && !current.value.equals(a)) {
            current = current.next;
        }

        // current ist jetzt das Element a
        DVLListenElem knotenA = current;

        // Falls a und b benachbart sind
        if (knotenA.next != null && knotenA.next.value.equals(b)) {

            T temp = knotenA.value;
            knotenA.value = knotenA.next.value;
            knotenA.next.value = temp;
            return;
            // Falls a und b benachbart sind
        } else if (knotenA.prev != null && knotenA.prev.value.equals(b)) {

            T temp = knotenA.value;
            knotenA.value = knotenA.prev.value;
            knotenA.prev.value = temp;
            return;
        }

        // Suche nach b
        DVLListenElem current2 = first;
        while (current2 != null && !current2.value.equals(b)) {
            current2 = current2.next;
        }

        // current2 ist jetzt das Element b
        DVLListenElem KnotenB = current2;

        // Tausch der Werte
        T temp = knotenA.value;
        knotenA.value = KnotenB.value;
        KnotenB.value = temp;
    }

    public void addAfter(T a, T b) {
        // a nicht enthalten? → b vorne einfügen
        if (!contains(a)) {
            insert(b);
            return;
        }
        // ermittle Listenelement von a
       DVLListenElem la = first;
        while (!la.value.equals(a) && la.next != null) {
            la = la.next;
        }
        // a am Ende der Liste? → b hinten einfügen
        if (la.equals(last)) {
            append(b);
            return;
        }
        // erstelle Listenelement für b
        DVLListenElem lb = new DVLListenElem(b);
        // setze prev und next für lb
        lb.prev = la;
        lb.next = la.next;
        // setze next von la und prev vom Nachfolger von lb
        la.next = lb;
        lb.next.prev = lb;

    }


    public T getMiddle() {
        if (isEmpty()) {
            throw new NoSuchElementException("Liste leer");
        }
        DVLListenElem slow = first;
        DVLListenElem fast = first;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.value;
    }

    public static <T extends Comparable<T>> T getMin(DVL<T> a) {

        if (a.isEmpty()) {
            throw new NoSuchElementException("Liste leer");
        }
        T min = a.first.value;
        DVL<T>.DVLListenElem current = a.first;
        while (current.next != null) {
            if (current.value.compareTo(min) < 0) {
                min = current.value;
            }
            current = current.next;
        }

        return min;
    }

    public static <T extends Comparable<T>> T getMax(DVL<T> a) {

        if (a.isEmpty()) {
            throw new NoSuchElementException("Liste leer");
        }
        T max = a.first.value;
        DVL<T>.DVLListenElem current = a.first;
        while (current.next != null) {
            if (current.value.compareTo(max) > 0) {
                max = current.value;
            }
            current = current.next;
        }

        return max;
    }

    public void removeDublikates() {
        if (first == null) {
            return; // Die Liste ist leer, nichts zu tun
        }

        DVLListenElem current = first;
        while (current != null) {
            DVLListenElem runner = current.next;
            while (runner != null) {
                if (current.value.equals(runner.value)) {
                    // Duplikat gefunden, entfernen
                    if (runner.next != null) {
                        runner.next.prev = runner.prev;
                    } else {
                        last = runner.prev;
                    }
                    if (runner.prev != null) {
                        runner.prev.next = runner.next;
                    }
                    size--;
                }
                runner = runner.next;
            }
            current = current.next;
        }
    }

    public void reverse() {
        DVLListenElem current = first;
        DVLListenElem temp = null;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            first = temp.prev;
        }
    }

    public void merge(DVL<T> a, DVL<T> b) {
        if (a.isEmpty() && b.isEmpty()) {
            throw new NoSuchElementException("Liste leer");

        }
        if (a.isEmpty()) {
            a.first = b.first;
            a.last = b.last;
        } else if (b.isEmpty()) {
            b.first = a.first;
            b.last = a.last;

        } else {
            a.last.next = b.first;
            b.first.prev = a.last;
            a.last = b.last;


        }
        a.size += b.size;

    }


    public void replace(T oldValue, T newValue) {
        if (isEmpty()) {
            throw new NoSuchElementException("Element mit dem Wert " + oldValue + " wurde nicht gefunden");
        }
        DVLListenElem current = first;
        while (current != null) {
            if (current.value.equals(oldValue)) {
                current.value = newValue;
                return;
            }
            current = current.next;

        }
    }

    public void update(int pos, T newValue) {
        if (isEmpty()) {
            throw new NoSuchElementException("Liste leer");
        }
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Pos: " + pos + " Size: " + size);
        }
        DVLListenElem current = first;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        current.value = newValue;


    }


    @Override
    public String toString() {

        String s = "{";
        DVLListenElem tmp = first;
        if (tmp == null) {
            return "{}";
        }
        while (tmp != null) {
            s += tmp.value;
            if (tmp.next != null) {
                s += ", ";
            } else {
                s += "}";
            }
            tmp = tmp.next;
        }
        return s;
    }


    public static void main(String[] args) {
        DVL<Integer> list = new DVL<Integer>();

        list.append(7);
        list.append(3);
        list.append(22);
        list.append(24);
        list.append(5);
        list.append(5);

        DVL<Integer> list2 = new DVL<Integer>();
        list2.append(3);
        list2.append(5);
        list2.append(6);
        list2.append(6);
        list2.append(2);
        list2.append(1);

        list.merge(list, list2);
        list.removeDublikates();

        list.update(0, 2);
        list.replace(22, 23);

        for (Integer e : list) {
            System.out.print(e + " ");
        }
       // list.reverse();

        System.out.println();
        System.out.println("Minimum Element: " + getMin(list));
        System.out.println("Maximum Element: " + getMax(list));
        System.out.println("Mittleres Element: " + list.getMiddle());
        System.out.println("Reversed List: " + list);

    }


}