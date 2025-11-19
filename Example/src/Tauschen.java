import java.util.Arrays;

public class Tauschen {


    public static String[] tauschen(String[] array) {
        int groesse = array.length;
        String[] getauscht = new String[groesse];

          int i = 0;
            for (int j = array.length-1; j >= 0; j--) {
                getauscht[i] = array[j];
                i++;


            }




        return getauscht;


    }

    public static void main(String[] args) {

        String[] array = {"ahmed", "Delyar", "Heva", "Lava"};
       String[] tauschen = tauschen(array);
        System.out.println(Arrays.toString(tauschen));



    }
}
