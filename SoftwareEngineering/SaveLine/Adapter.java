public class Adapter implements EditorInterface {
    private Altsystem alt;

    public Adapter(Altsystem alt) {
        this.alt = alt;
    }

    @Override
    public void saveLinie(Farbe farbe, int zentimeter) {
        int millimeter = zentimeter * 10;
        alt.saveLine(farbe, millimeter);
    }
}
