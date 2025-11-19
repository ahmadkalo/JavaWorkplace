public class arraay{

    public static void main(String[] args) {

        int array[] = {2,5,7,9,2,1};
        System.out.println(sucheZahl(5,array));
    }

public static int sucheZahl(int gesuchteZahl, int[] array) {
    for (int i = 0; i < array.length; i++) {
        if (array[i] == gesuchteZahl) {
            return array[i];
        }
    }
    return -1;
}
}