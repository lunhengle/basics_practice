package org.lhl.bascis.practice.load;

public class Child extends Parent{
    static {
        System.out.println("child 静态代码块");
    }
    {
        System.out.println("child 代码块");
    }

    public Child(){
        System.out.println("child 构造函数");
    }

}
