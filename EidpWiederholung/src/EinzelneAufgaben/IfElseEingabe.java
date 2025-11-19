package EinzelneAufgaben;

public class IfElseEingabe {

    public static int min3(int a, int b, int c) {
        if (a < b && a < c) {
            return a;
        } else if (b < a && b < c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        System.out.println(min3(1,2,3));
    }
}
