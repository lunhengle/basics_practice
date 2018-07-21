package org.lhl.basics.practice.concurrent.cyclicbarrier.example1;

import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.*;

/**
 * 测试栅栏.
 * 三人同时参见聚会
 * @author lunhengle
 */
public class CyclicBarrierTest {
    public static void main(String[] args){
        ThreadFactory threadFactory=new ThreadFactoryBuilder().setNameFormat("cycleBarrier-pool").build();
        ExecutorService executorService=new ThreadPoolExecutor(5,100,1000,TimeUnit.SECONDS,new ArrayBlockingQueue<Runnable>(1024),threadFactory,new ThreadPoolExecutor.AbortPolicy());
        CyclicBarrier cyclicBarrier= new CyclicBarrier(3);
        executorService.execute(new PartyMan("张三",cyclicBarrier));
        executorService.execute(new PartyMan("李四",cyclicBarrier));
        executorService.execute(new PartyMan("王五",cyclicBarrier));

        executorService.shutdown();

    }
}
