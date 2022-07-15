package com.sportradar.Handlers;

import java.util.*;
import com.sportradar.Utils.Pair;

public class ScoreboardHandler {
    private LinkedHashMap<Pair<String, String>, Pair<Integer, Integer>> scores = new LinkedHashMap<>();

    public ScoreboardHandler() {
        initializeCollections();
    }

    private void initializeCollections() {

        scores.put(new Pair<>("Mexico", "Canada"), new Pair<>(0, 0));
        scores.put(new Pair<>("Germany", "France"), new Pair<>(0, 0));
        scores.put(new Pair<>("Spain", "Brazil"), new Pair<>(0, 0));
        scores.put(new Pair<>("Uruguay", "Italy"), new Pair<>(0, 0));
        scores.put(new Pair<>("Argentina", "Australia"), new Pair<>(0, 0));

    }

    public void updateScores(String key, String value, int homeScore, int awayScore) {
        Pair<String, String> p = new Pair<>(key, value);
        for(var entry : scores.entrySet()) {
            if(p.equals(entry.getKey())) {
                scores.replace(entry.getKey(), new Pair<>(homeScore, awayScore));
            }
        }
    }

    public void printScoreboard() {
        List<Map.Entry<Pair, Integer>> list = new ArrayList<>();

        for(var entry : scores.entrySet()) {
            list.add(Map.entry(entry.getKey(), (entry.getValue().getKey() + entry.getValue().getValue())));
        }
        list.sort(Map.Entry.comparingByValue());

        Collections.reverse(list);

        for(var element : list) {
            System.out.println(element.getKey().getKey() + " - " + element.getKey().getValue() + " " + element.getValue());
        }
    }

}
