package klausurAufgaben;

public class TreppenRoboter extends Roboter implements TreppenTurtle {

    @Override
    public void treppe(int n) {
        for (int i = 0; i < n; i++) {
            step();
            turnL();
            step();
            turnR();
        }
    }
    
}
