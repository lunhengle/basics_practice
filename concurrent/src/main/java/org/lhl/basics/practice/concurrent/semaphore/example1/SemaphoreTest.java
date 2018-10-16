package org.lhl.basics.practice.concurrent.semaphore.example1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author lunhengle
 */
public class SemaphoreTest {
    private static Semaphore semaphore = new Semaphore(3);
    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 1000, TimeUnit.MINUTES, new ArrayBlockingQueue<>(1000));

    private static class Person extends Thread {
        private String name;
        private Integer age;

        public Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public void run() {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " 姓名：" + name + " 年龄：" + age + " 当前时间：" + System.currentTimeMillis());
                Thread.sleep(1000);
                System.out.println("要释放凭证了");
                System.out.println("当前想成个数：" + semaphore.availablePermits());
                semaphore.release();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        threadPoolExecutor.execute(new Person("张三", 10));
        threadPoolExecutor.execute(new Person("李四", 20));
        threadPoolExecutor.execute(new Person("王五", 30));
        threadPoolExecutor.execute(new Person("赵六", 40));
        threadPoolExecutor.shutdown();
    }
}

class Singleton {
    private static volatile Singleton singleton = null;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (null == singleton) {
            synchronized (Singleton.class) {
                if (null == singleton) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}

class Singleton1 {
    private Singleton1() {

    }

    private static class Inner {
        private static Singleton1 instance = new Singleton1();
    }

    public Singleton1 getInstance() {
        return Inner.instance;
    }
}

class Test{
    public static void main(String[] args) {
        String str="【你好】我是【你的】哈哈【我的】";
       List list= extractMessageByRegular(str);
        list.forEach(System.out::println);
    }
    public static List<String> extractMessageByRegular(String msg){

        List<String> list=new ArrayList<String>();
        Pattern p = Pattern.compile("(\\【[^\\】]*\\】)");
        Matcher m = p.matcher(msg);
        while(m.find()){
            list.add(m.group().substring(1, m.group().length()-1));
        }
        return list;
    }
}
