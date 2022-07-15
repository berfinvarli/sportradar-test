package com.sportradar;

import com.sportradar.Handlers.ScoreboardHandler;

import java.util.Scanner;

/**
 * {@inheritDoc}
 *
 * @Author Berfin Varlı
 * <p>Read ReadMe.md file</p>
 * <p>Run java -jar "jarfilename".jar</p>
 */
public class Main {
    static ScoreboardHandler scoreboardHandler = new ScoreboardHandler();
    static boolean finishSimulation = false;

    public static void printTable() {
        System.out.println("Input 1 to enter new scores");
        System.out.println("Input 2 to enter print results");
        System.out.println("Input 3 to Exit");
    }

    public static void simulate() {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("\nCurrent Scoreboard");
        scoreboardHandler.printScoreboard();

        printTable();

        while (!finishSimulation) {
            try {
                choice = sc.nextInt();

                if (choice == 1) {
                    String homeTeam;
                    String awayTeam;
                    int homeScore;
                    int awayScore;
                    try {
                        System.out.println("Enter Home Team Name: ");
                        homeTeam = sc.next();
                        System.out.println("Enter Home Team Score: ");
                        homeScore = sc.nextInt();
                        System.out.println("Enter Away Team Name: ");
                        awayTeam = sc.next();
                        System.out.println("Enter Away Team Score: ");
                        awayScore = sc.nextInt();

                        scoreboardHandler.updateScores(homeTeam, awayTeam, homeScore, awayScore);
                    } catch (Exception e) {
                        System.err.println("Required Integer, Entered String");
                        simulate();
                    }

                } else if (choice == 2) {
                    scoreboardHandler.printScoreboard();
                } else if (choice == 3) {
                    finishSimulation = true;
                } else {
                    System.err.println("Enter Between 1-3");
                    printTable();
                }
            } catch (Exception e) {
                System.err.println("Required Integer, Entered String");
                simulate();
            }
        }
    }

    public static void main(String[] args) {

        simulate();

        System.out.println("Exited");
    }
}
