package org.lhl.basics.practice.concurrent.cyclicbarrier.example1;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

/**
 * 工人.
 * @author lunhengle
 */
public class PartyMan implements Runnable {
    private String name;
    private CyclicBarrier cyclicBarrier;

    PartyMan(String name, CyclicBarrier cyclicBarrier) {
        this.name=name;
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        System.out.println(this.name+"开始前往聚会地点.....");
        try {
            TimeUnit.SECONDS.sleep(10);
            System.out.println(this.name+"到达下次聚会地点....");
            cyclicBarrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println(this.name+"本次约会结束下次再约.....");

    }
}
