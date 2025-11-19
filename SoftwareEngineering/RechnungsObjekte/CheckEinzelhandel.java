public class CheckEinzelhandel implements VerificationAlg {
    @Override
    public Status checkRechnung(Rechnung r) {
        System.out.println("Einzelhandel Rechnung überprüft.");
        return Status.OK;
    }
}
