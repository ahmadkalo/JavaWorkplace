public class DynamischesArray<T> {

    private T[] array;
    int size;
    static int startgroesse = 2;

    @SuppressWarnings("unchecked")
    public DynamischesArray() {
        array = (T[]) new Object[startgroesse];
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int arraylength() {
        return array.length;
    }

    public void set(int index, T value) {
        array[index] = value;
    }

    public T get(int index) {
        return array[index];
    }

    public void add(T value) {
        if (size >= array.length) {
            increase();
        }
        array[size++] = value;

    }

    public void increase() {
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < size; i++) {
            s = s + array[i] + " ";

        }
        return s;
    }

    public static void main(String[] args) {
        DynamischesArray<Integer> dynamischesArray = new DynamischesArray<Integer>();
        dynamischesArray.add(1);
        dynamischesArray.add(2);
        dynamischesArray.add(3);
        dynamischesArray.add(4);
        dynamischesArray.add(5);
        dynamischesArray.add(5);
        dynamischesArray.add(5);
        dynamischesArray.add(5);
        dynamischesArray.add(5);


        System.out.println(dynamischesArray.arraylength());
        System.out.println(dynamischesArray);
    }


}
