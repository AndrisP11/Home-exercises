package io.codelex.loops.practice;


import java.util.Random;
import java.util.Scanner;

public class Piglet {


    private int throwDie() {
        Random random = new Random();
        return (random.nextInt(6)) + 1;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Piglet!");
        boolean isGameAgain = true;
        Piglet pig = new Piglet();
        int score = 0;
        while (isGameAgain) {

            int throwResult = pig.throwDie();
            score = score + throwResult;
            System.out.println("You rolled a " + throwResult + "!");
            if (throwResult == 1) {
                score = 0;
                System.out.println("You got " + score + " points.");
                break;
            }

            System.out.print("Roll again? ");
            Scanner in = new Scanner(System.in);
            String gameAgain = in.nextLine();
            if (gameAgain.equals("y") || gameAgain.equals("Y") || gameAgain.equals("yes") || gameAgain.equals("YES") || gameAgain.equals("Yes")) {
                isGameAgain = true;
            } else if (gameAgain.equals("n") || gameAgain.equals("N") || gameAgain.equals("no") || gameAgain.equals("NO") || gameAgain.equals("No")) {
                isGameAgain = false;
                System.out.println("You got " + score + " points.");
            }
        }

    }
}

