package com.snkLadder;

public class SnakeAndLadder {

    public static void main(String[] args) {
        System.out.println("Welcome into Snake and Ladder program !! ");
        int positionPlayer1 = 0;
        int positionPlayer2 = 0;
        int diceRollCount = 0;
        System.out.println("Player 1 position is ::" + positionPlayer1);
        System.out.println("Player 2 position is ::" + positionPlayer2);
        int diceValPlayer1 = (int) (Math.random() * 10) % 6 + 1;
        int diceValPlayer2 = (int) (Math.random() * 10) % 6 + 1;
        Utility utility = new Utility();
        utility.playOption(positionPlayer1, positionPlayer2, diceValPlayer1, diceValPlayer2, diceRollCount);

    }
}

class Utility {
    public void playOption(int positionPlayer1, int positionPlayer2, int diceValPlayer1, int diceValPlayer2,
                           int diceRollCount) {
        while ((positionPlayer1 <= 99) && (positionPlayer2 <= 99)) {
            int optionValPlayer1 = (int) (Math.random() * 10) % 3 + 1;
            int optionValPlayer2 = (int) (Math.random() * 10) % 3 + 1;
            positionPlayer1 = (positionPlayer1 + diceValPlayer1);
            positionPlayer2 = (positionPlayer2 + diceValPlayer2);

            diceRollCount++;

            switch (optionValPlayer1) {
                case 1:
                    System.out.println("No Play....You are in the same position");
                    break;

                case 2:
                    positionPlayer1 = (positionPlayer1 + diceValPlayer1);
                    if (positionPlayer1 > 100) {
                        positionPlayer1 = (positionPlayer1 - diceValPlayer1);
                        continue;
                    }
                    System.out.println("Player 1 position after ladder is :" + positionPlayer1);
                    break;

                case 3:
                    positionPlayer1 = (positionPlayer1 - diceValPlayer1);

                    if (positionPlayer1 < 0) {
                        positionPlayer1 = 0;
                    }
                    System.out.println("Player 1 Position after snake is" + positionPlayer1);
                    break;
            }

            switch (optionValPlayer2) {
                case 1:
                    System.out.println("No Play....You are in the same position");
                    break;

                case 2:
                    positionPlayer2 = (positionPlayer2 + diceValPlayer2);
                    if (positionPlayer2 > 100) {
                        positionPlayer2 = (positionPlayer2 - diceValPlayer2);
                        continue;
                    }
                    System.out.println("Player 2 position after ladder is :" + positionPlayer2);
                    break;

                case 3:
                    positionPlayer1 = (positionPlayer2 - diceValPlayer2);

                    if (positionPlayer2 < 0) {
                        positionPlayer2 = 0;
                    }
                    System.out.println("Player 2 Position after snake is" + positionPlayer2);
                    break;
            }

        }
        System.out.println("Player 1 final Position is" + positionPlayer1);
        System.out.println("Player 2 final Position is" + positionPlayer2);
        System.out.println("dice play number:: " + diceRollCount);
    }
}
