package org.example.core.proxy.cache;

public class Program {
    public static void main(String[] args) throws InterruptedException {
        VideoLoader videoLoader = new ProxyVideoLoader();
        videoLoader.getVideo("video1");
        videoLoader.getVideo("video1");
        videoLoader.getVideo("video2");
        videoLoader.getVideo("video2");
        videoLoader.getVideo("video1");



    }
}
