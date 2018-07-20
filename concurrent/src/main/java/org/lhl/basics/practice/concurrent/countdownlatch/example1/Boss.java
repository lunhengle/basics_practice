package org.lhl.basics.practice.concurrent.countdownlatch.example1;

import java.util.concurrent.CountDownLatch;

/**
 * 老板.
 * @author lunhengle
 */
public class Boss implements Runnable {
    private CountDownLatch countDownLatch;

    public Boss(CountDownLatch countDownLatch) {
        this.countDownLatch = countDownLatch;
    }


    @Override
    public void run() {
        System.out.println("boss 等待视察工作.....");
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("boss 开始视察工作......");
    }
}
