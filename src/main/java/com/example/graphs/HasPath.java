package com.example.graphs;

import java.util.HashMap;
import java.util.LinkedList;

public class HasPath {

    // DSF
    public static boolean hasPathDFSRecurssion(HashMap<String, String[]> graph, String src, String dst) {

        if (src.equals(dst))
            return true;

        String[] neighbors = graph.get(src);
        if (neighbors == null)
            return false;

        for (String neighbor : neighbors) {
            if (hasPathDFSRecurssion(graph, neighbor, dst))
                return true;
        }
        return false;
    }

    public static boolean hasPathBFS(HashMap<String, String[]> graph, String src, String dst) {

        LinkedList<String> queue = new LinkedList<>();

        queue.add(src);

        while (!queue.isEmpty()) {
            String currentNode = queue.poll();
            if (currentNode.equalsIgnoreCase(dst))
                return true;
            String[] neighbors = graph.get(currentNode);
            if (neighbors == null)
                continue;
            for (String neighbor : neighbors) {
                queue.add(neighbor);
            }
        }
        return false;
    }

}
