package me.veryyoung.oj.leetcode;

import org.junit.Test;

import static me.veryyoung.oj.util.ArrayUtils.toIntegerArray;
import static me.veryyoung.oj.util.TreeNode.toTreeNode;
import static org.junit.Assert.assertArrayEquals;

public class BinaryTreeZigzagLevelOrderTraversalTest {

    @Test
    public void testZigzagLevelOrder() {
        BinaryTreeZigzagLevelOrderTraversal instance = new BinaryTreeZigzagLevelOrderTraversal();
        assertArrayEquals(new Integer[][]{{3, null}, {20, 9}, {15, 7}}, toIntegerArray(instance.zigzagLevelOrder(toTreeNode(new Integer[]{3, 9, 20, null, null, 15, 7}))));
        assertArrayEquals(new Integer[][]{{1}}, toIntegerArray(instance.zigzagLevelOrder(toTreeNode(new Integer[]{1}))));
    }

}
