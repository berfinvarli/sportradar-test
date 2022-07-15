package com.sportradar;

import com.sportradar.Handlers.ScoreboardHandler;
import java.util.Scanner;
/**
 * {@inheritDoc}
 * @Author Berfin Varlı
 * <p>Read ReadMe.md file</p>
     * <p>Run java -jar "jarfilename".jar</p>
 */
public class Main {

    public static void simulate() {
        ScoreboardHandler scoreboardHandler = new ScoreboardHandler();
        boolean finishSimulation = false;
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("\nCurrent Scoreboard");
        scoreboardHandler.printScoreboard();

        while (!finishSimulation) {
            choice = sc.nextInt();
            if (choice == 1) {
                String homeTeam;
                String awayTeam;
                int homeScore;
                int awayScore;

                System.out.println("Enter Home Team Name: ");
                homeTeam = sc.next();
                System.out.println("Enter Home Team Score: ");
                homeScore = sc.nextInt();
                System.out.println("Enter Away Team Name: ");
                awayTeam = sc.next();
                System.out.println("Enter Away Team Score: ");
                awayScore = sc.nextInt();

                scoreboardHandler.updateScores(homeTeam, awayTeam, homeScore, awayScore);
                System.out.println("Updated!");
            } else if (choice == 2) {
                scoreboardHandler.printScoreboard();
            } else {
                finishSimulation = true;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Input 1 to enter new scores");
        System.out.println("Input 2 to enter print results");
        System.out.println("Input 3 to Exit");

        simulate();

        System.out.println("Exited");
    }
}
