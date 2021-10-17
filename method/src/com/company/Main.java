package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int level = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver,score,level,bonus);
        System.out.println("final Score = " + highScore);

        score = 10000;
        level = 8;
        bonus = 200;
        highScore = calculateScore(gameOver,score,level,bonus);
        System.out.println("final Score2 = " + highScore);

        int highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("C", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("B", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("A", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("D", highScorePosition);

    }
    public static int calculateScore(boolean gameOver, int score, int level, int bonus){
        if (gameOver) {
            int finalScore = score + (level*bonus);
            finalScore += 2000;
            System.out.println(finalScore);
            return finalScore;
        } else {
            return -1;
        }
    }

    public static void displayHighScorePosition (String name, int table) {
        System.out.println(name + " managed to get into position " + table + "on the high score table.");
    }

    public static int calculateHighScorePosition (int playerScore) {
//        if (playerScore>=1000)
//        {
//            return 1;
//        }else if (playerScore>=500) {
//            return 2;
//        }else if (playerScore >= 100) {
//            return 3;
//        }
//            return 4;
//
        int position = 4;
        if (playerScore>=1000)
        {
            position = 1;
        }else if (playerScore>=500) {
            position = 2;
        }else if (playerScore >= 100) {
            position = 3;
        }
        return position;

    }
}

