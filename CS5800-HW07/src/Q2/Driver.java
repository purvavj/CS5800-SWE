package Q2;

import java.util.Arrays;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        // Simulating a music streaming application
        SongService realSongService = new RealSongService();
        SongService songServiceProxy = new SongServiceProxy(realSongService);

        // Song IDs to search for
        List<Integer> songIds = Arrays.asList(1, 2, 3);

        // Search for songs using the proxy server
        long startTimeProxyServer = System.currentTimeMillis();
        for (Integer songId : songIds) {
            Song songFromProxyServer = songServiceProxy.searchById(songId); // This will fetch the song from the real server and cache it
            System.out.println("Song metadata retrieved from proxy server for song ID " + songId);
        }
        long endTimeProxyServer = System.currentTimeMillis();
        long timeTakenProxyServer = endTimeProxyServer - startTimeProxyServer;

        // Search for the same songs again using the proxy server to demonstrate caching
        startTimeProxyServer = System.currentTimeMillis();
        for (Integer songId : songIds) {
            Song cachedSongFromProxyServer = songServiceProxy.searchById(songId); // This should retrieve the song from the cache
            System.out.println("Cached song metadata retrieved from proxy server for song ID " + songId);
        }
        long cachedTimeTakenProxyServer = System.currentTimeMillis() - startTimeProxyServer;

        // Search for songs using the real server
        long startTimeRealServer = System.currentTimeMillis();
        for (Integer songId : songIds) {
            Song songFromRealServer = realSongService.searchById(songId);
            System.out.println("Song metadata retrieved from real server for song ID " + songId);
        }
        long endTimeRealServer = System.currentTimeMillis();
        long timeTakenRealServer = endTimeRealServer - startTimeRealServer;

        // Display results
        System.out.println("Total time taken to retrieve songs from proxy server: " + timeTakenProxyServer + " milliseconds");
        System.out.println("Total time taken to retrieve cached songs from proxy server: " + cachedTimeTakenProxyServer + " milliseconds");
        System.out.println("Total time taken to retrieve songs from real server: " + timeTakenRealServer + " milliseconds");
    }
}
