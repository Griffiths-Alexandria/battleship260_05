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
    
    String currentPlayer;
    int playerTurn;
    int playerHits;
    int playerShipsLeft;
    int playerShipsSunk;
    int accuracyScorePlayer;
    String opponent;
    int opponentTurn;
    int opponentHits;
    int accuracyScoreOpponent;
    int getShipHits;
    
    ScoreBoard(String currentPlayer, int playerTurn, int playerHits, int getShipHits, 
            int playerShipsLeft,int playerShipsSunk, int accuracyScorePlayer, String opponent, 
            int opponentTurn,int opponentHits, int accuracyScoreOpponent) 
        {
            this.currentPlayer = currentPlayer;
            this.playerTurn = playerTurn;
            this.playerHits = playerHits;
            this.getShipHits = getShipHits;
            this.playerShipsLeft = playerShipsLeft;
            this.playerShipsSunk = playerShipsSunk;
            this.accuracyScorePlayer = accuracyScorePlayer;
            this.opponent = opponent;
            this.opponentTurn = opponentTurn;
            this.opponentHits = opponentHits;
            this.accuracyScoreOpponent = accuracyScoreOpponent;
    }
    
    void getInfo() {
        System.out.println(this.currentPlayer + ", Turn Number: " + this.playerTurn +  " , Total number of Hits: " + this.playerHits + 
                            " , Hits by Ship:" + this.getShipHits + " , Ships Left: " + this.playerShipsLeft + " , Ships Sunk: " + this.playerShipsSunk + 
                            " , Accuracy Score: " + this.accuracyScorePlayer + "  Challenger's Name: " + this.opponent+
                            " , Challenger's Turn: " + this.opponentTurn + " , Challenger's Hits: " + this.opponentHits +
                            " , Challenger's Accuracy: " + this.accuracyScoreOpponent );
    }
    
    String shipName;
    int hitsNumber;
    int shipSize;
    void getShipHits(String shipName,  int hitsNumber, int shipSize) {
        if (hitsNumber == 0) {
            System.out.println( shipName + "has not been hit.\n");
            return;
        }
        if (hitsNumber >= 1) {
            int hitsLeft = 0;
            
            System.out.println( shipName + "has been hit" + hitsNumber + "times and has" +  hitsLeft +  "left.\n");
            return;
        }
        
        double hitsLeft=  ((double) shipSize - (double)hitsNumber);
    }

    
    
    
}
