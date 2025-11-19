package Essbar;

public abstract class Lebewesen implements Essbar {

    /* Instanzvariablen */
                                                                                                                                                                                  
    private int leben;

    /* Konstruktoren */

    public Lebewesen() {
        this(1);
    }

    public Lebewesen(int leben) {
        this.leben = leben;
    }

    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return super.toString();
    }
    /* Instanzmethoden */

    public final void wirdGefressen() {
        this.leben--;
        if (this.leben == 0) {
            throw new GameOverException("GAME OVER");
        }
    }

    public abstract void essen(Essbar mahlzeit);

    public int getLeben() {
        return this.leben;
    }
}
