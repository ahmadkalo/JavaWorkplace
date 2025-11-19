package Song;

import java.time.Duration;

public class Song {
    private String titel;
    private String interpret;
    private Duration laenge;
    private int erscheinungsjahr;
    private String songtext;

    public Song(String title, String interpret, Duration laenge, int erscheinungsjahr) {
        this.titel = title;
        this.interpret = interpret;
        this.laenge = laenge;
        this.erscheinungsjahr = erscheinungsjahr;
    }

    public String getTitel() {
        return titel;
    }

    public String getInterpret() {
        return interpret;
    }

    public Duration getLaenge() {
        return laenge;
    }

    public int getErscheinungsjahr() {
        return erscheinungsjahr;
    }

    public String getLyrics() {
        return songtext;
    }

    public void setSongtext(String songtext) {
        this.songtext = songtext;
    }

    @Override
    public String toString() {
        return "<" + titel + ">, <" + interpret + ">, <" + laenge + ">, <" + erscheinungsjahr + ">";
    }
}
