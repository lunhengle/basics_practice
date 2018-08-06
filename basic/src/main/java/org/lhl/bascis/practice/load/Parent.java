package org.lhl.bascis.practice.load;

public class Parent {
    static{
        System.out.println("parent 静态代码块");
    }
    {
        System.out.println("parent 代码块");
    }
    public Parent(){
        System.out.println("parent 构造函数");
    }
}
