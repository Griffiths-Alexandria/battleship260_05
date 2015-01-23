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


public class Battleship260_05 {

    /**
     * @param args the command line arguments
     */
    String player1 = "Joe";
    String player2 = "Lucy";
    
    void showPlayerOne() {
        System.out.println(player1);
    }
    void showPlayerTwo() {
        System.out.println(player2);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
                
        Battleship260_05 newGame = new Battleship260_05();
        
        newGame.showPlayerOne();
        
        newGame.showPlayerTwo();
        
        Board setupBoard = new Board();
        
        setupBoard.showBoardSize();
        
        setupBoard.showBoardType();
        
        Rules setupRules = new Rules();
        
        setupRules.displayRules(); 

//is this what it means on the last bullet point of the individual assignment?
        
        // Creating new instances of each ship
        Ship1 newShip1 = new Ship1();
        Ship2 newShip2 = new Ship2();
        Ship3 newShip3 = new Ship3();
        Ship4 newShip4 = new Ship4();
        Ship5 newShip5 = new Ship5();
        
        //Displaying each ship info
        newShip1.showDescription();
        newShip1.showSize();
        newShip1.showHitCount();
        
        newShip2.showDescription();
        newShip2.showSize();
        newShip2.showHitCount();
        
        newShip3.showDescription();
        newShip3.showSize();
        newShip3.showHitCount();
        
        newShip4.showDescription();
        newShip4.showSize();
        newShip4.showHitCount();
        
        newShip5.showDescription();
        newShip5.showSize();
        newShip5.showHitCount();
        
        //Sue Francis testing
        //Alex Griffiths was here testing this out
        //Christian Molina, testing through NetBeans as well
        //Rachel Yancey here and tested
        //Wendell Tanner - Test
        //Daniel Diaz was here
    }
    
    
}
class Players {
    /*String player1 = "Joe";
    String player2 = "Lucy";
    
    void showPlayerOne() {
        System.out.println(player1);
    }
    void showPlayerTwo() {
        System.out.println(player2);
    }*/
}
