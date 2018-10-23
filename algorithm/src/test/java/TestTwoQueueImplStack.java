import org.lhl.bascis.practice.algorithm.queueandstack.TwoQueueImplStack;

import java.util.ArrayDeque;
import java.util.Queue;

public class TestTwoQueueImplStack {
    private Queue<Integer> queue1 = new ArrayDeque<>();
    private Queue<Integer> queue2 = new ArrayDeque<>();

    public void add(Integer item) {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            queue1.add(item);
        } else if (queue1.isEmpty()) {
            queue2.add(item);
        } else if (queue2.isEmpty()) {
            queue1.add(item);
        }
    }

    public Integer poll() {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            return null;
        } else if (queue1.isEmpty()) {
            while (queue2.size() > 1) {
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        } else if (queue2.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        }
        return null;
    }

    public static void main(String[] args) {
        TwoQueueImplStack twoQueueImplStack = new TwoQueueImplStack();
        twoQueueImplStack.add(0);
        twoQueueImplStack.add(1);
        twoQueueImplStack.add(2);
        twoQueueImplStack.add(3);
        System.out.println(twoQueueImplStack.poll());
        System.out.println(twoQueueImplStack.poll());
        System.out.println(twoQueueImplStack.poll());
        twoQueueImplStack.add(4);
        System.out.println(twoQueueImplStack.poll());
        System.out.println(twoQueueImplStack.poll());
    }
}
