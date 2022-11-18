package io.codelex.enums.practice;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Let us begin...");
        int win = 0;
        int lost = 0;
        int tie = 0;
        boolean isEnd = true;
        while (isEnd) {
            System.out.println("Scissor-Paper-Stone");
            Scanner key = new Scanner(System.in);
            boolean isTruth2 = true;
            String winner = "";
            ScissorPaperStone choice2;
            while (isTruth2) {
                System.out.print("   Your turn (Enter s for scissor, p for paper, t for stone, q to quit): ");
                String choice = key.nextLine();
                switch (choice) {
                    case "s" -> {
                        choice2 = ScissorPaperStone.SCISSOR;
                        winner = winner(choice2);
                        isTruth2 = false;
                    }
                    case "p" -> {
                        choice2 = ScissorPaperStone.PAPER;
                        winner = winner(choice2);
                        isTruth2 = false;
                    }
                    case "t" -> {
                        choice2 = ScissorPaperStone.STONE;
                        winner = winner(choice2);
                        isTruth2 = false;
                    }
                    case "q" -> {
                        isTruth2 = false;
                        isEnd = false;
                    }
                    default -> System.out.println("   Invalid input, try again...");
                }
                System.out.println();
            }

            switch (winner) {
                case "W" -> win++;
                case "L" -> lost++;
                case "T" -> tie++;
            }

        }
        int sum = win + lost + tie;
        System.out.println("Number of trials: " + sum);
        double computerWon = (lost / (double) sum) * 100;
        double myWin = (win / (double) sum) * 100;
        double ourTie = (tie / (double) sum) * 100;
        System.out.print("I won " + lost + "(" + String.format("%.2f", computerWon) + "). ");
        System.out.print("You won " + win + "(" + String.format("%.2f", myWin) + "). ");
        System.out.print("Tie " + tie + "(" + String.format("%.2f", ourTie) + "). \n");
        System.out.println("Bye!");
    }

    public static String winner(ScissorPaperStone choice2) {
        int random = new Random().nextInt(3);
        String result = "";
        switch (random) {
            case 0 -> System.out.println("   My turn: SCISSOR");
            case 1 -> System.out.println("   My turn: PAPER");
            case 2 -> System.out.println("   My turn: STONE");
        }
        switch (choice2) {
            case SCISSOR:
                if (random == 0) {
                    System.out.println("   Tie!");
                    result += "T";
                    break;
                } else if (random == 1) {
                    System.out.println("   You won!");
                    result += "W";
                    break;
                } else {
                    System.out.println("   Stone breaks scissor, I won!");
                    result += "L";
                    break;
                }
            case PAPER:
                if (random == 1) {
                    System.out.println("   Tie!");
                    result += "T";
                    break;
                } else if (random == 2) {
                    System.out.println("   You won!");
                    result += "W";
                    break;
                } else {
                    System.out.println("   Scissor cuts paper, I won!");
                    result += "L";
                    break;
                }
            case STONE:
                if (random == 2) {
                    System.out.println("   Tie!");
                    result += "T";
                    break;
                } else if (random == 0) {
                    System.out.println("   You won!");
                    result += "W";
                    break;
                } else {
                    System.out.println("   Paper wraps stone, I won!");
                    result += "L";
                    break;
                }
        }
        return result;
    }
}
