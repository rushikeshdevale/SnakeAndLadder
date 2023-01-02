package com.snkLadder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int position = 0;
        System.out.println("Welcome into Snake and Ladder program !!");
        System.out.println("position is " + position);
        int diceValue = (int) (Math.random() * 10) % 6 + 1;
        Utility utility = new Utility();
        utility.playOption(position, diceValue);

    }
}

class Utility {

    public void playOption(int position, int diceValue) {

        while (position <= 99) {

            int optionValue = (int) (Math.random() * 10) % 3 + 1;

            switch (optionValue) {
                case 1:
                    System.out.println("No Play....You are in the same position");
                    break;

                case 2:
                    position = (position + diceValue);

                    System.out.println("your position after ladder is :" + position);
                    break;

                case 3:
                    position = (position - diceValue);

                    if (position < 0) {
                        position = 0;
                    }
                    System.out.println("Your Position after snake is" + position);
                    break;
            }
        }
    }

}
