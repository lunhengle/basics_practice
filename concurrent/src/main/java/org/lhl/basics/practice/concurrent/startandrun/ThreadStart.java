package org.lhl.basics.practice.concurrent.startandrun;

/**
 *
 * t.start(); 该行代码相当于是启动线程，
 *
 * t.run(); 该行代码相当于是使用t这个类中的run方法而已.
 * @author lunhengle
 */
public class ThreadStart {

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
        thread.start();
        System.out.println("ping");
    }
}
