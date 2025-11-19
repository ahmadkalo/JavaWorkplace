package PaarEVL;


public class EVL<T> {
	private class Item {
		T element;
		Item next;
		

		public Item(T e) {
			element = e;
			next = null;
		}
	}

	private Item first = null;

	public void append(T v) {
		Item neu = new Item(v);
		if (first == null) {
			// Wenn die Liste leer ist, wird das neue Element sowohl das erste als auch das
			// letzte Element
			first = neu;
			return;

		}
		Item current = first;
		while (null != current.next) {
			current = current.next;
		}
		current.next = neu;
	
	}

	public T get(int p) {
		Item tmp = first;
		while ((tmp != null) && (p > 0))
			tmp = tmp.next;
		if (null != tmp)
			return tmp.element;
		else
			return null;
	}

	public static <U> EVL<Paar<U>> paarliste(EVL<U> l1, EVL<U> l2) {
		EVL<Paar<U>> l3 = new EVL<>();
		int pos = 0;
		U e1 = l1.get(pos);
		U e2 = l2.get(pos);
		while ((null != e1) && (null != e2)) {
			l3.append(new Paar<U>(e1, e2));
			pos++;
			e1 = l1.get(pos);

			e2 = l2.get(pos);
		}
		return l3;
	}
	
	
	
	public static void main(String[] args) {
		EVL<String> ahmed = new EVL<>();
		ahmed.append("Ahmed");
		ahmed.append("Delyar");
		
		System.out.println(ahmed);
		
	}

}
