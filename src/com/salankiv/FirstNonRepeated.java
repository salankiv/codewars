package com.salankiv;

import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeated {
    public static Character firstNonRepeated(String source) {
        List<Character> uniqueChars = new ArrayList<>();
        List<Character> notUniqueChars = new ArrayList<>();

        for (int i = 0; i < source.length(); i++) {
            if (!uniqueChars.contains(source.charAt(i)) && !notUniqueChars.contains(source.charAt(i))) {
                uniqueChars.add(source.charAt(i));
            } else {
                uniqueChars.remove(Character.valueOf(source.charAt(i)));
                notUniqueChars.add(source.charAt(i));
            }
        }
        return uniqueChars.get(0);
    }
}
