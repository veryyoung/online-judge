package me.veryyoung.oj.leetcode;

import me.veryyoung.oj.util.TreeNode;
import org.junit.Test;

import static me.veryyoung.oj.util.TreeNode.toTreeNode;
import static org.junit.Assert.assertEquals;

public class LowestCommonAncestorOfABinaryTreeTest {

    @Test
    public void testLowestCommonAncestor() {
        LowestCommonAncestorOfABinaryTree instance = new LowestCommonAncestorOfABinaryTree();
        TreeNode[] testCase1 = getTestCase1();
        assertEquals(testCase1[3], instance.lowestCommonAncestor(testCase1[0], testCase1[1], testCase1[2]));
        TreeNode[] testCase2 = getTestCase2();
        assertEquals(testCase2[3], instance.lowestCommonAncestor(testCase2[0], testCase2[1], testCase2[2]));
        TreeNode[] testCase3 = getTestCase3();
        assertEquals(testCase3[3], instance.lowestCommonAncestor(testCase3[0], testCase3[1], testCase3[2]));
    }

    private TreeNode[] getTestCase1() {
        TreeNode root = toTreeNode(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        return new TreeNode[]{root, root.left, root.right, root};
    }

    private TreeNode[] getTestCase2() {
        TreeNode root = toTreeNode(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        return new TreeNode[]{root, root.left, root.left.right.right, root.left};
    }

    private TreeNode[] getTestCase3() {
        TreeNode root = toTreeNode(new Integer[]{1, 2});
        return new TreeNode[]{root, root, root.right, root};
    }

}
