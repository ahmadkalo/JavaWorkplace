package BitExtraktion;

public class BitExtraktion {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Werte x, y und a eingeben");
            return;
        }

        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        int a = Integer.parseInt(args[2]);

        if (x < 0 || x > 31 || y < 0 || y > 31 || x == y) {
            System.out.println("Ungültige Eingabe");
            return;
        }

        int bitX = (a >> x) & 1;
        int bitY = (a >> y) & 1;

        int erg = bitX + bitY;

        System.out.println(erg);
    }
}

