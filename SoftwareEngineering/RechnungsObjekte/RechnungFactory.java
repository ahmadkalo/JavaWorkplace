public class RechnungFactory {
    public  static Rechnung createRechnungGroßHandel() {
        return new RechnungGroßHandel();
    }

    public static Rechnung createRechnungEinzelHandel() {
        return new RechnungEinzelHandel();
    }
}
