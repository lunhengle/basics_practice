package org.lhl.bascis.practice.algorithm.queueandstack;

import java.util.Stack;

/**
 * 两个栈实现一个队列.
 *
 * @author lunhengle
 */
public class TwoStackImplQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(Integer item){
        stack1.push(item);
    }
    public Integer pop(){
        if(stack1.isEmpty()){
            return null;
        }else if(stack2.isEmpty()){
            while (stack1.size()>0){
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        }else{
            return stack2.pop();
        }
    }


    public static void main(String[] args) {
        TwoStackImplQueue twoStackImplQueue = new TwoStackImplQueue();
        twoStackImplQueue.push(1);
        twoStackImplQueue.push(2);
        twoStackImplQueue.push(3);
        twoStackImplQueue.push(4);
        System.out.println(twoStackImplQueue.pop());
        twoStackImplQueue.push(5);
        System.out.println(twoStackImplQueue.pop());
        System.out.println(twoStackImplQueue.pop());
        System.out.println(twoStackImplQueue.pop());
        System.out.println(twoStackImplQueue.pop());
    }
}
