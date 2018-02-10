package com.salankiv;

public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
        return (((sum * 2) + (sum * 2 - (2 * n))) / 2) * n;
    }
}