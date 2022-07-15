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
            return;
        }

        key = Utils.formatInputs(key);
        value = Utils.formatInputs(value);

        Pair<String, String> p = new Pair<>(key, value);
        for (var entry : scores.entrySet()) {
            if (p.equals(entry.getKey())) {
                scores.replace(entry.getKey(), new Pair<>(homeScore, awayScore));
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
            System.out.println(element.getKey().getKey() + " - " + element.getKey().getValue() + " " + element.getValue());
        }
        System.out.println();
    }

}
