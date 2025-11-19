import java.util.ArrayList;
import java.util.List;

public class array {

    public static void main(String[] args) {

       List<String> list = new ArrayList<>();

       list.add("Mayar");
       list.add("Raj");
       list.add("Ronald");
       list.set(1, "Mayar");



        System.out.println(list.get(1));

        System.out.println(  list.size());



    }
}
