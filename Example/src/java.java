public class java {

    public String[] tauschen(String[] namen) {

        for (int i = namen.length-1; i >= 0; i--) {
            if(namen[i] == namen[0]) {
                System.out.print(namen[i]);
            }else {
                    System.out.print(namen[i] + ", ") ;
                }

        }
        return namen;

    }


    public static void main(String[] args) {

      String[] namen = {"Ahmed", "Telman", "Margarita"};
        java namen2 = new java();
        namen2.tauschen(namen);


    }
}
