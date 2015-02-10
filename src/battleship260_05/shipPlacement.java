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
    
    int x = 5;
    int y = 5;
    int tries;
    void cpuPlacement(int[][] board) {
        while (sunk != true) {
            int guess1 = roll.nextInt(x);
            int guess2 = roll.nextInt(y);
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
}
