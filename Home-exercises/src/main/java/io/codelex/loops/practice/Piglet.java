package io.codelex.loops.practice;


import java.util.Scanner;

public class Piglet {


    public int throwDie() {
        return (int) (Math.random() * 6) + 1;
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Piglet!");
        boolean g = true;
        Piglet pig = new Piglet();
        int score = 0;
        while (g) {

            int a = pig.throwDie();
            score = score + a;
            System.out.println("You rolled a " + a + "!");
            if (a == 1) {
                score = 0;
                System.out.println("You got " + score + " points.");
                break;
            }

            System.out.print("Roll again? ");
            Scanner in = new Scanner(System.in);
            String b = in.nextLine();
            if (b.equals("y") | b.equals("Y") | b.equals("yes") | b.equals("YES") | b.equals("Yes")) {
                g = true;
            } else if (b.equals("n") | b.equals("N") | b.equals("no") | b.equals("NO") | b.equals("No")) {
                g = false;
                System.out.println("You got " + score + " points.");
            }
        }

    }
}

