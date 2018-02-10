package com.salankiv;

import java.util.Arrays;

public class Fracts {

    private static long gcd(long a, long b) {
        while (b > 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    private static long lcm(long a, long b) {
        return a * (b / gcd(a, b));
    }

    public static String convertFrac(long[][] lst) {
        long result = 1;
        for (int i = 0; i < lst.length; i ++) {
            result = lcm(result, lst[i][1]);
        }
        for (int i = 0; i < lst.length; i++) {
            lst[i][0] = lst[i][0] * (result / lst[i][1]);
            lst[i][1] = result;
        }
        String list = "";
        for (int i = 0; i < lst.length; i++) {
            list = list + "(" + lst[i][0] + "," + lst[i][1] + ")";
        }
        return list;
    }

}
