package thread.semafaro;

public class Main {
    public static void main(String[] args) {

        MyThread semaf = new MyThread();

        for (int i = 0; i < 10; i++) {
            System.out.println(semaf.getColor());
            semaf.waitColorChange();

        }

    }
}
