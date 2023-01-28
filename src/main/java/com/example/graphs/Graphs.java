package com.example.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Graphs {

    protected static HashMap<String, List<String>> getGraphFromList(List<String[]> edges) {
        HashMap<String, List<String>> graph = new HashMap<>();

        for (String[] strings : edges) {
            graph.computeIfAbsent(strings[0], k -> new ArrayList<>()).add(strings[1]);
            graph.computeIfAbsent(strings[1], k -> new ArrayList<>()).add(strings[0]);
        }
        return graph;

    }

    public static HashMap<String, String[]> getGraphOne() {
        HashMap<String, String[]> graph = new HashMap();
        graph.put("f", new String[] { "g", "i" });
        graph.put("g", new String[] { "gh" });
        graph.put("h", new String[] { "" });
        graph.put("i", new String[] { "g", "k" });
        graph.put("j", new String[] { "i" });
        graph.put("k", new String[] { "" });

        return graph;
    }

    public static List<String[]> undirectedGraph() {
        ArrayList<String[]> edges = new ArrayList<>();
        edges.add(new String[] { "i", "j" });
        edges.add(new String[] { "k", "i" });
        edges.add(new String[] { "m", "k" });
        edges.add(new String[] { "k", "l" });
        edges.add(new String[] { "o", "n" });

        return edges;
    }

    public static HashMap<Integer, int[]> connectedComponentesCount() {
        HashMap<Integer, int[]> graph = new HashMap();
        graph.put(0, new int[] { 8, 1, 5 });
        graph.put(1, new int[] { 0 });
        graph.put(5, new int[] { 0, 8 });
        graph.put(8, new int[] { 0, 5 });
        graph.put(2, new int[] { 3, 4 });
        graph.put(3, new int[] { 2, 4 });
        graph.put(4, new int[] { 3, 2 });

        return graph;
    }

    public static HashMap<Integer, int[]> largestComponent() {
        HashMap<Integer, int[]> graph = new HashMap<>();
        graph.put(0, new int[] { 8, 1, 5 });
        graph.put(1, new int[] { 0 });
        graph.put(5, new int[] { 0, 8 });
        graph.put(8, new int[] { 0, 5 });
        graph.put(2, new int[] { 3, 4 });
        graph.put(3, new int[] { 2, 4 });
        graph.put(4, new int[] { 3, 2 });

        return graph;
    }

    public static List<String[]> undirectedGraphShortPath() {
        ArrayList<String[]> edges = new ArrayList<>();
        edges.add(new String[] { "w", "x" });
        edges.add(new String[] { "x", "y" });
        edges.add(new String[] { "z", "y" });
        edges.add(new String[] { "z", "v" });
        edges.add(new String[] { "w", "v" });

        return edges;
    }



    public static String[][] gridList() {
        String[][] edges = new String[6][5];

        edges[0]=new String[] { "w", "l","w","w","w" };
        edges[1]=new String[] { "w", "l","w","w","w" };
        edges[2]=new String[] { "w", "w","w","l","w" };
        edges[3]=new String[] { "w", "w","l","l","w" };
        edges[4]=new String[] { "l", "w","w","l","l" };
        edges[5]=new String[] { "l", "l","w","w","w" };

        return edges;
    }
 
}
