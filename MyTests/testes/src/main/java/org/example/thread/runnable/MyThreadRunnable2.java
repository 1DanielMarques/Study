package org.example.thread.runnable;

public class MyThreadRunnable2 implements Runnable {



    private String name;
    private int time;

    public MyThreadRunnable2(String name, int time){
        this.name = name;
        this.time = time;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(name + " " + i);
                Thread.sleep(time);
            }
            System.out.println(name + " Finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
