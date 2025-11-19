package Song;
import java.util.Random;

import Folge.FolgeAlsDynArray;


public class Playlist {
    private FolgeAlsDynArray<Song> lieder;

    public Playlist() {
        this.lieder = new FolgeAlsDynArray<Song>();
    }

    public void add(Song lied) {
        lieder.addLast(lied);
    }

    public void delete(Song lied) {
        lieder.delete(lied);
    }

    public void play() {
    	
        for (Song lied : lieder) {
            play(lied);
        }
    }

    public void play(Song lied) {
        System.out.println("Spielt Lied ab: " + lied);
        System.out.println("Songtext: " + lied.getLyrics());
        System.out.println();
    }

    public void shuffle() {
        Random rand = new Random();
        for (int i = lieder.size() - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            // Tausche lieder[i] mit dem Element an den zufälligen Index
            Song temp = lieder.get(i);
            lieder.set(i, lieder.get(j));
            lieder.set(j, temp);
        }
        play();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Playlist playlist = (Playlist) o;

        if (lieder.size() != playlist.lieder.size()) return false;

        for (int i = 0; i < lieder.size(); i++) {
            Song lied1 = lieder.get(i);
            Song lied2 = playlist.lieder.get(i);
            if (!lied1.getTitel().equals(lied2.getTitel()) ||
                !lied1.getInterpret().equals(lied2.getInterpret()) ||
                !lied1.getLaenge().equals(lied2.getLaenge()) ||
                lied1.getErscheinungsjahr() != lied2.getErscheinungsjahr()) {
                return false;
            }
        }
        return true;
    }

  
}
