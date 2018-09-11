package org.lhl.bascis.practice.algorithm.reverse;

/**
 * 单链表反转.
 *
 * @author lunhengle
 */
public class LinkedReverse {
    /**
     * 反转方法.
     *
     * @param node 节点
     * @return 反转节点
     */
    private Node reverse(Node node) {
        if(null==node.getNext()){
            return node;
        }
        Node next=node.getNext();
        node.setNext(null);
        Node temp=reverse(next);
        next.setNext(node);
        return temp;
    }

    public static void main(String[] args) {
        Node node = new Node();
        Node next = new Node();
        Node next1 = new Node();
        next1.setIndex(2);
        next1.setNext(null);
        next.setIndex(1);
        next.setNext(next1);
        node.setNext(next);
        System.out.println("node===" + node.getIndex() + " next===" + node.getNext().getIndex() + " next.next===" + node.getNext().getNext().getIndex());
        LinkedReverse linkedReverse = new LinkedReverse();
        node = linkedReverse.reverse(node);
        System.out.println("node===" + node.getIndex() + " next===" + node.getNext().getIndex() + " next.next===" + node.getNext().getNext().getIndex());

    }
}
