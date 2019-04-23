import java.util.Stack;

public class TestTwoStackImplQueue {
    private static Stack<Integer> stack1 = new Stack<>();
    private static Stack<Integer> stack2 = new Stack<>();

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);

        System.out.println(pop());
        push(4);
        System.out.println(pop());
    }

    public static void push(Integer item) {
        stack1.push(item);
    }

    public static Integer pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            return null;
        } else if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        } else {
            return stack2.pop();
        }
    }
}
