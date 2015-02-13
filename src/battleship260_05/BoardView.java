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

            //If user enters nothing, spaces, does not separate input with a comma, or has more than one comma.
            if(coordinates.length <= 1){
                new BattleshipError().displayError("Must enter a value for each coordinate.");
                continue;
            } else if (coordinates.length > 2){
                new BattleshipError().displayError("Please enter only 1 set of coordinates.");
                continue;
            } else {
                coordinates[0] = coordinates[0].trim();
                coordinates[1] = coordinates[1].trim();
                if (coordinates[0].equals("") || coordinates[1].equals("")){//checks to make sure the resulting strings are not empty.
                    new BattleshipError().displayError("Coordinates may not be empty.");
                    continue;
                }
            }
            
            String hasNaN = ".*\\D+.*";//pattern for 1 or more non-numeric digits in the string.
            
            //If user includes a letter in either coordinate.
            if(coordinates[0].matches(hasNaN) || coordinates[1].matches(hasNaN)){
                new BattleshipError().displayError("Coordinates must be positive integers.");
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
               location = new Point(x-1,y-1); //We don't have the necessary structure yet.
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
