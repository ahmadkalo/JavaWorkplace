package SuchbaumVsBinBaum;

import java.util.Iterator;
import DynArray.DynArray;
import Schlange.Schlange;
import Schlange.SchlangeAlsArray;


public class BinBaum<T> implements Iterable<T> {

	class Knoten {
		protected T value;
		protected Knoten links;
		protected Knoten rechts;

		public Knoten(T v) {
			value = v;
			links = null;
			rechts = null;
		}
	}

	Knoten root;

	public BinBaum(Knoten links, T v, Knoten rechts) {
		root = new Knoten(v);
		root.links = links;
		root.rechts = rechts;
	}

	public BinBaum(T v) {
		this(null, v, null);
	}

	public BinBaum() {
		root = null;
	}


	public int size() {
		return size(root);
	}

	private int size(Knoten k) {
		if (k == null) {
			return 0;
		}
		return 1 + size(k.links) + size(k.rechts);
	}

	public boolean isEmpty() {
		return root == null;
	}


	public DynArray<T> inorder() {
		return inorder(root);
	}

	private DynArray<T> inorder(Knoten k) {
		DynArray<T> arr = new DynArray<T>();
		if (k == null) {
			return arr;
		}

		DynArray<T> links = inorder(k.links);
		DynArray<T> rechts = inorder(k.rechts);

		for (T v : links) {
			arr.add(v);
		}

		arr.add(k.value);

		for (T v : rechts) {
			arr.add(v);
		}

		return arr;
	}

	public DynArray<T> postorder() {
		return postorder(root);
	}

	private DynArray<T> postorder(Knoten k) {
		DynArray<T> arr = new DynArray<T>();
		if (k == null) {
			return arr;
		}

		DynArray<T> links = postorder(k.links);
		DynArray<T> rechts = postorder(k.rechts);

		for (T v : links) {
			arr.add(v);
		}

		for (T v : rechts) {
			arr.add(v);
		}

		arr.add(k.value);

		return arr;
	}

	public DynArray<T> preorder() {
		return preorder(root);
	}

	private DynArray<T> preorder(Knoten k) {
		DynArray<T> arr = new DynArray<T>();
		if (k == null) {
			return arr;
		}

		DynArray<T> links = preorder(k.links);
		DynArray<T> rechts = preorder(k.rechts);

		arr.add(k.value);

		for (T v : links) {
			arr.add(v);
		}

		for (T v : rechts) {
			arr.add(v);
		}

		return arr;
	}

	public int hoehe() {
		return hoehe(root);
	}

	private int hoehe(Knoten k) {
		if (k == null) {
			return 0;
		}
		return 1 + Math.max(hoehe(k.links), hoehe(k.rechts));
	}

	public String toString() {
		return toString(root);
	}
	
	

	private String toString(Knoten e) {
		return e == null ? "" : "(" + toString(e.links) + e.value + toString(e.rechts) + ")";
	}
	
	@Override
	public Iterator<T> iterator() {
		return new BfsIterator();
	}
	
	private class BfsIterator implements Iterator<T> {
		private Schlange<Knoten> schlange;

		public BfsIterator() {
			schlange = new SchlangeAlsArray<Knoten>();
			if (root != null) {
				schlange.enqueue(root);
			}
		}

		@Override
		public boolean hasNext() {
			return !schlange.isEmpty();
		}

		@Override
		public T next() {
			Knoten current = schlange.front();
			schlange.dequeue();
			if (current.links != null) {
				schlange.enqueue(current.links);
			}
			if (current.rechts != null) {
				schlange.enqueue(current.rechts);
			}
			return current.value;
		}
	}

	public static <T> void zeigeTraversierung(DynArray<T> arr) {
		for (int i = 0; i < arr.size(); i++) {
			System.out.print(arr.get(i) + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		BinBaum<Integer> tree = new BinBaum<>(2);

		tree.root.links = tree.new Knoten(3);
		tree.root.rechts = tree.new Knoten(7);
		tree.root.links.links = tree.new Knoten(4);
		tree.root.links.rechts = tree.new Knoten(1);
		tree.root.rechts.links = tree.new Knoten(8);
		tree.root.links.rechts.links = tree.new Knoten(6);
		tree.root.links.rechts.rechts = tree.new Knoten(5);
		System.out.println("Baumgröße: " + tree.size());
		System.out.println("Baumhöhe: " + tree.hoehe());

		System.out.println("Baum mit toString: " +tree);
		System.out.print("Inorder: ");
		zeigeTraversierung(tree.inorder());

		System.out.print("Preorder: ");
		zeigeTraversierung(tree.preorder());

		System.out.print("Postorder: ");
		zeigeTraversierung(tree.postorder());

		System.out.print("BFS: ");
		for (Integer val : tree) {
			System.out.print(val + " ");
		}
		System.out.println();

	}
}
