package EinzelneAufgaben;

import java.util.Random;

public class Jagd {

    int tom;
    int jerry;
    int loch;
    int vorsprung;
    Random wuerfel = new Random();

    public Jagd(int loch, int vorsprung) {
        this.jerry = vorsprung;
        this.loch = loch;
        this.tom = 0;

    }

    private void getPostion() {
        System.out.println("Tom: " + this.tom + " Jerry: " + this.jerry);
    }

    public void los() {
        getPostion();

        while (true) {


            int wurf = wuerfel.nextInt(6) + 1;
            // Jerrys Bewegung
            if (wurf == 1 || wurf == 2 || wurf == 4) {
                jerry += wurf;
            } else if (wurf == 5) {
                jerry -= wurf;

                if (jerry < 0) {
                    jerry = 0;
                }

            }

            // Toms Bewegung
            if (wurf == 3 || wurf == 6) {
                tom += wurf;
            }

            getPostion();

            //Siegbedingungen
            if (tom >= jerry) {
                System.out.println("Tom gewinnt, jerry ist gefressen worden!");
                break;
            }
            if (jerry >= loch) {
                System.out.println("Jerry gewinnt, er ist gerettet!");
                break;

            }

        }
    }


    public static void main(String[] args) {
        Jagd spiel = new Jagd(10, 4);
        spiel.los();
    }

}
