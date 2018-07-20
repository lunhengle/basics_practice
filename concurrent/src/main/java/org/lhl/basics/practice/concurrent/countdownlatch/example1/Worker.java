package org.lhl.basics.practice.concurrent.countdownlatch.example1;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * 工人.
 * @author lunhengle
 */
public class Worker implements Runnable {
    private String name;
    private CountDownLatch countDownLatch;

    public Worker(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        this.work();
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name + "工作完成......");
        this.countDownLatch.countDown();
    }

    private void work() {
        System.out.println(name + " 正在工作......");
    }
}
