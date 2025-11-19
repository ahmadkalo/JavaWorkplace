package PaarEVL;

public class Paar<T> {
	T erstes;
	T zweites;

	Paar(T e, T z) {
		erstes = e;
		zweites = z;
	}

	public T erstes() {
		return erstes;
	}

	public T zweites() {
		return zweites;
	}
}
