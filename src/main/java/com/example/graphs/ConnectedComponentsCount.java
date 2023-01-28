package com.example.graphs;

import java.util.HashMap;
import java.util.HashSet;

public class ConnectedComponentsCount {

    public static int getConnectedCount(HashMap<Integer, int[]> graph) {
        HashSet<Integer> visitedNodes = new HashSet<>();
        int count = 0;
        for (Integer currentNode : graph.keySet()) {
            if (!visitedNodes.contains(currentNode)) {
                transverseNode(graph, currentNode, visitedNodes);
                ++count;
            }
        }
        return count;
    }

    private static boolean transverseNode(HashMap<Integer, int[]> graph, int currentNode, HashSet<Integer> hashSet) {
        if (hashSet.contains(currentNode))
            return false;
        hashSet.add(currentNode);
        for (Integer neighbor : graph.get(currentNode)) {
            transverseNode(graph, neighbor, hashSet);
        }
        return true;
    }
}
