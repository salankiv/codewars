package com.salankiv;

import java.util.HashMap;
import java.util.Map;

public class RomanNumeralsConversion {

    public String solution(int n) {

        Map<Integer,String> mapRoman = new HashMap<>();
        mapRoman.put(1000, "M");
        mapRoman.put(500, "D");
        mapRoman.put(100, "C");
        mapRoman.put(50, "L");
        mapRoman.put(10, "X");
        mapRoman.put(5, "V");
        mapRoman.put(1, "I");

        Map<Integer,Integer> mapArabic = new HashMap<>();
        mapArabic.put(1, 1000);
        mapArabic.put(2, 500);
        mapArabic.put(3, 100);
        mapArabic.put(4, 50);
        mapArabic.put(5, 10);
        mapArabic.put(6, 5);
        mapArabic.put(7, 1);

        int div = n;
        int mod;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < 8; i++) {
            mod = div % mapArabic.get(i);
            div = div / mapArabic.get(i);
            if (div < 4 || mapArabic.get(i) == 1000) {
                for (int j = 0; j < div; j++) {
                    sb.append(mapRoman.get(mapArabic.get(i)));
                }
            } else if (sb.length() == 0) {
                sb.append(mapRoman.get(mapArabic.get(i))).append(mapRoman.get(mapArabic.get(i - 1)));
            } else if ((sb.charAt(sb.length() - 1) == 'V') || (sb.charAt(sb.length() - 1) == 'L') || (sb.charAt(sb.length() - 1) == 'D')) {
                sb.delete(sb.length() - 1, sb.length());
                sb.append(mapRoman.get(mapArabic.get(i))).append(mapRoman.get(mapArabic.get(i - 2)));
            } else if ((sb.charAt(sb.length() - 1) == 'X') || (sb.charAt(sb.length() - 1) == 'C') || (sb.charAt(sb.length() - 1) == 'M')) {
                sb.append(mapRoman.get(mapArabic.get(i))).append(mapRoman.get(mapArabic.get(i - 1)));
            }
            div = mod;
        }
        return sb.toString();
    }
}
