/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author Logan Work
 */
public class BoardModel {
    int boardSize;
    //if setup is true, board is for setup. If false, board is for play.
    boolean setup;
    boolean shipsPlaced = false;
    String[][] grid;
    
    public BoardModel(int boardSize, boolean setup) {
        this.boardSize = boardSize;
        this.setup = setup;
        
    }
    public void setShip(LocationInfo location, Ship ship) {
        int row = location.row;
        int col = location.col;
        boolean vertical = location.vertical;
        String letter = ship.description;
        
        for(int i=0;i<ship.size; i++){
            if (vertical){
                this.grid[row+i][col] = letter;
            } else {
                this.grid[row][col+i] = letter;
            }
        }
    }
    public String[][] getNewBoard(){
        int i,j;
        this.boardSize = boardSize;
        this.grid = new String[this.boardSize][this.boardSize];
        for (i=0;i<this.boardSize;i++){
            for (j=0; j<this.boardSize;j++){
                this.grid[i][j] = " ";
            }
        }
        return grid;     
    }
    public String[][] getBoard(){
        return grid;
    }
    public int[][] searchBoard(Ship ship){
        int[][] shipIsAt = new int[ship.size][2];
        int index = 0;
        int rCount = 0;
        int cCount = 0;
        for (String[] row : grid){
            for (String col : row){
                if (col.equals(ship.description)){
                    shipIsAt[index][0] = rCount+1;
                    shipIsAt[index][1] = cCount+1;
                    index++;
                }
                cCount++;
                if (cCount == grid.length){
                    cCount = 0;
                }
            }
            rCount++;
            if (rCount == grid.length){
                rCount = 0;
            }
        }
        return shipIsAt;
    }
}
