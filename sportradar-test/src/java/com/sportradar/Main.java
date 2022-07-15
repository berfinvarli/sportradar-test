package com.sportradar;

import com.sportradar.Handlers.ScoreboardHandler;

public class Main {
    public static void main(String[] args){
        ScoreboardHandler scoreboardHandler = new ScoreboardHandler();

        scoreboardHandler.updateScores("Spain", "Brazil", 3, 2);
        scoreboardHandler.updateScores("Mexico", "Canada", 0, 5);

        scoreboardHandler.printScoreboard();

    }
}
