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
    
    public LocationInfo getShipPlacement(Ship ship, String[][] grid){
        //Instance variables
        Scanner inFile = new Scanner(System.in);
        String[] startCoords;
        int startRow, startCol;
        boolean vertical;
        String shipName = ship.name;   
        String[][] board = grid;
        //Return variable
        LocationInfo location = new LocationInfo();
        //Logic variable
        boolean valid = false;
        
        userinput:
        while(!valid){
            System.out.println("Enter starting coordinates(row,col) for your " + shipName + ": (i.e. 1,3)");
            
            String strCoordinates = inFile.nextLine();
            strCoordinates = strCoordinates.trim();
            startCoords = strCoordinates.split(",");

            //If user enters nothing, spaces, does not separate input with a comma, or has more than one comma.
            if(startCoords.length <= 1){
                new BattleshipError().displayError("Must enter a value for each coordinate.");
                continue;
            } else if (startCoords.length > 2){
                new BattleshipError().displayError("Please enter only 1 set of coordinates.");
                continue;
            } else {
                startCoords[0] = startCoords[0].trim();
                startCoords[1] = startCoords[1].trim();
                if (startCoords[0].equals("") || startCoords[1].equals("")){//checks to make sure the resulting strings are not empty.
                    new BattleshipError().displayError("Coordinates may not be empty.");
                    continue;
                }
            }
            
            String hasNaN = ".*\\D+.*";//pattern for 1 or more non-numeric digits in the string.
            
            //If user includes a letter in either coordinate.
            if(startCoords[0].matches(hasNaN) || startCoords[1].matches(hasNaN)){
                new BattleshipError().displayError("Coordinates must be positive integers.");
                continue;
            }
            
            startRow = Integer.parseInt(startCoords[0]);
            startCol = Integer.parseInt(startCoords[1]);
           
            if(startRow < 1 || startRow > this.boardDim || startCol < 1 || startCol > this.boardDim){
                new BattleshipError().displayError("Coordinates must be greater than 0 and less than or equal to " + this.boardDim );
                continue;
            }
            
            //Set location values for row and column to what the user input.
            location.row = startRow-1;
            location.col = startCol-1;
            
            System.out.println("Do you want to place your ship vertically? (Y/N)");
            
            //Get and validate answer to vertical question
            String strVertical = inFile.nextLine();
            strVertical = strVertical.trim().toUpperCase();
            
            if (strVertical.length()<1){
                new BattleshipError().displayError("Empty entry. Must indicate Y or N for vertical placement.");
                continue;
            }
            strVertical = strVertical.substring(0,1);
            
            switch (strVertical){
                case "Y":
                    vertical = true;
                    break;
                case "N":
                    vertical = false;
                    break;
                default:
                    new BattleshipError().displayError("Invalid entry. Must indicate Y or N for vertical placement.");
                    continue;
            }
            //Set location value of vertical to what the user selected.
            location.vertical = vertical;
            
            //Check to make sure ship will fit on board and is not occupied.
            if(vertical){
                if ((startRow-1) + ship.size > this.boardDim){
                    new BattleshipError().displayError("The ship does not fit vertically in this location.");
                    continue;
                }
                for (int r = startRow; r < startRow + ship.size; r++){
                    if (board[r-1][startCol-1] != " "){
                        new BattleshipError().displayError("The ship cannot be placed on top of another ship.");
                        continue userinput;
                    }
                }
            } else {
                if ((startCol-1) + ship.size > this.boardDim){
                    new BattleshipError().displayError("The ship does not fit horizontally in this location.");
                    continue;
                }
                for (int c = startCol; c < startCol + ship.size; c++){
                    if (board[startRow-1][c-1] != " "){
                        new BattleshipError().displayError("The ship cannot be placed on top of another ship.");
                        continue userinput;
                    }
                }
            }
            valid = true;
        }
        
        return location;
    }
    
    public String getInput(){

        Scanner inFile = new Scanner(System.in);
        String[] coordinates;
        //Point location = null;
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
