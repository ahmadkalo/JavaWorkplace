package Schlange;

import java.util.Iterator;
import java.util.NoSuchElementException;

import Ringpuffer.RingpufferFIFO;

public class SchlangeAlsRingpuffer<T> implements Schlange<T> {

	RingpufferFIFO<T> ringpuffer;

	public SchlangeAlsRingpuffer(int capacity) {
		this.ringpuffer = new RingpufferFIFO<T>(capacity);
	}

	@Override
	public int size() {

		return ringpuffer.size();
	}

	@Override
	public boolean isEmpty() {

		return ringpuffer.isEmpty();
	}

	@Override
	public T front() {

		if (isEmpty()) {
			throw new IllegalStateException("Puffer ist leer");
		}
		return ringpuffer.get();
	}

	@Override
	public void enqueue(T e) throws IllegalStateException {
		ringpuffer.add(e);
	}

	@Override
	public void dequeue() throws NoSuchElementException {

		ringpuffer.remove();

	}

	@Override
	public String toString() {
		
		return ringpuffer.toString();
	}

	public static void main(String[] args) {
		SchlangeAlsRingpuffer<Integer> ringpuffer = new SchlangeAlsRingpuffer<Integer>(5);

		// Elemente hinzufügen
		ringpuffer.enqueue(1);
		ringpuffer.enqueue(2);
		ringpuffer.enqueue(3);
		ringpuffer.enqueue(4);
		ringpuffer.enqueue(5);
		
		ringpuffer.dequeue();
		
		System.out.println(ringpuffer);


	

	}

	@Override
	public Iterator<T> iterator() {
		
		return ringpuffer.iterator();
	}

}
