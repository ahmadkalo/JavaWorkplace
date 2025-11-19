package verification;

// Implementierung für verschiedene Verifikationsalgorithmen
public class CheckEinzelhandel implements VerificationAlg {
    public Result checkRechnung(Rechnung r) {
        // Logik für Einzelhandel-Prüfung
        return new Result("Einzelhandel geprüft");
    }
}