package com.salankiv;

public class Square {
    public static boolean isSquare(int n) {
        int num = 0;
        for (int i = 1; i < n; i += 2) {
            if ((num + i) == n) {
                return true;
            } else num = num + i;
        }
        return false;
    }
}
