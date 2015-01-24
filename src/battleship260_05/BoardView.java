/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

import java.util.Scanner;
/**
 *
 * @author Logan Work
 */
public class BoardView {
    int boardDim;
    
    public void displayBoard(String[][] grid){
        int i, j;
        
        for (i=-1; i<grid.length; ++i){
            for(j=0; j<grid.length; ++j) {
                if (i==-1){
                    if (j==0){
                        System.out.print("   ");
                    }else if (j<=9){
                        System.out.print("  ");
                    }else{
                        System.out.print(" ");
                    }
                    System.out.print(j+1);
                    
                } else {
                    if (j==0){
                        System.out.print(i+1);
                        if (i<9){
                            System.out.print(" ");
                        }
                    }
                    System.out.print("[ ]");
                }

            }
            System.out.println();
        }
    }
    public int getBoardSize() {
        Scanner inputBSize = new Scanner(System.in);
        System.out.println("Enter the size of the game board:");
        this.boardDim = Integer.parseInt(inputBSize.next());
        return boardDim;
    }
}
