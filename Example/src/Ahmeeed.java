public class Ahmeeed {

    public static void main(String[] args) {
        String[] ahmed = { "A", "h", "m", "e", "d" };

        for (int i = 0; i <= 200; i++) {
        	System.out.print((i+1) + ". ");
            for (int j = 0; j < ahmed.length; j++) {
                System.out.print(ahmed[j]);
            }
            System.out.println(); 
            ahmed = nochEinHinzufuegen(ahmed);
        }
    }

    private static String[] nochEinHinzufuegen(String[] ahmed) {
        String[] ahmed2 = new String[ahmed.length + 1];
        for (int j = 0; j < ahmed.length; j++) {
            ahmed2[j] = ahmed[j];
        }
        ahmed2[ahmed2.length - 2] = "e";
        ahmed2[ahmed2.length - 1] = "d"; 
        
        
        return ahmed2;
    }
}
