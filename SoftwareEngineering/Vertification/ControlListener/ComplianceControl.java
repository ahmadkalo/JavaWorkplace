package ControlListener;

import verification.Result;

public class ComplianceControl implements ControlListener {
    public void update(Result r) {
        System.out.println("ComplianceControl benachrichtigt: " + r.getMessage());
    }
}