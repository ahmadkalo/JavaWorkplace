package ControlListener;

import verification.Result;

public class PersistenceControl implements ControlListener {
    public void update(Result r) {
        System.out.println("PersistenceControl benachrichtigt: " + r.getMessage());
    }
}