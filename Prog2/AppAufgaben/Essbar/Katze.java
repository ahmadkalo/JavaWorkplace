package Essbar;

public class Katze extends Lebewesen {

    public Katze() {
        super(7);
    }

    @Override
    public void essen(Essbar beute) {
        beute.wirdGefressen();
    }
}

