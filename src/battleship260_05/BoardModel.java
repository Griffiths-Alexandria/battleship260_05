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
    String[][] grid;
    
    public BoardModel(int boardSize, boolean setup) {
        this.boardSize = boardSize;
        this.setup = setup;
        
    }
    void setShip(int xStartPos, int yStartPos, int shipSize, boolean vertical, String shipName) {
        
    }
    public String[][] getBoard(){
        this.boardSize = boardSize;
        this.grid = new String[this.boardSize][this.boardSize];
        return grid;     
    }
}
