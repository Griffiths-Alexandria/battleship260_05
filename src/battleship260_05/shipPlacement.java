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
    /*
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
    */
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
    
    private Boolean[][] secretBoard = {
        {null, null, null, null, null, null},
        {null, false, false, false, false, false},
        {null, false, false, false, false, false},
        {null, false, false, false, false, false},
        {null, false, false, false, false, false},
        {null, false, false, false, false, false}
    };
    
    void randomizeSetup() {
        Scanner input = new Scanner(System.in);
        Random secret = new Random();
        int tries = 0;
        int coOrd1 = secret.nextInt(5);
        int coOrd2 = secret.nextInt(5);
        secretBoard[coOrd1+1][coOrd2+1] = true;
        for (int i = 0; i < this.randomBoard.length; i++) {
            System.out.println(randomBoard[i][0] + randomBoard[i][1] + randomBoard[i][2] + randomBoard[i][3] + randomBoard[i][4] + randomBoard[i][5]);
        }
        while (!sunk) {
            System.out.println();
            System.out.println("Please enter some coordinates:");
            String coOrds = input.nextLine();
            coOrds = coOrds.trim().toUpperCase();
            switch (coOrds) {
                case "A1":
                    if (secretBoard[1][1] == true) {
                        randomBoard[1][1] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[1][1] = "[O]";
                    }
                    break;
                case "A2":
                    if (secretBoard[1][2] == true) {
                        randomBoard[1][2] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[1][2] = "[O]";
                    }
                    break;
                case "A3":
                    if (secretBoard[1][3] == true) {
                        randomBoard[1][3] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[1][3] = "[O]";
                    }
                    break;
                case "A4":
                    if (secretBoard[1][4] == true) {
                        randomBoard[1][4] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[1][4] = "[O]";
                    }
                    break;
                case "A5":
                    if (secretBoard[1][5] == true) {
                        randomBoard[1][5] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[1][5] = "[O]";
                    }
                    break;
                case "B1":
                    if (secretBoard[2][1] == true) {
                        randomBoard[2][1] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[2][1] = "[O]";
                    }
                    break;
                case "B2":
                    if (secretBoard[2][2] == true) {
                        randomBoard[2][2] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[2][2] = "[O]";
                    }
                    break;
                case "B3":
                    if (secretBoard[2][3] == true) {
                        randomBoard[2][3] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[2][3] = "[O]";
                    }
                    break;
                case "B4":
                    if (secretBoard[2][4] == true) {
                        randomBoard[2][4] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[2][4] = "[O]";
                    }
                    break;
                case "B5":
                    if (secretBoard[2][5] == true) {
                        randomBoard[2][5] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[2][5] = "[O]";
                    }
                    break;
                case "C1":
                    if (secretBoard[3][1] == true) {
                        randomBoard[3][1] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[3][1] = "[O]";
                    }
                    break;
                case "C2":
                    if (secretBoard[3][2] == true) {
                        randomBoard[3][2] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[3][2] = "[O]";
                    }
                    break;
                case "C3":
                    if (secretBoard[3][3] == true) {
                        randomBoard[3][3] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[3][3] = "[O]";
                    }
                    break;
                case "C4":
                    if (secretBoard[3][4] == true) {
                        randomBoard[3][4] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[3][4] = "[O]";
                    }
                    break;
                case "C5":
                    if (secretBoard[3][5] == true) {
                        randomBoard[3][5] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[3][5] = "[O]";
                    }
                    break;
                case "D1":
                    if (secretBoard[4][1] == true) {
                        randomBoard[4][1] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[4][1] = "[O]";
                    }
                    break;
                case "D2":
                    if (secretBoard[4][2] == true) {
                        randomBoard[4][2] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[4][2] = "[O]";
                    }
                    break;
                case "D3":
                    if (secretBoard[4][3] == true) {
                        randomBoard[4][3] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[4][3] = "[O]";
                    }
                    break;
                case "D4":
                    if (secretBoard[4][4] == true) {
                        randomBoard[4][4] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[4][4] = "[O]";
                    }
                    break;
                case "D5":
                    if (secretBoard[4][5] == true) {
                        randomBoard[4][5] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[4][5] = "[O]";
                    }
                    break;
                case "E1":
                    if (secretBoard[5][1] == true) {
                        randomBoard[5][1] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[5][1] = "[O]";
                    }
                    break;
                case "E2":
                    if (secretBoard[5][2] == true) {
                        randomBoard[5][2] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[5][2] = "[O]";
                    }
                    break;
                case "E3":
                    if (secretBoard[5][3] == true) {
                        randomBoard[5][3] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[5][3] = "[O]";
                    }
                    break;
                case "E4":
                    if (secretBoard[5][4] == true) {
                        randomBoard[5][4] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[5][4] = "[O]";
                    }
                    break;
                case "E5":
                    if (secretBoard[5][5] == true) {
                        randomBoard[5][5] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[5][5] = "[O]";
                    }
                    break;
                default:
                    System.out.println("Incorrect coordinates...");
                    break;
            }
            tries++;
            for (int i = 0; i < this.randomBoard.length; i++) {
                System.out.println(randomBoard[i][0] + randomBoard[i][1] + randomBoard[i][2] + randomBoard[i][3] + randomBoard[i][4] + randomBoard[i][5]);
            }
        }
    System.out.println("It only took you " + tries + " tries to find it!");
    input.nextLine();
    }
}
