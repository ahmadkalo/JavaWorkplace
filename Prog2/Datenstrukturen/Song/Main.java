package Song;

import java.time.Duration;

public class Main {
	public static void main(String[] args) {
		Song lied1 = new Song("Xeribie", "Ciwan Haco", Duration.ofMinutes(3), 2020);
		Song lied2 = new Song("Another Love", "Tom Odell", Duration.ofMinutes(4), 2021);
		Song lied3 = new Song("Günaydin", "Ahmet Kaya", Duration.ofMinutes(5), 2022);

		lied1.setSongtext("Brindar kirim Xeribie");
		lied2.setSongtext("Another Love all my tears have been used up");
		lied3.setSongtext("Günaydin Annecim Günaydin Babacim");

		Playlist playlist = new Playlist();
		playlist.add(lied1);
		playlist.add(lied2);
		playlist.add(lied3);

		System.out.println("Erste Playlist --------------------------------------------------------------------");
		System.out.println();
		playlist.play();
		
		System.out.println("Random Playlist------------------------------------------------------------------------");
		System.out.println();
		playlist.shuffle();
		
	//	playlist.play(lied2);
		
		System.out.println("Zweite Playlist-----------------------------------------------------------------------");
		System.out.println();
		Playlist anderePlaylist = new Playlist();
		// anderePlaylist.add(lied1);
		// anderePlaylist.add(lied2);
		// anderePlaylist.add(lied3);

		System.out.println("Playlists sind gleich: " + playlist.equals(anderePlaylist));

		// playlist.delete(lied1);
		// playlist.play();
	}
}
