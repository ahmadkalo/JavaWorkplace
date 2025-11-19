package Setzbar;

public class Kiste<T> implements Setzbar<T> {

	private T inhalt;

	public Kiste() {
		inhalt = null;
	}

	@Override
	public void set(T o) {
		this.inhalt = o;
	}

	@Override
	public T get() {
		return inhalt;
	}

	@Override
	public void reset() {
		inhalt = null;
	}

}