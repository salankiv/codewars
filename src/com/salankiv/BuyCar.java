package com.salankiv;

public class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
        double oldCarValue = startPriceOld;
        double otherSaving = 0;
        double savings = oldCarValue + otherSaving;
        double cost = startPriceNew;
        int months = 1;
        while (cost > savings) {
            if (months % 2 == 0 && months != 0) {
                percentLossByMonth += 0.5;
            }
            cost = cost * (1 - percentLossByMonth / 100);
            oldCarValue = oldCarValue * (1 - percentLossByMonth / 100);
            otherSaving += savingperMonth;
            savings = oldCarValue + otherSaving;
            months ++;
        }
        int[] result = new int[2];
        result[0] = months - 1;
        result[1] = (int) Math.round(savings - cost);
        return result;
    }
}
