package Portal;

public class HotelSuche {

    public static void main(String[] args) {

        SuchAuftrag suchAuftrag = new SuchAuftrag();
        ReiseAnbieterAdapter adapter = new ReiseAnbieterAdapter();
        SuchErgebnis suchErgebnis = adapter.transformiereAuftrag(suchAuftrag);
    }
}