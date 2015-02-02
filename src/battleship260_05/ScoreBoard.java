/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author Daniel Diaz
 */
public class ScoreBoard {
    
    //I am expecting to recive this values from the "Ship Class".
    String shipName;
    int hitsNumber;
    int shipSize;
        
    void getShipHits() {
        
        if (hitsNumber == 0) {
            System.out.println( shipName + "has not been hit.\n");
        }
        else if (hitsNumber >= 1) {
            
            int hitsLeft;
            hitsLeft = (shipSize) - (hitsNumber);
            System.out.println( shipName + ": Has been hit " + hitsNumber + " times, and has " +  hitsLeft +  " hit left.\n");
        } 
        else {
            System.out.println ("Invalid Imput.\n");
        }
     }
    
    String currentPlayer;
    int playerTurn;
    int playerHits;
    int playerShipsLeft;
    int playerShipsSunk;
    double accuracyScorePlayer;
    String opponent;
    int opponentTurn;
    int opponentHits;
    double accuracyScoreOpponent;
        
    ScoreBoard(String currentPlayer, int playerTurn, int playerHits, int playerShipsLeft,
            int playerShipsSunk, double accuracyScorePlayer, String opponent, 
            int opponentTurn,int opponentHits, double accuracyScoreOpponent) 
        {
            
            this.currentPlayer = currentPlayer;
            this.playerTurn = playerTurn;
            this.playerHits = playerHits;
            this.playerShipsLeft = playerShipsLeft;
            this.playerShipsSunk = playerShipsSunk;
            this.accuracyScorePlayer = accuracyScorePlayer;
            this.opponent = opponent;
            this.opponentTurn = opponentTurn;
            this.opponentHits = opponentHits;
            this.accuracyScoreOpponent = accuracyScoreOpponent;
            this.shipName = "Battleship";
            this.hitsNumber = 3;
            this.shipSize = 4;
            //Manualy added values to have the getShipHits method working.
    }
    
    void getInfo() {
        System.out.println(this.currentPlayer + ": Turn Number: " + this.playerTurn +  " , Total number of Hits: " + this.playerHits + 
                            " , Ships Left: " + this.playerShipsLeft + " , Ships Sunk: " + this.playerShipsSunk + 
                            " , Accuracy Score: " + this.accuracyScorePlayer + "  Challenger's Name: " + this.opponent+
                            " : Challenger's Turn: " + this.opponentTurn + " , Challenger's Hits: " + this.opponentHits +
                            " , Challenger's Accuracy: " + this.accuracyScoreOpponent );
    }
    
    
    
    
}  
