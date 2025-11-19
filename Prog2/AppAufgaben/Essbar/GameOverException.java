package Essbar;

@SuppressWarnings("serial")
public class GameOverException extends RuntimeException {

    /* Konstruktoren */

    public GameOverException() {}

    public GameOverException(String msg) {
        super(msg);
    }
}

