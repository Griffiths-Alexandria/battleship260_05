/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

import java.util.*;

/**
 *
 * @author Christian
 */
public class shipPlacement {
    void getCoordinates() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some coordinates (Letter and number):");
        String coOrds = input.nextLine();
        String coOrdA = coOrds.substring(0, 2);
        coOrdA = coOrdA.toUpperCase();
        String coOrdB = coOrds.substring(2);
        System.out.println();
        System.out.println("You entered: " + coOrds + "\nWe see: " + coOrdA + coOrdB);
        System.out.println("\nPress Enter to Continue...");
        input.nextLine();
    }
    
    Boolean sunk = false;
    int here = 5;
    Random roll = new Random();
    
    shipPlacement() {
    }
    
    public int[][] createBoard() {
        int board[][] = new int[5][5];
        board[0][0] = 4;
        board[0][1] = 3;
        board[0][2] = 2;
        board[0][3] = 1;
        board[0][4] = 0;
        board[1][0] = 5;
        board[1][1] = 4;
        board[1][2] = 3;
        board[1][3] = 2;
        board[1][4] = 1;
        board[2][0] = 6;
        board[2][1] = 5;
        board[2][2] = 4;
        board[2][3] = 3;
        board[2][4] = 2;
        board[3][0] = 7;
        board[3][1] = 6;
        board[3][2] = 5;
        board[3][3] = 4;
        board[3][4] = 3;
        board[4][0] = 8;
        board[4][1] = 7;
        board[4][2] = 6;
        board[4][3] = 5;
        board[4][4] = 4;
        return board;
    }
    void displayBoard() {
        System.out.println("   [1][2][3][4][5]");
        System.out.println("[1][ ][ ][ ][ ][ ]");
        System.out.println("[2][ ][ ][ ][ ][ ]");
        System.out.println("[3][ ][ ][ ][ ][ ]");
        System.out.println("[4][ ][ ][ ][ ][ ]");
        System.out.println("[5][ ][ ][ ][ ][ ]");
    }
    void cpuPlacement(int[][] board) {
        int tries = 0;
        while (sunk != true) {
            int guess1 = roll.nextInt(5);
            int guess2 = roll.nextInt(5);
            if (board[guess1][guess2] > 0) {
                System.out.println("The computer was " + board[guess1][guess2] + " spaces away...");
                tries++;
            }
            if (board[guess1][guess2] == 0) {
                System.out.println("The computer found the point!");
                System.out.println("It took it " + tries + " tries!");
                sunk = true;
            }
        }
    }
    void playerPlacement(int[][] board) {
        int tries = 0;
        Scanner input = new Scanner(System.in);
        while (sunk != true) {
            this.displayBoard();
            System.out.println("Choose a vertical (x) co-ordinate:");
            int x = input.nextInt();
            System.out.println("Choose a horizontal (y) co-ordinate:");
            int y = input.nextInt();
            if (board[x-1][y-1] > 0) {
                System.out.println("That is not it.");
                System.out.println("You are " + board[x-1][y-1] + " spaces away!");
                tries++;
            } else {
                System.out.println("You found it!");
                System.out.println("It only took you " + tries + " tries!");
                sunk = true;
            }
        }
    }
    
    private String[][] randomBoard = {
        {"   ", "[1]", "[2]", "[3]", "[4]", "[5]"},
        {"[A]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
        {"[B]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
        {"[C]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
        {"[D]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
        {"[E]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
    };
    
    void randomizeSetup() {
        Random roll = new Random();
        for (int i = 0; i < 5; i++) {
            int inside = roll.nextInt(3);
            if (inside == 0) {
                randomBoard[1][i+1] = "[X]";
            } else if (inside == 1) {
                randomBoard[1][i+1] = "[O]";
            } else if (inside == 2) {
                randomBoard[1][i+1] = "[#]";
            } else {
                randomBoard[1][i+1] = "[ ]";
            }
        }
        for (int i = 0; i < 5; i++) {
            int inside = roll.nextInt(3);
            if (inside == 0) {
                randomBoard[2][i+1] = "[X]";
            } else if (inside == 1) {
                randomBoard[2][i+1] = "[O]";
            } else if (inside == 2) {
                randomBoard[2][i+1] = "[#]";
            } else {
                randomBoard[2][i+1] = "[ ]";
            }
        }
        for (int i = 0; i < 5; i++) {
            int inside = roll.nextInt(3);
            if (inside == 0) {
                randomBoard[3][i+1] = "[X]";
            } else if (inside == 1) {
                randomBoard[3][i+1] = "[O]";
            } else if (inside == 2) {
                randomBoard[3][i+1] = "[#]";
            } else {
                randomBoard[3][i+1] = "[ ]";
            }
        }
        for (int i = 0; i < 5; i++) {
            int inside = roll.nextInt(3);
            if (inside == 0) {
                randomBoard[4][i+1] = "[X]";
            } else if (inside == 1) {
                randomBoard[4][i+1] = "[O]";
            } else if (inside == 2) {
                randomBoard[4][i+1] = "[#]";
            } else {
                randomBoard[4][i+1] = "[ ]";
            }
        }
        for (int i = 0; i < 5; i++) {
            int inside = roll.nextInt(3);
            if (inside == 0) {
                randomBoard[5][i+1] = "[X]";
            } else if (inside == 1) {
                randomBoard[5][i+1] = "[O]";
            } else if (inside == 2) {
                randomBoard[5][i+1] = "[#]";
            } else {
                randomBoard[5][i+1] = "[ ]";
            }
        }
        for (int i = 0; i < this.randomBoard.length; i++) {
            System.out.println(randomBoard[i][0] + randomBoard[i][1] + randomBoard[i][2] + randomBoard[i][3] + randomBoard[i][4] + randomBoard[i][5]);
        }
    }
}
