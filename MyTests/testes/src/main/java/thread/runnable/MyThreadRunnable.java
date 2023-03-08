package thread.runnable;

public class MyThreadRunnable implements Runnable {

    private String name;
    private int time;

    public MyThreadRunnable(String name, int time){
        this.name = name;
        this.time = time;
        Thread t = new Thread(this);
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

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
