package verification;

class CheckGroßhandel implements VerificationAlg {
    public Result checkRechnung(Rechnung r) {
        // Logik für Großhandel-Prüfung
        return new Result("Großhandel geprüft");
    }
}
