package org.lhl.bascis.practice.algorithm.traverse;

/**
 * 二叉树.
 *
 * @author lunhengle
 */
public class TreeNode {
    public TreeNode() {
    }

    public TreeNode(String data) {
        this.data = data;
    }

    public TreeNode(String data, TreeNode leftTreeNode, TreeNode rightTreeNode) {
        this.data = data;
        this.leftTreeNode = leftTreeNode;
        this.rightTreeNode = rightTreeNode;
    }

    private String data;
    private TreeNode leftTreeNode;
    private TreeNode rightTreeNode;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public TreeNode getLeftTreeNode() {
        return leftTreeNode;
    }

    public void setLeftTreeNode(TreeNode leftTreeNode) {
        this.leftTreeNode = leftTreeNode;
    }

    public TreeNode getRightTreeNode() {
        return rightTreeNode;
    }

    public void setRightTreeNode(TreeNode rightTreeNode) {
        this.rightTreeNode = rightTreeNode;
    }
}
