package io.codelex.arrays.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        String[] words = {"Barricade", "Neuromere", "Frugality", "Manubrium", "Pentalpha",
                "Increment", "Casserole", "Dimensity", "Imperfect", "Knebelite",
                "Bootblack", "Quitclaim", "Houseroom", "Phonolite", "Exudation",
                "Antiloquy", "Resonance", "Triturium", "Filigrain", "Sweinmote",
                "Blaeberry", "Panspermy", "Estrapade", "Sibilance", "Gustation",
                "Serrature", "Greyhound", "Barometer", "Exegetics", "Germarium",
                "Nutriment", "Baenomere", "Forkiness", "Gothamite", "Stockwork",
                "Epuration", "Sorceress", "Gradatory", "Swimmeret", "Innocence",
                "Occultism", "Monolatry", "Walleteer", "Panderage", "Adenalgia",
                "Community", "Pomewater", "Alaternus", "Negotiant", "Outsentry",
                "Autoclave", "Glomerule", "Incession", "Cornfield", "Jutlander",
                "Manumotor", "Mundanity", "Alembroth", "Lentiscus", "Sarcoptid",
                "Mesonotum", "Dannebrog", "Canniness", "Attracter", "Tributary",
                "Treachour", "Nestorian", "Orthodoxy", "Calcimine", "Dekaliter",
                "Allograph", "Aquatinta", "Pursuance", "Sepiolite", "Anniverse"};

        boolean quit = false;
        while (!quit) {
            String word = randomWord(words);

            String[] displayWord = new String[word.length()];
            Arrays.fill(displayWord, "_");

            quit = game(word, displayWord);

        }
    }

    private static String randomWord(String[] words) {
        Random r = new Random();
        int i = r.nextInt(75 - 1) + 1;
        return words[i].toLowerCase();
    }

    private static boolean game(String word, String[] displayWord) {
        boolean play = false;
        String misses = "";
        int turns = 0;
        String line1 = "-=";
        line1 = line1.repeat(13) + "-";
        String[] line2 = word.split("");

        while (!play) {

            display(line1, displayWord, misses);
            System.out.print("Guess:   ");
            Scanner keyboard = new Scanner(System.in);
            String letter = keyboard.nextLine();
            boolean countMisses = false;
            for (int d = 0; d < line2.length; d++) {
                if (letter.equals(line2[d])) {
                    displayWord[d] = letter;
                    countMisses = true;
                }
            }
            if (!countMisses) {
                misses += letter;
                turns++;
            }
            int lettersGuessed = 0;
            for (String s : displayWord) {
                if (s.equals("_")) {
                    lettersGuessed++;
                }
            }
            play = turns == 6 || lettersGuessed == 0;

        }

        display(line1, displayWord, misses);
        int winLose = 0;
        for (int p = 0; p < displayWord.length; p++) {
            if (displayWord[p].equals(line2[p])) {
                winLose++;
            }
        }
        if (winLose == line2.length) {
            System.out.println("YOU GOT IT!");
        } else {
            System.out.println("YOU LOST!");
        }
        return againQuit();
    }

    private static void display(String line1, String[] displayWord, String misses) {
        System.out.println(line1);
        System.out.println();
        System.out.print("Word:   ");
        for (String s : displayWord) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Misses:   " + misses);
        System.out.println();
    }

    private static boolean againQuit() {
        boolean ag;
        while (true) {
            System.out.println();
            System.out.println("Play \"again\" or \"quit\"? quit");
            Scanner keyboard = new Scanner(System.in);
            String playAgain = keyboard.nextLine();

            if (playAgain.equals("again")) {
                ag = false;
                break;
            } else if (playAgain.equals("quit")) {
                ag = true;
                break;
            }
        }
        return ag;
    }
}
