import java.util.ArrayDeque;
import java.util.Queue;

public class TestTwoQueueImplStack {
    private static Queue<Integer> queue1 = new ArrayDeque<>();
    private static Queue<Integer> queue2 = new ArrayDeque<>();

    public static void main(String[] args) {
         add(1);
         add(2);
         add(3);
         System.out.println(poll());
         add(4);
         System.out.println(poll());
    }

    public static void add(int temp) {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            queue1.add(temp);
        } else if (queue1.isEmpty()) {
            queue2.add(temp);
        } else if (queue2.isEmpty()) {
            queue1.add(temp);
        }
    }

    public static Integer poll() {
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
}
