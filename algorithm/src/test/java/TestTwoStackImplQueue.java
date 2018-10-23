import java.util.Stack;

public class TestTwoStackImplQueue {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void push(Integer item) {
        stack1.push(item);
    }

    public Integer pop() {
        if (stack1.isEmpty()&&stack2.isEmpty()) {
            return null;
        } else if (stack2.isEmpty()) {
            while (stack1.size() > 0) {
                stack2.push(stack1.pop());
            }
            return stack2.pop();
        } else {
            return stack2.pop();
        }
    }

    public static void main(String[] args) {
         TestTwoStackImplQueue testTwoStackImplQueue=new TestTwoStackImplQueue();
         testTwoStackImplQueue.push(0);
         testTwoStackImplQueue.push(1);
         testTwoStackImplQueue.push(2);
         testTwoStackImplQueue.push(3);
         System.out.println(testTwoStackImplQueue.pop());
         System.out.println(testTwoStackImplQueue.pop());
         System.out.println(testTwoStackImplQueue.pop());
         testTwoStackImplQueue.push(4);
         System.out.println(testTwoStackImplQueue.pop());
         System.out.println(testTwoStackImplQueue.pop());
    }
}
