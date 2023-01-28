package com.example.graphs;

public final class App {
    private App() {
    }

    public static void main(String[] args) {
        // System.out.println("DFS: "
        // +HasPath.hasPathDFSRecurssion(Graphs.getGraphOne(), "f", "k"));
        // System.out.println("BFS: " +HasPath.hasPathBFS(Graphs.getGraphOne(), "f",
        // "k"));
        // System.out.println("UP: " +
        // UndirectecPath.UndirectedPathDFS(Graphs.undirectedGraph(), "n", "j"));
        // System.out.println("Connected Nodes: " +
        // ConnectedComponentsCount.getConnectedCount(Graphs.connectedComponentesCount()));
        // System.out.println( "Largest component: " +
        // LargestComponent.getLargestComponent(Graphs.connectedComponentesCount()));
        //System.out.println("Shortest path: " + ShortestPath.shortestPath(Graphs.undirectedGraphShortPath(), "w", "z"));
        //System.out.println("Islands count: " + IslandCount.countIslands(Graphs.gridList()));
        System.out.println("Islands size: " + MinimumIsland.getMinimumIsland(Graphs.gridList()));

    }
}
