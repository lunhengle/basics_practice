package org.lhl.basics.practice.concurrent.countdownlatch.example1;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * 测试 countDownLatch 闭包.
 */
class CountDownLatchTest {
    /**
     * 测试用例1.
     */
    public static void main(String[] args) {
        ThreadFactory threadFactory=new ThreadFactoryBuilder().setNameFormat("countDownLatch-pool").build();
        ExecutorService executor = new ThreadPoolExecutor(5,100,1000,TimeUnit.SECONDS,new ArrayBlockingQueue<>(1024),threadFactory,new ThreadPoolExecutor.AbortPolicy());
        CountDownLatch countDownLatch = new CountDownLatch(3);
        Worker worker1 = new Worker("老张", countDownLatch);
        Worker worker2 = new Worker("老李", countDownLatch);
        Worker worker3 = new Worker("老王", countDownLatch);
        Boss boss = new Boss(countDownLatch);

        executor.execute(worker1);
        executor.execute(worker2);
        executor.execute(worker3);
        executor.execute(boss);
        executor.shutdown();
    }
}
