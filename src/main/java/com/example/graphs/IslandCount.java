package com.example.graphs;

import java.util.HashSet;

public class IslandCount {

    public static int countIslands(String[][] grid) {
        HashSet<String> visitedSet = new HashSet<>();
        int count = 0;
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; r++) {
                if (explore(grid, r, c, visitedSet))
                    ++count;
            }
        }
        return count;
    }

    private static boolean explore(String[][] grid, int r, int c, HashSet<String> visitedSet) {

        boolean rowInbounds = 0 <= r && r < grid.length;
        boolean colInbounds = 0 <= c && c < grid[0].length;
        if (!rowInbounds || !colInbounds)
            return false;

        if (grid[r][c].equalsIgnoreCase("w"))
            return false;

        String pos = r + "," + c;

        if (visitedSet.contains(pos))
            return false;

        visitedSet.add(pos);

        explore(grid, r - 1, c, visitedSet);
        explore(grid, r + 1, c, visitedSet);
        explore(grid, r, c - 1, visitedSet);
        explore(grid, r, c + 1, visitedSet);

        return true;
    }
}
