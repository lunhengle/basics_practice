package org.lhl.basics.practice.concurrent.startandrun;

/**
 * @author lunhengle
 */
public class ThreadRun {
    static void pong() {
        System.out.println("pong");
    }

    public static void main(String[] args) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                super.run();
                pong();
            }
        };
        thread.run();
        System.out.println("ping");
    }
}
