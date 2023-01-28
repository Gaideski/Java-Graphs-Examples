package com.example.graphs;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;


import javafx.util.Pair;

public class ShortestPath {

    public static int shortestPath(List<String[]> edges, String src, String dst) {
        int lenght = -1;
        lenght = explore(Graphs.getGraphFromList(edges), src, dst);
        return lenght;
    }

    private static int explore(HashMap<String, List<String>> graphFromList, String src,
            String dst) {
        List<Pair<String, Integer>> queue = new LinkedList<>();
        HashSet<String> visitedNodes = new HashSet<>();
        queue.add(new Pair<String, Integer>(src, 0));
        while (!queue.isEmpty()) {
            Pair<String, Integer> node = queue.get(0);
            queue.remove(0);
            if (node.getKey().equals(dst))
                return node.getValue();
            if (visitedNodes.contains(node.getKey()))
                continue;
            visitedNodes.add(node.getKey());

            for (String neighbor : graphFromList.get(node.getKey())) {
                queue.add(new Pair<>(neighbor, (node.getValue() + 1)));
            }
        }

        return -1;
    }

}
