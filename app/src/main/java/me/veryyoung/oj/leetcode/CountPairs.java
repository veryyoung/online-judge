package me.veryyoung.oj.leetcode;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * 2316. Count Unreachable Pairs of Nodes in an Undirected Graph
 * https://leetcode.com/problems/count-unreachable-pairs-of-nodes-in-an-undirected-graph/
 */
public class CountPairs {
    public long countPairs(int n, int[][] edges) {
        if (edges.length == 0) {
            return BigDecimal.valueOf(n).multiply(BigDecimal.valueOf(n - 1)).divide(BigDecimal.valueOf(2)).longValue();
        }

        List<List<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        boolean[] visited = new boolean[n];
        BigDecimal unreachablePairs = BigDecimal.ZERO;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                int size = dfs(graph, i, visited);
                unreachablePairs = unreachablePairs.add(BigDecimal.valueOf(size).multiply(BigDecimal.valueOf(n - size)));
            }
        }
        return unreachablePairs.divide(BigDecimal.TWO).longValue();
    }

    private int dfs(List<List<Integer>> graph, int number, boolean[] visited) {
        visited[number] = true;
        int count = 1;
        for (int neighbor : graph.get(number)) {
            if (!visited[neighbor]) {
                count += dfs(graph, neighbor, visited);
            }
        }
        return count;
    }


}
