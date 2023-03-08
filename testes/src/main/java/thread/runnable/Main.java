package thread.runnable;

public class Main {
    public static void main(String[] args) {
     /*   MyThreadRunnable t1 = new MyThreadRunnable("T1",500);
        MyThreadRunnable t2 = new MyThreadRunnable("T2",900); */

        MyThreadRunnable2 thread1 = new MyThreadRunnable2("T1", 500);
        MyThreadRunnable2 thread2 = new MyThreadRunnable2("T2", 900);
        Thread t1 = new Thread(thread1);
        Thread t2 = new Thread(thread2);
        t1.setPriority(1);
        t2.setPriority(10);
        t1.start();
      /*  try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } */
        t2.start();


        System.out.println("Main finished");
    }
}
