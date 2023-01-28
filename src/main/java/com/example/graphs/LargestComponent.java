package com.example.graphs;

import java.util.HashMap;
import java.util.HashSet;

public class LargestComponent {

    public static int getLargestComponent(HashMap<Integer, int[]> graph) {
        int largestComponent = 0;
        HashSet<Integer> visitedNodes = new HashSet<Integer>();
        for (Integer key : graph.keySet()) {
            if (!visitedNodes.contains(key)) {
                largestComponent = Math.max(largestComponent, transverseDSF(graph, key, visitedNodes));
            }
        }
        return largestComponent;
    }

    static int transverseDSF(HashMap<Integer, int[]> graph, int currentNode, HashSet<Integer> visitedNodes) {
        if (visitedNodes.contains(currentNode))
            return 0;

        visitedNodes.add(currentNode);
        int node = 1;
        for (Integer neighbor : graph.get(currentNode)) {
            node += transverseDSF(graph, neighbor, visitedNodes);
        }
        return node;
    }

}
