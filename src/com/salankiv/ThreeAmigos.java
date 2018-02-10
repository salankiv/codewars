package com.salankiv;

public class ThreeAmigos {

    public static int[] threeAmigos(final int[] numbers) {
        int[] base = new int[3];
        int[] toCheck = new int[3];
        int startIndex = 0;
        base[0] = numbers[startIndex];
        base[1] = numbers[startIndex + 1];
        base[2] = numbers[startIndex + 2];

        if (numbers.length == 3 && !checkBase(base)) {
            return new int[]{};
        }

        while (!checkBase(base) && (startIndex < numbers.length - 2)) {
            base[0] = numbers[startIndex];
            base[1] = numbers[startIndex + 1];
            base[2] = numbers[startIndex + 2];
            startIndex++;
        }

        if (numbers.length > 3 && checkBase(base)) {
            for (int i = startIndex; i < numbers.length - 2; i++) {
                for (int j = 0; j < 3; j++) {
                    toCheck[j] = numbers[i + j];
                }
                if (!checkBase(toCheck)) {
                } else if (getRange(toCheck) < getRange(base)) {
                    for (int j = 0; j < 3; j++) {
                        base[j] = toCheck[j];
                    }
                }
            }
        } else if (!checkBase(base)) {
            base = new int[]{};
        }

        return base;
    }

    public static boolean checkBase(int[] base) {
        return Math.abs(base[0] % 2) == Math.abs(base[1] % 2) && Math.abs(base[1] % 2) == Math.abs(base[2] % 2);
    }

    public static double getRange(int[] nums) {
        double a = minNum(nums);
        double b = maxNum(nums);
        return b - a;
    }

    public static double minNum(int[] nums) {
        double min = (double) nums[0];
        if (min > (double) nums[1]) {
            min = (double) nums[1];
        }
        if (min > (double) nums[2]) {
            min = (double) nums[2];
        }
        return min;
    }

    public static double maxNum(int[] nums) {
        double max = (double) nums[0];
        if (max < (double) nums[1]) {
            max = (double) nums[1];
        }
        if (max < (double) nums[2]) {
            max = (double) nums[2];
        }
        return max;
    }

}
