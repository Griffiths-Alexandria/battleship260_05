
package battleship260_05;

/**
 *
 * @author Logan Work
 */
import java.util.Scanner;

public class Battleship260_05 {

    /**
     * @param args the command line arguments
     */
    String player1 = "Joe";
    String player2 = "Lucy";
    
    String name;
    String instructions = "Welcome to the game of Battleship! \n\n"
           + "Player 1 and Player 2 will be competing with each other. \n"
           + "Each Player will be given the oppurtunity to hid their ships. \n"
           + "While hiding your ships the opposite player must be honest and look away. \n"
           + "After you have completed your turn the next player will have to enter [n] to view his/or her board."
           + "Additional instructions will be added later..\n"
           + "Good Luck!";
    
    void showPlayerOne() {
        System.out.println(player1);
    }
    void showPlayerTwo() {
        System.out.println(player2);
    }
    
    public static void main(String[] args) {
                
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
           
        Battleship260_05 myGame = new Battleship260_05();
        myGame.getName();
        myGame.displayHelp();
        
        // TODO code application logic here
    }
    public void getName()    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        this.name = input.next();
    }
    public void displayHelp()   {
        System.out.println("\n Welcome " + this.name + "\n");
        System.out.println(this.instructions);
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
    }
    */
}
