package com.snkLadder;

public class SnakeAndLadder {
    public static void main(String[] args) {
        int position = 0;
        System.out.println("Welcome into Snake and Ladder program !!");
        System.out.println("Your Starting Position is : " + position);
        int die = (int) (Math.random() * 10) % 6 + 1;
        System.out.println("dice value is " + die);
        int value = (int) (Math.random() * 10) % 3 + 1;
        System.out.println("case number is " + value);

        switch(value) {
            case 1:
                System.out.println( "No Play You are in the same position." );
                break;

            case 2:
                position = (position + die);
                System.out.println( "your position after ladder is ::" + position );
                break;

            case 3:
                position = (position - die);

                if(position<0){
                    position = 0;
                }
                System.out.println( "Your Position after snake is::" + position );
                break;
        }
    }
}
