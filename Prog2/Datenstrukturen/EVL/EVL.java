package EVL;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class EVL<T> implements Iterable<T> {

	protected ListenElem first;
	protected ListenElem last;
	protected int size;

	public class ListenElem {
		public T value;
		public ListenElem next;

		public ListenElem(T v) {
			value = v;
			next = null;
		}
	}

	public EVL() {
		this.first = null;
		this.last = null;
		this.size = 0;
	}

	public int size() {
		return this.size;
	}

	public boolean isEmpty() {
		return (first == null);
	}

	public T getFirst() throws NoSuchElementException {
		if (first == null)
			throw new NoSuchElementException("Liste leer");
		return first.value;
	}

	public T getLast() throws NoSuchElementException {
		if (last == null)
			throw new NoSuchElementException("Liste leer");
		return last.value;
	}

	public void insert(T v) {
		ListenElem neu = new ListenElem(v);
		if (isEmpty()) {
			first = neu;
			last = neu;
		} else {
			neu.next = first;
			first = neu;
		}
		size++;
	}

	
	public void append(T v) {
		ListenElem neu = new ListenElem(v);
		if (isEmpty()) {
			first = last = neu;
			size++;
			return;
		}
		last.next = neu;
		last = neu;
		size++;
	}

	public void removeFirst() {
		if (!isEmpty()) {
			if (first == last) {
				first = null;
				last = null;
			} else {
				first = first.next;
			}
			size--;
		}
	}

	public void removeLast() {
		if (isEmpty())
			return;
		if (!isEmpty()) {
			if (first == last) {
				first = null;
				last = null;
			} else {
				ListenElem current = first;
				while (current.next != last) {
					current = current.next;
				}
				current.next = null;
				last = current;
			}
			size--;
		}
	}

	public void delete(T v) {
		if (isEmpty() || !contains(v))
			return;

		if (first.value.equals(v)) {
			removeFirst();
			return;
		}
		if (last.value.equals(v)) {
			removeLast();
			return;
		}

		ListenElem elem = first;
		while (elem.next != null && !elem.next.value.equals(v)) {
			elem = elem.next;
		}
		elem.next = elem.next.next;
		size--;
	}

	public boolean contains(T v) {
		ListenElem current = first;
		while (current != null) {
			if (current.value == v) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	@Override
	public String toString() {
		String s = "{";
		ListenElem tmp = first;
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


	@Override
	public Iterator<T> iterator() {
		return new EvlIterator();
	}

	class EvlIterator implements Iterator<T> {
		ListenElem cursor = first;

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
}
