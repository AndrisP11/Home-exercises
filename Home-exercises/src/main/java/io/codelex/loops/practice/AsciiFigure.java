package io.codelex.loops.practice;

public class AsciiFigure {

    private static final int ROW_NR = 7;

    public static void main(String[] args) {

        for (int i = 0; i < ROW_NR; i++) {
            int b = (i * 4);
            int line = ((ROW_NR - 1) * 4) - b;
            for (int j = 0; j < line; j++) {
                System.out.print("/");
            }
            for (int d = 0; d < (b * 2); d++) {
                System.out.print("*");
            }
            for (int y = 0; y < line; y++) {
                System.out.print("\\");
            }
            System.out.println();
        }
    }

}
