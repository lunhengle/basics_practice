public class TestLinkReverse {

    public static void main(String[] args) {
        Node next = new Node(1, null);
        Node node = new Node(0, next);
        System.out.println("node==" + node.getIndex() + " next==" + node.getNext().getIndex());
        Node n=reverse(node);
        System.out.println("node==" + n.getIndex() + " next==" + n.getNext().getIndex());

    }

    public static Node reverse(Node node) {
        if (node.getNext() == null) {
            return node;
        }
        Node next = node.getNext();
        node.setNext(null);
        Node temp = reverse(next);
        next.setNext(node);
        return temp;
    }


    public static class Node {
        public Node() {
        }

        public Node(int index, Node next) {
            this.index = index;
            this.next = next;
        }

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
