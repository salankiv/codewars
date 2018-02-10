package com.salankiv;

public class BitCounting {

    public static int countBits(int n){
        int bitCount = 0;
        while (n >= 1) {
            if (n % 2 == 1) {
                bitCount += 1;
                n = n / 2;
            } else {
                n = n / 2;
            }
        }
        return bitCount;
    }

}
