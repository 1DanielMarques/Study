package org.example.thread.semafaro;


public class MyThread implements Runnable {

    private ColorsSemafaro color;
    private boolean stop;
    private boolean colorChanged;

    public MyThread() {
        this.color = ColorsSemafaro.RED;
        new Thread(this).start();
    }

    @Override
    public void run() {
        while (!stop) {
            try {
                switch (this.color) {
                    case RED -> Thread.sleep(2000);
                    case YELLOW -> Thread.sleep(300);
                    case GREEN -> Thread.sleep(1000);
                }
                this.changeColor();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }

    private synchronized void changeColor() {
        switch (this.color) {
            case RED -> this.color = ColorsSemafaro.GREEN;
            case YELLOW -> this.color = ColorsSemafaro.RED;
            case GREEN -> this.color = ColorsSemafaro.YELLOW;
        }
        this.colorChanged = true;
        notify();
    }

    public synchronized void waitColorChange() {
        while (!this.colorChanged) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.colorChanged = false;
    }

    public ColorsSemafaro getColor() {
        return color;
    }
}
