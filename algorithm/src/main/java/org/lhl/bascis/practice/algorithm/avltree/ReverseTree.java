package org.lhl.bascis.practice.algorithm.avltree;

/**
 * 反转二叉树.
 *
 * @author lunhengle
 */
public class ReverseTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        treeNode.setIndex(0);
        TreeNode left = new TreeNode();
        left.setIndex(1);
        TreeNode right = new TreeNode();
        right.setIndex(2);
        treeNode.setLeft(left);
        treeNode.setRight(right);
        reverseTree(treeNode);
        System.out.println(treeNode.getIndex() + " left=" + treeNode.getLeft().getIndex() + " right=" + treeNode.getRight().getIndex());
    }

    public static void reverseTree(TreeNode treeNode) {
        if (null == treeNode) {
            return;
        }
        reverseTree(treeNode.getLeft());
        reverseTree(treeNode.getRight());
        TreeNode temp = treeNode.getLeft();
        treeNode.setLeft(treeNode.getRight());
        treeNode.setRight(temp);
    }

}
