package org.lhl.bascis.practice.algorithm.queueandstack;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * 两个队列实现一个栈.
 *
 * @author lunhengle
 */
public class TwoQueueImpStack {
    Queue<Integer> queue1 = new ArrayDeque<>();
    Queue<Integer> queue2 = new ArrayDeque<>();

    public void push(Integer item) {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            queue1.add(item);
            return;
        }
        if (queue1.isEmpty()) {
            queue2.add(item);
            return;
        }
        if (queue2.isEmpty()) {
            queue1.add(item);
        }
    }

    public Integer pop() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            return null;
        }
        if (queue1.isEmpty()) {
            while (queue2.size() > 1) {
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        }
        if (queue2.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        }
        return null;
    }

    public static void main(String[] args) {
        TwoQueueImpStack twoQueueImpStack = new TwoQueueImpStack();
        twoQueueImpStack.push(1);
        twoQueueImpStack.push(2);
        twoQueueImpStack.push(3);
        twoQueueImpStack.push(4);

        System.out.println(twoQueueImpStack.pop());

        twoQueueImpStack.push(5);
        System.out.println(twoQueueImpStack.pop());
        System.out.println(twoQueueImpStack.pop());
        System.out.println(twoQueueImpStack.pop());
        System.out.println(twoQueueImpStack.pop());
    }

}
