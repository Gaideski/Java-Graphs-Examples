package com.example.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class UndirectecPath {

    public static boolean UndirectedPathDFS(List<String[]> undir, String src, String dst) {

        HashMap<String, List<String>> graph = Graphs.getGraphFromList(undir);
        graph.forEach((key, value) -> System.out.println(key + " | " + value));
        HashSet<String> visitedNodes = new HashSet<>();
        return hasPath(graph, src, dst, visitedNodes);
    }

    static boolean hasPath(HashMap<String, List<String>> graph, String src, String dst, HashSet<String> visitedNodes) {
        if (src == dst)
            return true;
        if (visitedNodes.contains(src))
            return false;
        visitedNodes.add(src);
        for (String neighbor : graph.get(src)) {
            if (hasPath(graph, neighbor, dst, visitedNodes))
                return true;
        }
        return false;
    }

    
}
