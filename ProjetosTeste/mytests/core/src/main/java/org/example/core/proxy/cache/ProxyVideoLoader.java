package org.example.core.proxy.cache;

import java.util.HashMap;
import java.util.Map;

public class ProxyVideoLoader implements VideoLoader {

    private final VideoLoader videoLoader = new VideoLoaderImpl();
    private Map<String, String> videos = new HashMap<>();

    @Override
    public void getVideo(String videoName) throws InterruptedException {
        if (!videos.containsKey(videoName)) {
            videos.put(videoName, videoName);
            videoLoader.getVideo(videoName);
        } else {
            System.out.println("Proxy");
            System.out.println(videos.get(videoName));
        }
    }
}
