package Setzbar;

public interface Setzbar<T> {
   void set(T o);
   T get();
   void reset();
}
