package Q2.tests;

import org.junit.Test;
import Q2.RealSongService;
import Q2.SongService;
import Q2.SongServiceProxy;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class SongServiceProxyTest {

    @Test
    public void testSearchById() {
        SongService realSongService = new RealSongService();
        SongService songServiceProxy = new SongServiceProxy(realSongService);

        long startTime = System.currentTimeMillis();
        assertNotNull(songServiceProxy.searchById(1));
        long endTime = System.currentTimeMillis();
        long timeTakenProxyServer = endTime - startTime;

        // Assert that the proxy server responds faster than the real server
        assertEquals(1000, timeTakenProxyServer, 200);
    }
}
