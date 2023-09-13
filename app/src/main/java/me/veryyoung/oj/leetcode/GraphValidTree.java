package me.veryyoung.oj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * * 261. Graph Valid Tree
 * https://leetcode.com/problems/graph-valid-tree/
 * https://www.lintcode.com/problem/178/
 */
public class GraphValidTree {

    /**
     * Transfer the edges array into an adjacency list
     * DFS the list, judge whether the node have been visited
     * And whether have loop
     */
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }


        boolean[] visited = new boolean[n];
        if (!dfs(graph, visited, 0, -1)) {
            return false;
        }

        for (boolean visit : visited) {
            if (!visit) {
                return false;
            }
        }
        return true;
    }

    private boolean dfs(List<List<Integer>> graph, boolean[] visited, int node, int parent) {
        visited[node] = true;
        for (int neighbor : graph.get(node)) {
            if (visited[neighbor]) {
                if (neighbor != parent) {
                    return false;
                }
            } else {
                if (!dfs(graph, visited, neighbor, node)) {
                    return false;
                }
            }
        }
        return true;
    }

}
