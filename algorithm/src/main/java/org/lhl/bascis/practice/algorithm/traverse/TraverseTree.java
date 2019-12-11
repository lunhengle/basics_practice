package org.lhl.bascis.practice.algorithm.traverse;

/**
 * 遍历二叉树.
 *
 * @author lunhengle
 */
public class TraverseTree {
    public static void main(String[] args) {
        preOrderTraverse(initTreeNode());
    }

    private static TreeNode initTreeNode() {
        TreeNode treeNodeF = new TreeNode("F");
        TreeNode treeNodeE = new TreeNode("E");
        TreeNode treeNodeD = new TreeNode("D");
        treeNodeD.setLeftTreeNode(treeNodeE);
        treeNodeD.setRightTreeNode(treeNodeF);
        TreeNode treeNodeC = new TreeNode("C");
        TreeNode treeNodeB = new TreeNode("B");
        treeNodeB.setLeftTreeNode(treeNodeC);
        TreeNode treeNodeA = new TreeNode("A");
        treeNodeA.setLeftTreeNode(treeNodeB);
        treeNodeA.setRightTreeNode(treeNodeD);
        return treeNodeA;
    }

    private static void preOrderTraverse(TreeNode treeNode) {
        if (null == treeNode) {
            return;
        }
        System.out.println(treeNode.getData());
        preOrderTraverse(treeNode.getLeftTreeNode());
        preOrderTraverse(treeNode.getRightTreeNode());
    }

}
