package com.salankiv;

public class DingleMouse {

    public static boolean child(final String bird1, final String bird2) {
        int diffCount = 0;
        for (int i = 0; i < bird1.length(); i++) {
            if (bird1.charAt(i) != bird2.charAt(i)) {
                diffCount++;
            }
        }
        if (diffCount > 0 && diffCount <= 2) {
            return true;
        }
        return false;
    }

    public static boolean grandchild(final String bird1, final String bird2) {
        if (bird1.equals(bird2) && bird1.length() == 1) {
            return true;
        } else if (bird1.length() == 1) {
            return false;
        }   else {
            int diffCount = 0;
            for (int i = 0; i < bird1.length(); i++) {
                if (bird1.charAt(i) != bird2.charAt(i)) {
                    diffCount++;
                }
            }
            if (diffCount <= 4) {
                return true;
            }
        }
        return false;
    }

}
