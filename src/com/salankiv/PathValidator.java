package com.salankiv;

import java.util.Arrays;

public class PathValidator {
    static int[] counter;

    public static int getNumberOfReachableFields(boolean[][] grid, int rows, int columns, int startRow, int startColumn) {
        counter = new int[columns];
        for (int i = 0; i < columns; i++) {
            int posX = rows - 1;
            int posY = i;
            int startPosX = startRow;
            int startPosY = startColumn;
            if (checkPosition(grid, posX, posY)) {
                checkIfStart(posX, posY, startPosX, startPosY, copyGrid(grid, rows, columns), i);
            }
        }
        int result = 0;
        for (int i = 0; i < counter.length; i++) {
            if (counter[i] == 1) {
                result++;
            }
        }
        return result;
    }

    public static boolean[][] copyGrid(boolean[][] grid, int rows, int columns) {
        boolean[][] copy = new boolean[rows][columns];
        for (int j = 0; j < grid.length; j++) {
            for (int k = 0; k < grid[j].length; k++) {
                copy[j][k] = grid[j][k];
            }
        }
        return copy;
    }

    public static boolean checkPosition(boolean[][] grid, int posX, int posY) {
        return grid[posX][posY];
    }

    public static void checkIfStart(int posX, int posY, int startPosX, int startPosY, boolean[][] copy, int col) {
        if (posX == startPosX && posY == startPosY) {
            counter[col] = 1;
        } else {
            copy[posX][posY] = false;
            if (posY > 0 && checkPosition(copy, posX, posY - 1)) {
                checkIfStart(posX, posY - 1, startPosX, startPosY, copy, col);
            }
            if (posY < copy[posX].length - 1 && checkPosition(copy, posX ,posY + 1)) {
                checkIfStart(posX, posY + 1, startPosX, startPosY, copy, col);
            }
            if (posX > 0 && checkPosition(copy,posX - 1, posY)) {
                checkIfStart(posX - 1, posY, startPosX, startPosY, copy, col);
            }
        }
    }
}
