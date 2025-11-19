package Zeichenblatt;

public class Flugbahn {
    public static void main(String[] args) {
        Zeichenblatt zb = new Zeichenblatt (600,600);
        //
        double G = 9.8; //Gravitation
        double C = 0.002; //

        //Start posi
        double x = 0.0;
        double y = 0.0;

        //Start v
        double v = 80; //  m/s
        double Theta = 60;
        Theta = Theta * Math.PI /180.0;



        //v vektor
        double vx = v * Math.cos(Theta);
        double vy = v * Math.sin(Theta);

        //a
        double ax = 0.0;
        double ay = 0.0;

        //Start t
        double t = 0.0;
        //zeitsprung
        double dt = 0.01;

        while(y >= 0) {
            v = Math.sqrt(vx*vx + vy*vy);
            ax = -C * v * vx;
            ay = -G - C * v *vy;

            vx +=  ax *dt;
            vy +=  ay *dt;

            x +=  vx * dt;
            y +=  vy * dt;
            //Anzeigen
            zb.punkt(x, y, 1);
            zb.anzeigen();
            zb.pause(10);
        }



    }
}