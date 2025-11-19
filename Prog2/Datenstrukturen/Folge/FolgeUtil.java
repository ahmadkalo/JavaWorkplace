package Folge;

public class FolgeUtil {

    // Returns the frequency of a value in the given sequence.
    public static <T> int frequency(Folge<T> f, T v) {
        int count = 0;
        for (T item : f) {
            if (item.equals(v)) {
                count++;
            }
        }
        return count;
    }

    // Swaps the elements at positions i and j in the given sequence.
    public static <T> void swap(Folge<T> f, int i, int j) throws IndexOutOfBoundsException {
        T temp = f.get(i);
        f.set(i, f.get(j));
        f.set(j, temp);
    }

    // Rotates the given sequence by d positions.
    public static <T> void rotate(Folge<T> f, int d) {
        int n = f.size();
        if (n == 0) return;

        d = d % n;
        if (d < 0) d += n;

        for (int i = 0; i < d; i++) {
            T temp = f.get(n - 1);
            for (int j = n - 2; j >= 0; j--) {
                f.set(j+1, f.get(j));
            }
            f.set(0, temp);
        }
    }
    
    

    public static void main(String[] args) {
        FolgeAlsDynArray<Integer> folge = new FolgeAlsDynArray<Integer>();
        
        folge.insert(0, 1);;
        folge.insert(1, 2);
        folge.insert(2, 3);
        folge.insert(3, 1);
        folge.insert(4, 2);
        folge.insert(5, 1);
        
        System.out.println("--------------------------------------------");

        int freq = FolgeUtil.frequency(folge, 1);
        System.out.println("Häufigkeit von 1: " + freq);
        
        System.out.println("--------------------------------------------");

        System.out.println("Vor dem Swap:");
        folge.show();
        System.out.println("Nach dem Swap:");
        FolgeUtil.swap(folge, 0, 1);
        folge.show();

        System.out.println("--------------------------------------------");
        
        System.out.println("Vor der Rotation");
        folge.show();
        System.out.println("Nach der rotation:");
        FolgeUtil.rotate(folge, 2);
        folge.show();
    }
}


