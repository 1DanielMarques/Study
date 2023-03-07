package thread;

public class MyThread extends Thread {
    private String name;
    private int time;


    public MyThread(String name, int time) {
        this.name = name;
        this.time = time;
        start();
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(name + " " + i);
                sleep(time);
            }
            System.out.println(name + " Finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
