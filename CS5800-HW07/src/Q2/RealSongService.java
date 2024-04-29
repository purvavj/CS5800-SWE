package Q2;

import java.util.ArrayList;
import java.util.List;

public class RealSongService implements SongService {
    private List<Song> songs;

    public RealSongService() {
        // Initialize songs
        songs = new ArrayList<>();
        songs.add(new Song(1, "Down Bad", "Taylor Swift", "TTPD", 180));
        songs.add(new Song(2, "Falling", "Harry Styles", "HS", 200));
        songs.add(new Song(3, "Fortnight", "Taylor Swift", "TTPD", 220));
        songs.add(new Song(4, "Heather", "Conan Gray", "Kid Krow", 190));
        songs.add(new Song(5, "So Long, London", "Taylor Swift", "TTPD", 210));
    }

    @Override
    public Song searchById(Integer songID) {
        try {
            // Simulate delay
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Song song : songs) {
            if (song.getSongID().equals(songID)) {
                return song;
            }
        }
        return null; // Return null if songID is not found
    }

    @Override
    public List<Song> searchByTitle(String title) {
        try {
            // Simulate delay
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getTitle().equalsIgnoreCase(title)) {
                result.add(song);
            }
        }
        return result;
    }

    @Override
    public List<Song> searchByAlbum(String album) {
        try {
            // Simulate delay
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        List<Song> result = new ArrayList<>();
        for (Song song : songs) {
            if (song.getAlbum().equalsIgnoreCase(album)) {
                result.add(song);
            }
        }
        return result;
    }
}
