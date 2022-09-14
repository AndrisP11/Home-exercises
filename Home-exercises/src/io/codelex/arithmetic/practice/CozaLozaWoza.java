package io.codelex.arithmetic.practice;

public class CozaLozaWoza {
    public static void main(String[] args) {
        for (int i = 1; i <= 110; i++) {
            boolean b = false;
            if (i % 3 == 0) {
                System.out.print("Coza");
                b = true;
            }
            if (i % 5 == 0) {
                System.out.print("Loza");
                b = true;
            }
            if (i % 7 == 0) {
                System.out.print("Woza");
                b = true;
            }
            if (!b) {
                System.out.print(i + " ");
            } else {
                System.out.print(" ");
            }
            if (i % 11 == 0) {
                System.out.print("\n");
            }
        }

    }
}

