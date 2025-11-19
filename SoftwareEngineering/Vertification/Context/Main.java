package Context;

import ControlListener.ComplianceControl;
import ControlListener.PersistenceControl;
import verification.CheckEinzelhandel;
import verification.Rechnung;

public class Main {
    public static void main(String[] args) {
        AlgoContext context = new AlgoContext();
        context.setVerificationAlg(new CheckEinzelhandel());
        
        ComplianceControl compliance = new ComplianceControl();
        PersistenceControl persistence = new PersistenceControl();
        
        context.subscribe(compliance);
        context.subscribe(persistence);
        
        Rechnung rechnung = new Rechnung("12345");
        context.checkRechnung(rechnung);
    }
}