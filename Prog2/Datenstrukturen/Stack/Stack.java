package Stack;

public interface Stack<T> extends Iterable<T> {
	void push(T value); 
	void pop();
	T top();
	int size();
	boolean isEmpty();
}
