package Naz.Schach;

public class Main {

    public static void main(String[] args) {
        try {


        Bauer bauer1 = new Bauer(new Punkt2D(0,1), true);
        System.out.println(bauer1);
        bauer1.step(1,"vorne");
        System.out.println(bauer1);
        System.out.println("-----------------------------");

        Dame dame = new Dame(new Punkt2D(4,0), true);
        System.out.println(dame);
            dame.step(4,"diagonal oben rechts");
            System.out.println(dame);



        }catch(UngueltigeBewegungException e) {
            System.out.println(e.getMessage());
        }

    }
}
