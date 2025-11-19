package Ringpuffer;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RingpufferFIFO<T> extends Ringpuffer<T> {

	private  T[] arr;
	private int p; 
	

	
		@SuppressWarnings("unchecked")
		public RingpufferFIFO(int c) {
			super(c);
			this.arr = (T[]) new  Object[c];
			p = 0;
		}

	@Override
	public Iterator<T> iterator() {
		return new RPIterator();
	}
	
	class RPIterator implements Iterator<T> {
	
		int i = 0;
		
		@Override
		public boolean hasNext() {
			return (i < size);
		}

		@Override
		public T next() {
			return arr[(p + i++) % capacity];
		}
	}

	@Override
	public T get() throws NoSuchElementException {
		
		if(size() == 0) 
			throw new NoSuchElementException();
		return arr[p];
	}

	@Override
	public void add(T e) throws IllegalStateException {
		// Exception bei vollem Puffer
		if (size >= capacity)
			throw new IllegalStateException("Puffer voll");
		
		// "hinten" anhängen
		int pos = (p + size) % capacity;
		arr[pos] = e;
		size++;
	}

	public void remove() {
		// entfernt den ältesten Eintrag
		if (size > 0) {
			p = (p+1) % capacity;
			size--;
		}
	}
	
	public void showArr() {
		String s = "";
		for (int i = 0; i < arr.length; i++)
			s = s + arr[i]+ " ";
		s = s+ "\tp: " + p + "\tsize: " + size; 
		System.out.println(s);
	}
	
	/*
	@Override
	public String toString() {
		String s = "";
		for(int i = 0; i < arr.length; i++) {
			
		 
		s += "arr["+i+"]: " + arr[i] + "    |   " ;
		}
		return s;
	}
	
	@Override
	public String toString() {
		String s = "";
		for (int i = 0; i < size; i++) {
			if (i > 0) {
				s += " ";
			}
			s += arr[(p + i) % capacity];
		}
		s += "\tp: " + p + "\tsize: " + size;
		return s;
	}
	 */ 
	
	public static void main(String[] args) {
		RingpufferFIFO<Integer> ringpuffer = new RingpufferFIFO<Integer>(4);

		ringpuffer.add(18);
		System.out.println(ringpuffer );

		ringpuffer.add(72);
		System.out.println(ringpuffer);

		ringpuffer.add(35);
		System.out.println(ringpuffer);

		ringpuffer.remove();
		System.out.println(ringpuffer);

		ringpuffer.remove();
		System.out.println(ringpuffer);

		ringpuffer.add(41);
		System.out.println(ringpuffer);

		ringpuffer.add(25);
		System.out.println(ringpuffer);

		ringpuffer.add(42);
		System.out.println(ringpuffer);
		
		ringpuffer.remove();
		System.out.println(ringpuffer);
		
		ringpuffer.showArr();	}
}