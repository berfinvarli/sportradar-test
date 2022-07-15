package com.sportradar.Utils;

import java.util.LinkedHashMap;

public class Utils {
    public static void initializeCollections(LinkedHashMap<Pair<String, String>, Pair<Integer, Integer>> scores) {
        scores.put(new Pair<>("Mexico", "Canada"), new Pair<>(0, 0));
        scores.put(new Pair<>("Germany", "France"), new Pair<>(0, 0));
        scores.put(new Pair<>("Spain", "Brazil"), new Pair<>(0, 0));
        scores.put(new Pair<>("Uruguay", "Italy"), new Pair<>(0, 0));
        scores.put(new Pair<>("Argentina", "Australia"), new Pair<>(0, 0));
    }

    public static String formatInputs(String word) {
        word = word.toLowerCase();
        word = word.substring(0, 1).toUpperCase() + word.substring(1);
        return word;
    }

}
