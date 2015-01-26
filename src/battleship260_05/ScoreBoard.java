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
    
    ScoreBoard(String currentPlayer, int playerTurn, int playerHits, int playerShipsLeft,
               int playerShipsSunk, int accuracyScorePlayer, String opponent, 
               int opponentTurn,int opponentHits, int accuracyScoreOpponent) 
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
    }
    
    void getInfo() {
        System.out.println(this.currentPlayer + ", Turn Number: " + this.playerTurn +  " , Number of Hits: " + this.playerHits + 
                            " , Ships Left: " + this.playerShipsLeft + " , Ships Sunk: " + this.playerShipsSunk + 
                            " , Accuracy Score: " + this.accuracyScorePlayer + "  Challenger's Name: " + this.opponent+
                            " , Challenger's Turn: " + this.opponentTurn + " , Challenger's Hits: " + this.opponentHits +
                            " , Challenger's Accuracy: " + this.accuracyScoreOpponent );
    }
}
