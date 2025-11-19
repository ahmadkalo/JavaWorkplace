public class CheckGroßhandel implements VerificationAlg {
    @Override
    public Status checkRechnung(Rechnung r) {
        System.out.println("Großhandel Rechnung überprüft.");
        return Status.OK;
    }
}
