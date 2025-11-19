package StackKlausur;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<T> implements Iterable<T>{

	T[] field;
	int size = 0;

	@SuppressWarnings("unchecked")
	public Stack(int size) {
		this.field = (T[]) new Object[size];
	}

	public void push(T o) {
		field[size++] = o;
	}

	public T pull() {
		return field[--size];
	}

	public static void main(String[] args) {
		Stack<String> s = new Stack<>(20);
		s.push("Welt !");
		s.push(" ");
		s.push("Hallo ");
		
		// So
		Iterator<String> iter = s.iterator();
		while (iter.hasNext()) {
			System.out.print(iter.next());
		}
		// oder so 
		for(String i : s ) {
			System.out.print(i);
		}
	}

	@Override
	public Iterator<T> iterator() {
		
		return new StackIter();
	}

	
	public class StackIter implements Iterator<T> {

		int index;
		public StackIter() {
			index = size - 1;
		}
		
		
		@Override
		public boolean hasNext() {
			
			return index >= 0;
		}

		@Override
		public T next() {
			if(this.hasNext()) {
				return field[index--];
			} else { 
				throw new NoSuchElementException();
			}
			
		}
		
	}
}
