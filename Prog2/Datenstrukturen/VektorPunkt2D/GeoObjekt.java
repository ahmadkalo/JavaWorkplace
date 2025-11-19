package VektorPunkt2D;

public abstract class GeoObjekt implements Verschiebbar {

    /* Instanzvariablen */

    private String farbe;

    /* Konstruktoren */

    public GeoObjekt(String farbe) {
        this.farbe = farbe;
    }

    /* Instanzmethoden */

    public String farbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}
