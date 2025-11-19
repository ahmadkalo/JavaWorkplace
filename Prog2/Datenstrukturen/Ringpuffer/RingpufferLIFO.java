package Ringpuffer;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RingpufferLIFO<T> extends Ringpuffer<T> {

	private T[] elements;
	private int p;

	@SuppressWarnings("unchecked")
	public RingpufferLIFO(int capacity) {
		super(capacity);
		this.elements = (T[]) new Object[capacity];
		p = 0;
	}

	

	@Override
	public T get() throws NoSuchElementException {
		if (isEmpty())
			throw new NoSuchElementException();

		return elements[(p + size - 1) % capacity];
	}

	@Override
	public void add(T e) {
		elements[(p + size) % capacity] = e;
		if (size < capacity) {
			size++;
		} else {
			p = (p + 1) % capacity;
		}
	}

	public void remove() {
		if (isEmpty())
			return;

		p = (p + 1) % capacity;
		size--;
	}

	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {

			private int i = 0;

			@Override
			public boolean hasNext() {
				return (i < size);
			}

			@Override
			public T next() {
				if (!hasNext())
					throw new NoSuchElementException();

				T wert = elements[(p - 1 + size() - i++) % capacity];
				return wert;
			}
		};
	}


	public static void main(String[] args) {
		RingpufferLIFO<Integer> ringpuffer = new RingpufferLIFO<Integer>(3);

		ringpuffer.add(18);
		System.out.println(ringpuffer);

		ringpuffer.add(72);
		System.out.println(ringpuffer);

		ringpuffer.add(35);
		System.out.println(ringpuffer);

		ringpuffer.remove();

		for (Integer e : ringpuffer) {
			System.out.print(e + " ");
		}

	}
}
