package IteratorWeil;

public class DynArray<T> {
	
	
	protected static int startGroesse = 2;
	
	protected T[] array;
	protected int size;

	
	@SuppressWarnings("unchecked")
	public DynArray() {
		array =  (T[]) new Object[startGroesse];
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public void set(int pos, T e) throws IndexOutOfBoundsException {
		if (pos < 0 || pos >= size) 
			throw new IndexOutOfBoundsException();
		array[pos]= e;
	}
	
	public T get(int pos) throws IndexOutOfBoundsException {
		if (pos < 0 || pos >= size) 
			throw new IndexOutOfBoundsException();
		return array[pos];
	}
	
	public void add(T e) {
		if(size >= array.length)
			increase();
		array[size++] = e;
	}
	
	public void remove(int pos) {
		if (pos < 0 || pos >= size) 
			return;
		for (int i = pos; i < size-1; i++)
			array[i] = array[i+1];
		size--;
		if (size <= array.length/4)
			decrease();
	}
	
	public void remove() {
		remove(0);
	}
	
	void delete(T e) {
		int pos = find(e);
		remove(pos);
	}
	
	public boolean contains(T e) {
		return (find(e) >= 0);
	}
	
	public String toString() {
		String  s = "";
		for (int i = 0; i < size; i++)
			s = s + array[i] + "\t";
		return s;
	}
	
	@SuppressWarnings("unchecked")
	private void increase() {
		T[] neu = (T[]) new Object[array.length*2];
		for (int i = 0; i < size; i++)
			neu[i] = array[i];
		array = neu;
	}
	
	@SuppressWarnings("unchecked")
	private void decrease() {
		if (array.length <= startGroesse)
			return;
		T[] neu = (T[]) new Object[array.length/2];
		for (int i = 0; i < size; i++)
			neu[i] = array[i];
		array = neu;
	}
	
	private int find(T e) {
		for(int i = 0; i < size; i++) {
			if (e.equals(array[i]))
				return i;
		}
		return -1;
	}
	
}
