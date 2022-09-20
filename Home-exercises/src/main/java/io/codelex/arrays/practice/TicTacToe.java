package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static char[][] board = new char[3][3];

    public static void main(String[] args) {
        boolean winnerX = false;
        boolean winnerO = false;
        boolean winnerT = false;
        boolean winner = false;
        initBoard();
        int turn = 1;
        while (!winner) {

            displayBoard();
            Scanner keyboard = new Scanner(System.in);
            char pTurn = playerTurn(turn);
            System.out.print("'" + pTurn + "'" + " , choose your location (row, column): ");
            int row = keyboard.nextInt();
            int column = keyboard.nextInt();
            playerMark(row, column, pTurn);

            winnerX = checkWinnerX(winnerX);
            winnerO = checkWinnerO(winnerO);
            winnerT = checkWinnerT(winnerT, turn);
            if (winnerT) {
                System.out.println();
                System.out.println("The game is a tie.");
                winner = true;
            } else if (winnerX) {
                System.out.println();
                System.out.println("'X' has won the game.");
                winner = true;
            } else if (winnerO) {
                System.out.println();
                System.out.println("'O' has won the game.");
                winner = true;
            }
            turn++;
        }
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static boolean checkWinnerX(boolean winnerX) {

        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') {
            winnerX = true;
        } else if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') {
            winnerX = true;
        } else if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') {
            winnerX = true;
        } else if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') {
            winnerX = true;
        } else if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') {
            winnerX = true;
        } else if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') {
            winnerX = true;
        } else if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') {
            winnerX = true;
        } else if (board[0][2] == 'X' && board[1][1] == 'X' && board[2][0] == 'X') {
            winnerX = true;
        }
        return winnerX;
    }

    public static boolean checkWinnerO(boolean winnerO) {
        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') {
            winnerO = true;
        } else if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') {
            winnerO = true;
        } else if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') {
            winnerO = true;
        } else if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') {
            winnerO = true;
        } else if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') {
            winnerO = true;
        } else if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') {
            winnerO = true;
        } else if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') {
            winnerO = true;
        } else if (board[0][2] == 'O' && board[1][1] == 'O' && board[2][0] == 'O') {
            winnerO = true;
        }
        return winnerO;
    }

    public static boolean checkWinnerT(boolean winnerT, int turn) {
        if (turn == 9) {
            winnerT = true;
        }
        return winnerT;
    }

    public static char playerTurn(int turn) {
        if (turn % 2 == 0) {
            return 'O';
        } else {
            return 'X';
        }
    }

    public static void playerMark(int row, int column, char turn) {
        while (board[row][column] != ' ') {
            System.err.println("'" + turn + "'" + " can't fill already filled space.");
            System.err.print("'" + turn + "'" + ", choose your location (row, column): ");
            Scanner keyboard = new Scanner(System.in);
            row = keyboard.nextInt();
            column = keyboard.nextInt();
        }

        board[row][column] = turn;

    }
}