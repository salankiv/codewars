package com.salankiv;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        String result = "";
        String temp = "";
        for (int i = 97; i <= 122; i++) {
            temp = temp + (char)i;
            if (s1.contains(temp) || s2.contains(temp)) {
                result = result + temp;
            }
            temp = "";
        }
        return result;
    }
}
