package com.example.graphs;

import java.util.HashSet;

public class MinimumIsland {
    public static int getMinimumIsland(String[][] grid) {
        int islandSize = Integer.MAX_VALUE;
        HashSet<String> visitedPosition = new HashSet<>();
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[0].length; column++) {
                int lenght = explore(grid, row, column, visitedPosition);
                if (lenght > 0)
                    islandSize = Math.min(islandSize, lenght);
            }
        }

        return islandSize != Integer.MAX_VALUE ? islandSize : -1;
    }

    private static int explore(String[][] grid, int row, int column, HashSet<String> visitedPosition) {

        int islandSize = 1;
        boolean validRow = 0 <= row && row < grid.length;
        boolean validColumn = 0 <= column && column < grid[0].length;

        if (!validColumn || !validRow)
            return 0;
        if (grid[row][column].equalsIgnoreCase("W"))
            return 0;

        String pos = row + ";" + column;
        if (visitedPosition.contains(pos))
            return 0;

        visitedPosition.add(pos);

        islandSize += explore(grid, row - 1, column, visitedPosition);
        islandSize += explore(grid, row + 1, column, visitedPosition);
        islandSize += explore(grid, row, column - 1, visitedPosition);
        islandSize += explore(grid, row, column + 1, visitedPosition);

        return islandSize;
    }
}
