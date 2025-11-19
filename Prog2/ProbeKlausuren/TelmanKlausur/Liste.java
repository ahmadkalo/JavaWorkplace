package TelmanKlausur;

public class Liste<T> extends AListe<T> {
	E first = null;

	private class E { // Ein einzelnes Listenelement als private Klasse
		T value;
		E next;

		E(T v) {
			value = v;
			next = null;
		}
	}

	public Liste() {

	}

	@Override
	public void insert(T v) {
		E e = new E(v);
		e.next = first;
		first = e;
		size++;

	}

	@Override
	public T removeFirst() {
		if (null == first)
			return null;
		else {
			T v = first.value;
			first = first.next;
			size--;
			return v;
		}
	}

	@Override
	public void append(T v) {
		E e = new E(v);
		if (null == first) { // Liste ist noch leer
			first = e;
		} else {
			E tmp = first;
			while (null != tmp.next) {
				tmp = tmp.next;
			}
			tmp.next = e;
		}
		size++;

	}

	@Override
	public T removeLast() {
		// Entferne letzten Wert und liefere ihn zurück
		if (null == first)
			return null;
		else {
			if (null == first.next) { // nur ein Listenelement
				T v = first.value;
				first = null;
				size--;
				return v;
			} else {
				E tmp = first;
				E prev = null;
				while (null != tmp.next) {
					prev = tmp;
					tmp = tmp.next;
				}
				prev.next = null;
				size--;
				return tmp.value;
			}
		}
	}

	@Override
	public T get(int p) { // liefere Listenelement p zurück; erstes Element ist p = 0
		E tmp = first;
		while ((p-- > 0) && (null != tmp)) {
			tmp = tmp.next;
		}
		if (null != tmp)
			return tmp.value;
		else
			return null;
	}

	@Override
	public String toString() { // Print-Methode
		String s = "[";
		E tmp = first;
		while (null != tmp) {
			if (tmp == first)
				s += tmp.value;
			else

				s = s + "," + tmp.value;
			tmp = tmp.next;
		}
		s += "]";
		return s;
	}

	@Override
	public void extend(int n) { // Erweiterung der Liste um n Elemente
		
	}
	
	
}