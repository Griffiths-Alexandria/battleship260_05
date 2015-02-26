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
    Scanner input = new Scanner(System.in);
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
        System.out.println("[A][ ][ ][ ][ ][ ]");
        System.out.println("[B][ ][ ][ ][ ][ ]");
        System.out.println("[C][ ][ ][ ][ ][ ]");
        System.out.println("[D][ ][ ][ ][ ][ ]");
        System.out.println("[E][ ][ ][ ][ ][ ]");
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
        while (!sunk) {
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
                    if (secretBoard[1][1] = true) {
                        randomBoard[1][1] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[1][1] = "[O]";
                    }
                    break;
                case "A2":
                    if (secretBoard[1][2] = true) {
                        randomBoard[1][2] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[1][2] = "[O]";
                    }
                    break;
                case "A3":
                    if (secretBoard[1][3] = true) {
                        randomBoard[1][3] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[1][3] = "[O]";
                    }
                    break;
                case "A4":
                    if (secretBoard[1][4] = true) {
                        randomBoard[1][4] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[1][4] = "[O]";
                    }
                    break;
                case "A5":
                    if (secretBoard[1][5] = true) {
                        randomBoard[1][5] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[1][5] = "[O]";
                    }
                    break;
                case "B1":
                    if (secretBoard[2][1] = true) {
                        randomBoard[2][1] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[2][1] = "[O]";
                    }
                    break;
                case "B2":
                    if (secretBoard[2][2] = true) {
                        randomBoard[2][2] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[2][2] = "[O]";
                    }
                    break;
                case "B3":
                    if (secretBoard[2][3] = true) {
                        randomBoard[2][3] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[2][3] = "[O]";
                    }
                    break;
                case "B4":
                    if (secretBoard[2][4] = true) {
                        randomBoard[2][4] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[2][4] = "[O]";
                    }
                    break;
                case "B5":
                    if (secretBoard[2][5] = true) {
                        randomBoard[2][5] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[2][5] = "[O]";
                    }
                    break;
                case "C1":
                    if (secretBoard[3][1] = true) {
                        randomBoard[3][1] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[3][1] = "[O]";
                    }
                    break;
                case "C2":
                    if (secretBoard[3][2] = true) {
                        randomBoard[3][2] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[3][2] = "[O]";
                    }
                    break;
                case "C3":
                    if (secretBoard[3][3] = true) {
                        randomBoard[3][3] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[3][3] = "[O]";
                    }
                    break;
                case "C4":
                    if (secretBoard[3][4] = true) {
                        randomBoard[3][4] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[3][4] = "[O]";
                    }
                    break;
                case "C5":
                    if (secretBoard[3][5] = true) {
                        randomBoard[3][5] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[3][5] = "[O]";
                    }
                    break;
                case "D1":
                    if (secretBoard[4][1] = true) {
                        randomBoard[4][1] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[4][1] = "[O]";
                    }
                    break;
                case "D2":
                    if (secretBoard[4][2] = true) {
                        randomBoard[4][2] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[4][2] = "[O]";
                    }
                    break;
                case "D3":
                    if (secretBoard[4][3] = true) {
                        randomBoard[4][3] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[4][3] = "[O]";
                    }
                    break;
                case "D4":
                    if (secretBoard[4][4] = true) {
                        randomBoard[4][4] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[4][4] = "[O]";
                    }
                    break;
                case "D5":
                    if (secretBoard[4][5] = true) {
                        randomBoard[4][5] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[4][5] = "[O]";
                    }
                    break;
                case "E1":
                    if (secretBoard[5][1] = true) {
                        randomBoard[5][1] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[5][1] = "[O]";
                    }
                    break;
                case "E2":
                    if (secretBoard[5][2] = true) {
                        randomBoard[5][2] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[5][2] = "[O]";
                    }
                    break;
                case "E3":
                    if (secretBoard[5][3] = true) {
                        randomBoard[5][3] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[5][3] = "[O]";
                    }
                    break;
                case "E4":
                    if (secretBoard[5][4] = true) {
                        randomBoard[5][4] = "[X]";
                        System.out.println("You found it!");
                        sunk = true;
                    } else {
                        randomBoard[5][4] = "[O]";
                    }
                    break;
                case "E5":
                    if (secretBoard[5][5] = true) {
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
    
    private Boolean[][] playerSecretBoard = {
        {null, null, null, null, null, null},
        {null, false, false, false, false, false},
        {null, false, false, false, false, false},
        {null, false, false, false, false, false},
        {null, false, false, false, false, false},
        {null, false, false, false, false, false},
    };
    
    private Boolean[][] cpuSecretBoard = {
        {null, null, null, null, null, null},
        {null, false, false, false, false, false},
        {null, false, false, false, false, false},
        {null, false, false, false, false, false},
        {null, false, false, false, false, false},
        {null, false, false, false, false, false},
    };
    
    private String[][] playerDisplayBoard = {
        {"   ", "[1]", "[2]", "[3]", "[4]", "[5]"},
        {"[A]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
        {"[D]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
        {"[C]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
        {"[D]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
        {"[E]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
    };
    
    private String[][] cpuDisplayBoard = {
        {"   ", "[1]", "[2]", "[3]", "[4]", "[5]"},
        {"[A]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
        {"[D]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
        {"[C]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
        {"[D]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
        {"[E]", "[ ]", "[ ]", "[ ]", "[ ]", "[ ]"},
    };
    
    void setupPlayer(Boolean[][] secret) {
        System.out.println("You are to place the smallest ship, the Patrol Boat, within your board");
        System.out.println();
        System.out.println("Please select an orientation. Vertical (V) or Horizontal (H).");
        String choice = input.nextLine();
        choice = choice.trim().toUpperCase();
        switch (choice) {
            case "V":
                this.displayBoard();
                System.out.println("Please select a starting location in LetterNumber format.");
                String choice2 = input.nextLine();
                choice2 = choice2.trim().toUpperCase();
                switch (choice2) {
                    case "A1":
                        secret[1][1] = true;
                        secret[2][1] = true;
                        break;
                    case "A2":
                        secret[1][2] = true;
                        secret[2][2] = true;
                        break;
                    case "A3":
                        secret[1][3] = true;
                        secret[2][3] = true;
                        break;
                    case "A4":
                        secret[1][4] = true;
                        secret[2][4] = true;
                        break;
                    case "A5":
                        secret[1][5] = true;
                        secret[2][5] = true;
                        break;
                    case "B1":
                        secret[2][1] = true;
                        secret[3][1] = true;
                        break;
                    case "B2":
                        secret[2][2] = true;
                        secret[3][2] = true;
                        break;
                    case "B3":
                        secret[2][3] = true;
                        secret[3][3] = true;
                        break;
                    case "B4":
                        secret[2][4] = true;
                        secret[3][4] = true;
                        break;
                    case "B5":
                        secret[2][5] = true;
                        secret[3][5] = true;
                        break;
                    case "C1":
                        secret[3][1] = true;
                        secret[4][1] = true;
                        break;
                    case "C2":
                        secret[3][2] = true;
                        secret[4][2] = true;
                        break;
                    case "C3":
                        secret[3][3] = true;
                        secret[4][3] = true;
                        break;
                    case "C4":
                        secret[3][4] = true;
                        secret[4][4] = true;
                        break;
                    case "C5":
                        secret[3][5] = true;
                        secret[4][5] = true;
                        break;
                    case "D1":
                        secret[4][1] = true;
                        secret[5][1] = true;
                        break;
                    case "D2":
                        secret[4][2] = true;
                        secret[5][2] = true;
                        break;
                    case "D3":
                        secret[4][3] = true;
                        secret[5][3] = true;
                        break;
                    case "D4":
                        secret[4][4] = true;
                        secret[5][4] = true;
                        break;
                    case "D5":
                        secret[4][5] = true;
                        secret[5][5] = true;
                        break;
                    case "E1":
                        System.out.println("The ship cannot fit there.");
                        break;
                    case "E2":
                        System.out.println("The ship cannot fit there.");
                        break;
                    case "E3":
                        System.out.println("The ship cannot fit there.");
                        break;
                    case "E4":
                        System.out.println("The ship cannot fit there.");
                        break;
                    case "E5":
                        System.out.println("The ship cannot fit there.");
                        break;
                    default:
                        System.out.println("Those are not proper coordinates.");
                        break;
                }
            case "H":
                this.displayBoard();
                System.out.println("Please select a starting location in LetterNumber format.");
                choice = input.nextLine();
                choice = choice.trim().toUpperCase();
                switch (choice) {
                    case "A1":
                        secret[1][1] = true;
                        secret[1][2] = true;
                        break;
                    case "A2":
                        secret[1][2] = true;
                        secret[1][3] = true;
                        break;
                    case "A3":
                        secret[1][3] = true;
                        secret[1][4] = true;
                        break;
                    case "A4":
                        secret[1][4] = true;
                        secret[1][5] = true;
                        break;
                    case "A5":
                        System.out.println("The ship cannot fit there.");
                        break;
                    case "B1":
                        secret[2][1] = true;
                        secret[2][2] = true;
                        break;
                    case "B2":
                        secret[2][2] = true;
                        secret[2][3] = true;
                        break;
                    case "B3":
                        secret[2][3] = true;
                        secret[2][4] = true;
                        break;
                    case "B4":
                        secret[2][4] = true;
                        secret[2][5] = true;
                        break;
                    case "B5":
                        System.out.println("The ship cannot fit there.");
                        break;
                    case "C1":
                        secret[3][1] = true;
                        secret[3][2] = true;
                        break;
                    case "C2":
                        secret[3][2] = true;
                        secret[3][3] = true;
                        break;
                    case "C3":
                        secret[3][3] = true;
                        secret[3][4] = true;
                        break;
                    case "C4":
                        secret[3][4] = true;
                        secret[3][5] = true;
                        break;
                    case "C5":
                        System.out.println("The ship cannot fit there.");
                        break;
                    case "D1":
                        secret[4][1] = true;
                        secret[4][2] = true;
                        break;
                    case "D2":
                        secret[4][2] = true;
                        secret[4][3] = true;
                        break;
                    case "D3":
                        secret[4][3] = true;
                        secret[4][4] = true;
                        break;
                    case "D4":
                        secret[4][4] = true;
                        secret[4][5] = true;
                        break;
                    case "D5":
                        System.out.println("The ship cannot fit there.");
                        break;
                    case "E1":
                        secret[5][1] = true;
                        secret[5][2] = true;
                        break;
                    case "E2":
                        secret[5][2] = true;
                        secret[5][3] = true;
                        break;
                    case "E3":
                        secret[5][3] = true;
                        secret[5][4] = true;
                        break;
                    case "E4":
                        secret[5][4] = true;
                        secret[5][5] = true;
                        break;
                    case "E5":
                        System.out.println("The ship cannot fit there.");
                        break;
                    default:
                        System.out.println("Those are not proper coordinates.");
                        break;
                }
            default:
                System.out.println("That is not a choice.");
                break;
        }
    }
    
    void setupCPU(Boolean[][] secret) {
        System.out.println("Computer is setting up its board...");
        for (;;) {
            int cpuChoice = roll.nextInt(2);
            switch (cpuChoice) {
                case 1:
                    for (;;) {
                        int cpuChoice2 = roll.nextInt(36);
                        switch (cpuChoice2) {
                            case 7:
                                secret[1][1] = true;
                                secret[2][1] = true;
                                break;
                            case 8:
                                secret[1][2] = true;
                                secret[2][2] = true;
                                break;
                            case 9:
                                secret[1][3] = true;
                                secret[2][3] = true;
                                break;
                            case 10:
                                secret[1][4] = true;
                                secret[2][4] = true;
                                break;
                            case 11:
                                secret[1][4] = true;
                                secret[2][4] = true;
                                break;
                            case 13:
                                secret[2][1] = true;
                                secret[3][1] = true;
                                break;
                            case 14:
                                secret[2][2] = true;
                                secret[3][2] = true;
                                break;
                            case 15:
                                secret[2][3] = true;
                                secret[3][3] = true;
                                break;
                            case 16:
                                secret[2][4] = true;
                                secret[3][4] = true;
                                break;
                            case 17:
                                secret[2][4] = true;
                                secret[3][4] = true;
                                break;
                            case 19:
                                secret[3][1] = true;
                                secret[4][1] = true;
                                break;
                            case 20:
                                secret[3][2] = true;
                                secret[4][2] = true;
                                break;
                            case 21:
                                secret[3][3] = true;
                                secret[4][3] = true;
                                break;
                            case 22:
                                secret[3][4] = true;
                                secret[4][4] = true;
                                break;
                            case 23:
                                secret[3][4] = true;
                                secret[4][4] = true;
                                break;
                            case 25:
                                secret[4][1] = true;
                                secret[5][1] = true;
                                break;
                            case 26:
                                secret[4][2] = true;
                                secret[5][2] = true;
                                break;
                            case 27:
                                secret[4][3] = true;
                                secret[5][3] = true;
                                break;
                            case 28:
                                secret[4][4] = true;
                                secret[5][4] = true;
                                break;
                            case 29:
                                secret[4][4] = true;
                                secret[5][4] = true;
                                break;
                            default:
                                continue;
                        }
                        break;
                    }
                    break;
                case 2:
                    for (;;) {
                        cpuChoice = roll.nextInt(36);
                        switch (cpuChoice) {
                            case 7:
                                secret[1][1] = true;
                                secret[1][2] = true;
                                break;
                            case 8:
                                secret[1][2] = true;
                                secret[1][3] = true;
                                break;
                            case 9:
                                secret[1][3] = true;
                                secret[1][4] = true;
                                break;
                            case 10:
                                secret[1][4] = true;
                                secret[1][5] = true;
                                break;
                            case 13:
                                secret[2][1] = true;
                                secret[2][2] = true;
                                break;
                            case 14:
                                secret[2][2] = true;
                                secret[2][3] = true;
                                break;
                            case 15:
                                secret[2][3] = true;
                                secret[2][4] = true;
                                break;
                            case 16:
                                secret[2][4] = true;
                                secret[2][5] = true;
                                break;
                            case 19:
                                secret[3][1] = true;
                                secret[3][2] = true;
                                break;
                            case 20:
                                secret[3][2] = true;
                                secret[3][3] = true;
                                break;
                            case 21:
                                secret[3][3] = true;
                                secret[3][4] = true;
                                break;
                            case 22:
                                secret[3][4] = true;
                                secret[3][5] = true;
                                break;
                            case 25:
                                secret[4][1] = true;
                                secret[4][2] = true;
                                break;
                            case 26:
                                secret[4][2] = true;
                                secret[4][3] = true;
                                break;
                            case 27:
                                secret[4][3] = true;
                                secret[4][4] = true;
                                break;
                            case 28:
                                secret[4][4] = true;
                                secret[4][5] = true;
                                break;
                            case 31:
                                secret[5][1] = true;
                                secret[5][2] = true;
                                break;
                            case 32:
                                secret[5][2] = true;
                                secret[5][3] = true;
                                break;
                            case 33:
                                secret[5][3] = true;
                                secret[5][4] = true;
                                break;
                            case 34:
                                secret[5][4] = true;
                                secret[5][5] = true;
                                break;
                            default:
                                continue;
                        }
                        break;
                    }
                    break;
                default:
                    break;
            }
            break;
        }
    }

    int cpuHitCount = 2;
    int playerHitCount = 2;
    Boolean turnOver = false;
    Boolean cpuPickedA1 = false;
    Boolean cpuPickedA2 = false;
    Boolean cpuPickedA3 = false;
    Boolean cpuPickedA4 = false;
    Boolean cpuPickedA5 = false;
    Boolean cpuPickedB1 = false;
    Boolean cpuPickedB2 = false;
    Boolean cpuPickedB3 = false;
    Boolean cpuPickedB4 = false;
    Boolean cpuPickedB5 = false;
    Boolean cpuPickedC1 = false;
    Boolean cpuPickedC2 = false;
    Boolean cpuPickedC3 = false;
    Boolean cpuPickedC4 = false;
    Boolean cpuPickedC5 = false;
    Boolean cpuPickedD1 = false;
    Boolean cpuPickedD2 = false;
    Boolean cpuPickedD3 = false;
    Boolean cpuPickedD4 = false;
    Boolean cpuPickedD5 = false;
    Boolean cpuPickedE1 = false;
    Boolean cpuPickedE2 = false;
    Boolean cpuPickedE3 = false;
    Boolean cpuPickedE4 = false;
    Boolean cpuPickedE5 = false;
    Boolean playerPickedA1 = false;
    Boolean playerPickedA2 = false;
    Boolean playerPickedA3 = false;
    Boolean playerPickedA4 = false;
    Boolean playerPickedA5 = false;
    Boolean playerPickedB1 = false;
    Boolean playerPickedB2 = false;
    Boolean playerPickedB3 = false;
    Boolean playerPickedB4 = false;
    Boolean playerPickedB5 = false;
    Boolean playerPickedC1 = false;
    Boolean playerPickedC2 = false;
    Boolean playerPickedC3 = false;
    Boolean playerPickedC4 = false;
    Boolean playerPickedC5 = false;
    Boolean playerPickedD1 = false;
    Boolean playerPickedD2 = false;
    Boolean playerPickedD3 = false;
    Boolean playerPickedD4 = false;
    Boolean playerPickedD5 = false;
    Boolean playerPickedE1 = false;
    Boolean playerPickedE2 = false;
    Boolean playerPickedE3 = false;
    Boolean playerPickedE4 = false;
    Boolean playerPickedE5 = false;
    
    void playerTurn(Boolean[][] secret, String[][] display) {
        turnOver = false;
        System.out.println("\n**********************************************************************");
        System.out.println("**                          PLAYER  TURN                            **");
        System.out.println("**********************************************************************");
        System.out.println();
        while (!turnOver) {
            System.out.println();
            System.out.println("Please enter some coordinates in LetterNumber format.");
            String coOrds = input.nextLine();
            coOrds = coOrds.trim().toUpperCase();
            switch (coOrds) {
                case "A1":
                    if (secret[1][1] != false) {
                        cpuHitCount--;
                        display[1][1] = "[X]";
                    } else {
                        display[1][1] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "A2":
                    if (secret[1][2] != false) {
                        cpuHitCount--;
                        display[1][2] = "[X]";
                    } else {
                        display[1][2] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "A3":
                    if (secret[1][3] != false) {
                        cpuHitCount--;
                        display[1][3] = "[X]";
                    } else {
                        display[1][3] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "A4":
                    if (secret[1][4] != false) {
                        cpuHitCount--;
                        display[1][4] = "[X]";
                    } else {
                        display[1][4] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "A5":
                    if (secret[1][5] != false) {
                        cpuHitCount--;
                        display[1][5] = "[X]";
                    } else {
                        display[1][5] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "B1":
                    if (secret[2][1] != false) {
                        cpuHitCount--;
                        display[2][1] = "[X]";
                    } else {
                        display[2][1] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "B2":
                    if (secret[2][2] != false) {
                        cpuHitCount--;
                        display[2][2] = "[X]";
                    } else {
                        display[2][2] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "B3":
                    if (secret[2][3] != false) {
                        cpuHitCount--;
                        display[2][3] = "[X]";
                    } else {
                        display[2][3] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "B4":
                    if (secret[2][4] != false) {
                        cpuHitCount--;
                        display[2][4] = "[X]";
                    } else {
                        display[2][4] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "B5":
                    if (secret[2][5] != false) {
                        cpuHitCount--;
                        display[2][5] = "[X]";
                    } else {
                        display[2][5] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "C1":
                    if (secret[3][1] != false) {
                        cpuHitCount--;
                        display[3][1] = "[X]";
                    } else {
                        display[3][1] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "C2":
                    if (secret[3][2] != false) {
                        cpuHitCount--;
                        display[3][2] = "[X]";
                    } else {
                        display[3][2] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "C3":
                    if (secret[3][3] != false) {
                        cpuHitCount--;
                        display[3][3] = "[X]";
                    } else {
                        display[3][3] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "C4":
                    if (secret[3][4] != false) {
                        cpuHitCount--;
                        display[3][4] = "[X]";
                    } else {
                        display[3][4] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "C5":
                    if (secret[3][5] != false) {
                        cpuHitCount--;
                        display[3][5] = "[X]";
                    } else {
                        display[3][5] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "D1":
                    if (secret[4][1] != false) {
                        cpuHitCount--;
                        display[4][1] = "[X]";
                    } else {
                        display[4][1] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "D2":
                    if (secret[4][2] != false) {
                        cpuHitCount--;
                        display[4][2] = "[X]";
                    } else {
                        display[4][2] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "D3":
                    if (secret[4][3] != false) {
                        cpuHitCount--;
                        display[4][3] = "[X]";
                    } else {
                        display[4][3] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "D4":
                    if (secret[4][4] != false) {
                        cpuHitCount--;
                        display[4][4] = "[X]";
                    } else {
                        display[4][4] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "D5":
                    if (secret[4][5] != false) {
                        cpuHitCount--;
                        display[4][5] = "[X]";
                    } else {
                        display[4][5] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "E1":
                    if (secret[5][1] != false) {
                        cpuHitCount--;
                        display[5][1] = "[X]";
                    } else {
                        display[5][1] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "E2":
                    if (secret[5][2] != false) {
                        cpuHitCount--;
                        display[5][2] = "[X]";
                    } else {
                        display[5][2] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "E3":
                    if (secret[5][3] != false) {
                        cpuHitCount--;
                        display[5][3] = "[X]";
                    } else {
                        display[5][3] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "E4":
                    if (secret[5][4] != false) {
                        cpuHitCount--;
                        display[5][4] = "[X]";
                    } else {
                        display[5][4] = "[O]";
                    }
                    turnOver = true;
                    break;
                case "E5":
                    if (secret[5][5] != false) {
                        cpuHitCount--;
                        display[5][5] = "[X]";
                    } else {
                        display[5][5] = "[O]";
                    }
                    turnOver = true;
                    break;
                default:
                    System.out.println("Incorrect coordinates...");
                    break;
            }
        }
        for (String[] display1 : display) {
            System.out.println(display1[0] + display1[1] + display1[2] + display1[3] + display1[4] + display1[5]);
        }
    }
    
    void cpuTurn(Boolean[][] secret, String[][] display) {
        turnOver = false;
        System.out.println("\n**********************************************************************");
        System.out.println("**                            CPU TURN                              **");
        System.out.println("**********************************************************************");
        System.out.println();
        while (!turnOver) {
            int cpuChoice = roll.nextInt(36);
            switch (cpuChoice) {
                case 7:
                    if (cpuPickedA1 != false) {
                        continue;
                    } else {
                        if (secret[1][1] != false) {
                            display[1][1] = "[X]";
                            playerHitCount--;
                        } else {
                            display[1][1] = "[O]";
                        }
                        turnOver = true;
                        cpuPickedA1 = true;
                    }
                    break;
                case 8:
                    if (cpuPickedA2 != false) {
                        continue;
                    } else {
                        if (secret[1][2] != false) {
                        display[1][2] = "[X]";
                        playerHitCount--;
                    } else {
                        display[1][2] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedA2 = true;
                    }
                    break;
                case 9:
                    if (cpuPickedA3 != false) {
                        continue;
                    } else {
                        if (secret[1][3] != false) {
                        display[1][3] = "[X]";
                        playerHitCount--;
                    } else {
                        display[1][3] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedA3 = true;
                    }
                    break;
                case 10:
                    if (cpuPickedA4 != false) {
                        continue;
                    } else {
                        if (secret[1][4] != false) {
                        display[1][4] = "[X]";
                        playerHitCount--;
                    } else {
                        display[1][4] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedA4 = true;
                    }
                    break;
                case 11:
                    if (cpuPickedA5 != false) {
                        continue;
                    } else {
                        if (secret[1][5] != false) {
                        display[1][5] = "[X]";
                        playerHitCount--;
                    } else {
                        display[1][5] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedA5 = true;
                    }
                    break;
                case 13:
                    if (cpuPickedB1 != false) {
                        continue;
                    } else {
                        if (secret[2][1] != false) {
                        display[2][1] = "[X]";
                        playerHitCount--;
                    } else {
                        display[2][1] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedB1 = true;
                    }
                    break;
                case 14:
                    if (cpuPickedB2 != false) {
                        continue;
                    } else {
                        if (secret[2][2] != false) {
                        display[2][2] = "[X]";
                        playerHitCount--;
                    } else {
                        display[2][2] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedB2 = true;
                    }
                    break;
                case 15:
                    if (cpuPickedB3 != false) {
                        continue;
                    } else {
                        if (secret[2][3] != false) {
                        display[2][3] = "[X]";
                        playerHitCount--;
                    } else {
                        display[2][3] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedB3 = true;
                    }
                    break;
                case 16:
                    if (cpuPickedB4 != false) {
                        continue;
                    } else {
                        if (secret[2][4] != false) {
                        display[2][4] = "[X]";
                        playerHitCount--;
                    } else {
                        display[2][4] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedB4 = true;
                    }
                    break;
                case 17:
                    if (cpuPickedB5 != false) {
                        continue;
                    } else {
                        if (secret[2][5] != false) {
                        display[2][5] = "[X]";
                        playerHitCount--;
                    } else {
                        display[2][5] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedB5 = true;
                    }
                    break;
                case 19:
                    if (cpuPickedC1 != false) {
                        continue;
                    } else {
                        if (secret[3][1] != false) {
                        display[3][1] = "[X]";
                        playerHitCount--;
                    } else {
                        display[3][1] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedC1 = true;
                    }
                    break;
                case 20:
                    if (cpuPickedC2 != false) {
                        continue;
                    } else {
                        if (secret[3][2] != false) {
                        display[3][2] = "[X]";
                        playerHitCount--;
                    } else {
                        display[3][2] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedC2 = true;
                    }
                    break;
                case 21:
                    if (cpuPickedC3 != false) {
                        continue;
                    } else {
                        if (secret[3][3] != false) {
                        display[3][3] = "[X]";
                        playerHitCount--;
                    } else {
                        display[3][3] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedC3 = true;
                    }
                    break;
                case 22:
                    if (cpuPickedC4 != false) {
                        continue;
                    } else {
                        if (secret[3][4] != false) {
                        display[3][4] = "[X]";
                        playerHitCount--;
                    } else {
                        display[3][4] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedC4 = true;
                    }
                    break;
                case 23:
                    if (cpuPickedC5 != false) {
                        continue;
                    } else {
                        if (secret[3][5] != false) {
                        display[3][5] = "[X]";
                        playerHitCount--;
                    } else {
                        display[3][5] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedC5 = true;
                    }
                    break;
                case 25:
                    if (cpuPickedD1 != false) {
                        continue;
                    } else {
                        if (secret[4][1] != false) {
                        display[4][1] = "[X]";
                        playerHitCount--;
                    } else {
                        display[4][1] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedD1 = true;
                    }
                    break;
                case 26:
                    if (cpuPickedD2 != false) {
                        continue;
                    } else {
                        if (secret[4][2] != false) {
                        display[4][2] = "[X]";
                        playerHitCount--;
                    } else {
                        display[4][2] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedD2 = true;
                    }
                    break;
                case 27:
                    if (cpuPickedD3 != false) {
                        continue;
                    } else {
                        if (secret[4][3] != false) {
                        display[4][3] = "[X]";
                        playerHitCount--;
                    } else {
                        display[4][3] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedD3 = true;
                    }
                    break;
                case 28:
                    if (cpuPickedD4 != false) {
                        continue;
                    } else {
                        if (secret[4][4] != false) {
                        display[4][4] = "[X]";
                        playerHitCount--;
                    } else {
                        display[4][4] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedD4 = true;
                    }
                    break;
                case 29:
                    if (cpuPickedD5 != false) {
                        continue;
                    } else {
                        if (secret[4][5] != false) {
                        display[4][5] = "[X]";
                        playerHitCount--;
                    } else {
                        display[4][5] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedD5 = true;
                    }
                    break;
                case 31:
                    if (cpuPickedE1 != false) {
                        continue;
                    } else {
                        if (secret[5][1] != false) {
                        display[5][1] = "[X]";
                        playerHitCount--;
                    } else {
                        display[5][1] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedE1 = true;
                    }
                    break;
                case 32:
                    if (cpuPickedE2 != false) {
                        continue;
                    } else {
                        if (secret[5][2] != false) {
                        display[5][2] = "[X]";
                        playerHitCount--;
                    } else {
                        display[5][2] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedE2 = true;
                    }
                    break;
                case 33:
                    if (cpuPickedE3 != false) {
                        continue;
                    } else {
                        if (secret[5][3] != false) {
                        display[5][3] = "[X]";
                        playerHitCount--;
                    } else {
                        display[5][3] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedE3 = true;
                    }
                    break;
                case 34:
                    if (cpuPickedE4 != false) {
                        continue;
                    } else {
                        if (secret[5][4] != false) {
                        display[5][4] = "[X]";
                        playerHitCount--;
                    } else {
                        display[5][4] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedE4 = true;
                    }
                    break;
                case 35:
                    if (cpuPickedE5 != false) {
                        continue;
                    } else {
                        if (secret[5][5] != false) {
                        display[5][5] = "[X]";
                        playerHitCount--;
                    } else {
                        display[5][5] = "[O]";
                    }
                    turnOver = true;
                        cpuPickedE5 = true;
                    }
                    break;
                default:
                    continue;
            }
            break;
        }
        for (int i=0; i < display.length; i++) {
            System.out.println(display[i][0] + display[i][1] + display[i][2] + display[i][3] + display[i][4] + display[i][5]);
        }
    }
    
    void gameProcessing() {
        Boolean gameover = false;
        while (!gameover) {
            this.setupPlayer(this.playerSecretBoard);
            this.setupCPU(this.cpuSecretBoard);
            for (;;) {
                this.playerTurn(this.cpuSecretBoard, this.playerDisplayBoard);
                if (cpuHitCount == 0) {
                    System.out.println("You win!");
                    System.exit(0);
                } else {
                    this.cpuTurn(this.playerSecretBoard, this.cpuDisplayBoard);
                    if (playerHitCount == 0) {
                        System.out.println("You lose!");
                        System.out.println("Try again? (Y/N)");
                        String choice = input.nextLine();
                        choice = choice.trim().toUpperCase();
                        switch (choice) {
                            case "Y":
                                break;
                            case "N":
                                return;
                                //System.exit(0);
                            default:
                                System.out.println("That wasn't a choice...");
                        }
                    }
                }
            }
        }
    }
}
