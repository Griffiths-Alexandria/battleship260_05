
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
        
        

//is this what it means on the last bullet point of the individual assignment?
        
        // Creating new instances of each ship
        Ship Submarine = new Ship("Submarine", "A 3-Space Ship", 3);
        Ship Carrier = new Ship("Aircraft Carrier", "A 5-Space Ship", 5);
        Ship Patrol = new Ship("Patrol Boat", "A 2-Space Ship", 2);
        Ship Battleship = new Ship("Battleship", "A 4-Space Ship", 4);
        Ship Cruiser = new Ship("Cruiser", "A 3-Space Ship", 3);
        
        //Displaying each ship info
        Submarine.getInfo();
        Carrier.getInfo();
        Patrol.getInfo();
        Battleship.getInfo();
        Cruiser.getInfo();
        
        //Sue Francis testing
        //Alex Griffiths was here testing this out
        //Christian Molina, testing through NetBeans as well
        //Rachel Yancey here and tested
        //Wendell Tanner - Test
        //Daniel Diaz was here
           
        Battleship260_05 myGame = new Battleship260_05();
        myGame.getName();
        myGame.displayHelp();
        myGame.displayMenu();
        
        // TODO code application logic here
    }
    public void getName()    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your name: ");
        this.name = input.next();
    }
    public void displayHelp()   {
        Rules setupRules = new Rules();
        System.out.println("\n Welcome " + this.name + "\n");
        System.out.println(setupRules.getRules());
        
    }
    public void displayMenu(){
        Menu menuDisp = new Menu();
        System.out.println(menuDisp.menuDisp());
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
