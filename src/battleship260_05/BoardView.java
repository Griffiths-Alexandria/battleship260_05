/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

import java.awt.Point;
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
                        if (i<9){
                            System.out.print(" ");
                        }
                        System.out.print(i+1);
                    }
                    System.out.print("["+grid[i][j]+"]");
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

    public String getInput(){

        Scanner inFile = new Scanner(System.in);
        String[] coordinates;
        Point location = null;
        boolean valid = false;
        int x = 0,y = 0;

        while(!valid){
            System.out.println("Enter Coordinates: (i.e. 1,3)");
            
           String strCoordinates = inFile.nextLine();
           strCoordinates = strCoordinates.trim();
           coordinates = strCoordinates.split(",");
           
           if(coordinates.length <= 1){
               new BattleshipError().displayError("Must enter a value for each coordinate.");
               continue;
               
               }
           
           String regex = ".*\\d.*";
           
       if(!coordinates[0].matches(regex)||!coordinates[1].matches(regex)){
                new BattleshipError().displayError("Coordinates must be integers.");
                continue;
                }
              
            x = Integer.parseInt(coordinates[0]);
            y = Integer.parseInt(coordinates[1]);
           
           int boardSize = 10;
           if(x < 1 || x > boardSize || y < 1 || y > boardSize){
               new BattleshipError().displayError("Coordinates must be greater than 0 and less than or equal to " + boardSize );
               continue;
           
           }
           
           /*
               location = new Point(x-1,y-1); don't have the necessary structure yet.
                   if(board.location[x-1][y-1] != null){
                   new BattleshipError().displayError("You've already attacked this location");
                   continue;
                   }
                   
                   
           */
           
           valid = true;
           
          
        }
        return "You fired at " + x + ","+ y;
    }




}






