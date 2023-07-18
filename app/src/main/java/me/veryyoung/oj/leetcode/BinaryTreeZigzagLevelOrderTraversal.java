package me.veryyoung.oj.leetcode;

import me.veryyoung.oj.util.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeZigzagLevelOrderTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(root, 0, result);
        return result;
    }

    private void dfs(TreeNode treeNode, int level, List<List<Integer>> result) {
        if (treeNode == null) {
            return;
        }
        if (result.size() <= level) {
            result.add(new LinkedList<>());
        }
        if (level % 2 == 0) {
            result.get(level).add(treeNode.val);
        } else {
            result.get(level).add(0, treeNode.val);
        }
        dfs(treeNode.left, level + 1, result);
        dfs(treeNode.right, level + 1, result);
    }

}
