public class RechnungControl {
    public static void main(String[] args) {

        // Create Factory

        // Create Rechnung
        Rechnung r1 = RechnungFactory.createRechnungEinzelHandel();
        Rechnung r2 = RechnungFactory.createRechnungGroßHandel();

        //Create Strategy
        VerificationAlg grosshandel = new CheckGroßhandel();
        VerificationAlg einzelhandel = new CheckEinzelhandel();
        // Set a Strategy
        AlgoContext context = new AlgoContext(einzelhandel);
        context.checkRechnung(r1);
        // Change the Strategy
        context.setVerificationAlg(grosshandel);
        context.checkRechnung(r2);
    }
}
