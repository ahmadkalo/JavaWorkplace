public class BoolExpression {

    public static void main(String[] args) {

        boolean wert1 = false;
        boolean wert2 = true;

        boolean ergebnis1 = !wert1 & (wert1 |wert2);
        System.out.println(ergebnis1);

        wert1 = true;

        boolean ergebnis2 = !wert1 & (wert1 |wert2);
        System.out.println(ergebnis2);
    }
}
