package Context;

import ControlListener.ControlListener;
import verification.Rechnung;
import verification.Result;
import verification.VerificationAlg;

import java.util.ArrayList;
import java.util.List;

class AlgoContext {
    private VerificationAlg alg;
    private List<ControlListener> subscribers = new ArrayList<>();
    
    public void setVerificationAlg(VerificationAlg a) {
        this.alg = a;
    }
    
    public Status checkRechnung(Rechnung r) {
        if (alg == null) {
            throw new IllegalStateException("Kein Verifikationsalgorithmus gesetzt");
        }
        Result result = alg.checkRechnung(r);
        notifySubscribers(result);
        return new Status("Verifikation abgeschlossen");
    }
    
    public void subscribe(ControlListener c) {
        subscribers.add(c);
    }
    
    public void unsubscribe(ControlListener c) {
        subscribers.remove(c);
    }
    
    private void notifySubscribers(Result result) {
        for (ControlListener c : subscribers) {
            c.update(result);
        }
    }
}