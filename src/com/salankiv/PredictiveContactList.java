package com.salankiv;

import java.util.*;

public class PredictiveContactList {

    public static List<String> predict(List<String> contacts, String keystrokes) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "");
        map.put("2", "abc");
        map.put("3", "def");
        map.put("4", "ghi");
        map.put("5", "jkl");
        map.put("6", "mno");
        map.put("7", "pqrs");
        map.put("8", "tuv");
        map.put("9", "wxyz");
        map.put("0", "");

        List<String> list = new ArrayList<>();
        for (int i = 0; i < keystrokes.length(); i++) {
            for (int j = 0; j < map.get(String.valueOf(keystrokes.charAt(i))).length(); j++) {
                for (String s : contacts) {
                    if (map.get(Character.toString(keystrokes.charAt(i))).charAt(j) == s.charAt(i)) {
                        list.add(s);
                    }
                }
            }
            contacts = new ArrayList<>();
            for (String s : list) {
                contacts.add(s);
            }
            list = new ArrayList<>();
        }
        return contacts;
    }
}
