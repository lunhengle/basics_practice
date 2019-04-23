import java.util.Stack;

public class TestReverse {
    public static void main(String[] args) {
        Node node = new Node();
        node.setIndex(0);
        Node next = new Node();
        next.setIndex(1);
        node.setNext(next);

        Node temp = reverse1(node);

        System.out.println(temp.getIndex());
        System.out.println(temp.getNext().getIndex());
    }

    public static Node reverse(Node node) {
        if (node.getNext() == null) {
            return node;
        }
        Node next = node.getNext();
        next.setNext(null);
        Node temp = reverse(next);
        next.setNext(node);
        return temp;
    }

    public static Node reverse1(Node node) {
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        while (node.getNext() != null) {
            stack.push(node.getNext());
            node = node.getNext();
        }
        Node n = stack.pop();
        while (!stack.empty()) {
            Node next = stack.pop();
            n.setNext(next);
        }
        return n;
    }

    static class Node {
        private int index;
        private Node next;

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}

