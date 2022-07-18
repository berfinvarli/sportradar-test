package com.sportradar.Handlers;

import com.sportradar.Utils.Pair;
import com.sportradar.Utils.Utils;

import java.util.*;

public class ScoreboardHandler {
    private LinkedHashMap<Pair<String, String>, Pair<Integer, Integer>> scores = new LinkedHashMap<>();

    public ScoreboardHandler() {
        Utils.initializeCollections(scores);
    }

    public void updateScores(String key, String value, int homeScore, int awayScore) {
        if (homeScore < 0 || awayScore < 0) {
            System.out.println("Scores cannot be below 0");
            return;
        }

        key = Utils.formatInputs(key);
        value = Utils.formatInputs(value);

        Pair<String, String> p = new Pair<>(key, value);
        for (var entry : scores.entrySet()) {
            if (p.equals(entry.getKey())) {
                // Insertion order preserved. Removed scores.replace()
                scores.remove(entry.getKey());
                scores.put(new Pair<>(key, value), new Pair<>(homeScore, awayScore));
                System.out.println("Updated!");
                return;
            }
        }
        System.out.println("Could not find " + key + " or " + value + " in the system");
    }
    
    public void removeGame(String key, String value) {
        key = Utils.formatInputs(key);
        value = Utils.formatInputs(value);

        Pair<String, String> p = new Pair<>(key, value);
        for (var entry : scores.entrySet()) {
            if (p.equals(entry.getKey())) {
                scores.remove(entry.getKey());
                System.out.println("Removed!");
                return;
            }
        }
        System.out.println("Could not find " + key + " or " + value + " in the system");
    }
    
    public void printScoreboard() {
        List<Map.Entry<Pair<String, String>, Integer>> list = new ArrayList<>();

        for (var entry : scores.entrySet()) {
            list.add(Map.entry(entry.getKey(), (entry.getValue().getKey() + entry.getValue().getValue())));
        }
        list.sort(Map.Entry.comparingByValue());

        Collections.reverse(list);

        for (var element : list) {
            System.out.println(element.getKey().getKey()  + " " + scores.get(element.getKey()).getKey() + " - " + element.getKey().getValue() + " " + scores.get(element.getKey()).getValue());
        }
        System.out.println();
    }

}
