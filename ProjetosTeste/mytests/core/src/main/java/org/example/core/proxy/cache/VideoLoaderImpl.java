package org.example.core.proxy.cache;

public class VideoLoaderImpl implements VideoLoader {
    @Override
    public void getVideo(String videoName) throws InterruptedException {
        Thread.sleep(1000);
        System.out.println("Original");
        System.out.println(videoName);
    }
}
