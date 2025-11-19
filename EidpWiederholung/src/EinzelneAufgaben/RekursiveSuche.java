package EinzelneAufgaben;

public class RekursiveSuche {
    
    public static int binSearch(int[] array, int suchwert) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array ist leer oder null");
        }
        return binSearch(array, 0, array.length, suchwert);
    }

    private static int binSearch(int[] array, int first, int last, int suchwert) {
        if (first >= last) {
            throw new IllegalArgumentException("Wert " + suchwert + " nicht im Array enthalten");
        }

        int mid = (first + last) / 2;

        if (array[mid] == suchwert) {
            return mid;
        } else if (array[mid] > suchwert) {
            return binSearch(array, first, mid, suchwert);
        } else {
            return binSearch(array, mid + 1, last, suchwert);
        }
    }

    public static void main(String[] args) {
        // Testfälle
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(binSearch(array, 1)); 
        System.out.println(binSearch(array, 10)); 
        System.out.println(binSearch(array, 5)); 

        try {
            System.out.println(binSearch(array, 11)); 
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(binSearch(new int[]{}, 1)); // Erwartet: Exception
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
