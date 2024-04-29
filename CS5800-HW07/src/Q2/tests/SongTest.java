package Q2.tests;

import org.junit.Test;
import Q2.Song;

import static org.junit.Assert.assertEquals;

public class SongTest {

    @Test
    public void testSong() {
        Song song = new Song(1, "Song 1", "Artist 1", "Album 1", 180);
        assertEquals(1, (int) song.getSongID());
        assertEquals("Song 1", song.getTitle());
        assertEquals("Artist 1", song.getArtist());
        assertEquals("Album 1", song.getAlbum());
        assertEquals(180, song.getDuration());
    }
}
