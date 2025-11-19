package SummeUngleich;

public class SummeUngleichNull {


    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        double erg = 0.0;
        int i = 1;
        while (i <= n) {

            int j = 1;
            while (j <= n) {

                if (i != j) {
                    erg += (double) i / (i - j);
                }
                j++;
            }
            i++;
        }
        System.out.println(erg);
    }
}
