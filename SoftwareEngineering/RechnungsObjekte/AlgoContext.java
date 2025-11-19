public class AlgoContext {
    private VerificationAlg alg;

    public AlgoContext(VerificationAlg alg) {
        this.alg = alg;
    }

    public void setVerificationAlg(VerificationAlg alg) {
        this.alg = alg;
    }

    public Status checkRechnung(Rechnung r) {
        return alg.checkRechnung(r);
    }
}
