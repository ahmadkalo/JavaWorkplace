package Menge;

import java.util.Iterator;
import java.util.NoSuchElementException;

import DynArray.DynArray;

public class MengeLimited<T> implements Menge<T> {

	
    private DynArray<T> menge;

    public MengeLimited() {
        this.menge = new DynArray<>();
    }

    @Override
    public int size() {
        return menge.size();
    }

    @Override
    public boolean isEmpty() {
        return menge.isEmpty();
    }

    @Override
    public T get() {
    	
        if (isEmpty()) {
            throw new NoSuchElementException("MengeLimited is empty");
        }
     
        return menge.get(0);
    }

    @Override
    public void insert(T e) {
        menge.add(e);
    }

    @Override
    public void delete(T e) {
        menge.delete(e);
    }

    @Override
    public boolean contains(T e) {
        return menge.contains(e);
    }

	@Override
	public void show() {
		menge.show();
		
	}
	
	@Override
	public String toString() {
	
		return menge.toString();
	}

	@Override
	public Iterator<T> iterator() {
		
		return menge.iterator();
	}
}
