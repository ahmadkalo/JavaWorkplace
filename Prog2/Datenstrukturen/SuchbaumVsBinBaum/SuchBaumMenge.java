package SuchbaumVsBinBaum;

import java.util.Iterator;

import DynArray.DynArray;
import Menge.Menge;

public class SuchBaumMenge<T extends Comparable<T>> implements Menge<T> {

	private BinBaum<T> baum;

	public SuchBaumMenge() {
		baum = new BinBaum<>();
	}

	@Override
	public int size() {
		return baum.size();
	}

	@Override
	public boolean isEmpty() {
		return baum.isEmpty();
	}

	@Override
	public T get() {

		Iterator<T> it = iterator();
		if (it.hasNext()) {
			return it.next();
		}
		return null;
	}

	@Override
	public void insert(T e) {
		baum.root = insert(baum.root, e);
	}

	private BinBaum<T>.Knoten insert(BinBaum<T>.Knoten k, T e) {
		if (k == null) {
			return baum.new Knoten(e);
		}
		if (e.compareTo(k.value) < 0) {
			k.links = insert(k.links, e);
		} else if (e.compareTo(k.value) > 0) {
			k.rechts = insert(k.rechts, e);
		}
		return k;
	}

	@Override
	public void delete(T e) {
		baum.root = delete(baum.root, e);
	}

	private BinBaum<T>.Knoten delete(BinBaum<T>.Knoten k, T e) {
		if (k == null) {
			return null;
		}
		if (e.compareTo(k.value) < 0) {
			k.links = delete(k.links, e);
		} else if (e.compareTo(k.value) > 0) {
			k.rechts = delete(k.rechts, e);
		} else {
			 // Fall 1: Keine Kinder (Blattknoten)
	        if (k.links == null && k.rechts == null) {
	            return null;
	        }
	        // Fall 2: Nur rechtes Kind, das keine Kinder hat
	        if (k.links == null && k.rechts.links == null && k.rechts.rechts == null) {
	            return k.rechts;
	        }
	        // Fall 3: Nur linkes Kind, das keine Kinder hat
	        if (k.rechts == null && k.links.links == null && k.links.rechts == null) {
	            return k.links;
	        }
	        // Fall 4: Nur linker Knoten, der möglicherweise Kinder hat
	        if (k.rechts == null) {
	            T maxValue = getMaxValue(k.links);
	            k.value = maxValue;
	            k.links = delete(k.links, maxValue);
	        } 
	        // Fall 5: Nur rechter Knoten, der möglicherweise Kinder hat
	        else if (k.links == null) {
	            T minValue = getMinValue(k.rechts);
	            k.value = minValue;
	            k.rechts = delete(k.rechts, minValue);
	        } 
	        // Fall 6: Zwei Kinder, die möglicherweise Kinder haben
	        else {
	            T minValue = getMinValue(k.rechts);
	            k.value = minValue;
	            k.rechts = delete(k.rechts, minValue);
	        }
	    }
	    return k;
	}

	private T getMinValue(BinBaum<T>.Knoten k) {
		T minValue = k.value;
		while (k.links != null) {
			minValue = k.links.value;
			k = k.links;
		}
		return minValue;
	}
	
	private T getMaxValue(BinBaum<T>.Knoten k) {
	    T maxValue = k.value;
	    while (k.rechts != null) {
	        maxValue = k.rechts.value;
	        k = k.rechts;
	    }
	    return maxValue;
	}

	@Override
	public boolean contains(T e) {
		return contains(baum.root, e);
	}

	private boolean contains(BinBaum<T>.Knoten k, T e) {
		if (k == null) {
			return false;
		}
		if (e.compareTo(k.value) < 0) {
			return contains(k.links, e);
		} else if (e.compareTo(k.value) > 0) {
			return contains(k.rechts, e);
		} else {
			return true;
		}
	}
	
	public DynArray<T> inorder() {
		return baum.inorder();
	}

	@Override
	public void show() {
		System.out.println(baum);
	}
	

	@Override
	public Iterator<T> iterator() {
		return baum.iterator();
	}


	@Override
	public String toString() {

		return baum.toString();
	}
}
