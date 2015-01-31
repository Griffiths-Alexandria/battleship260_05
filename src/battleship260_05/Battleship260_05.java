
package battleship260_05;

/**
 *
 * @author Logan Work
 */
import java.util.Scanner;
import java.text.*;

public class Battleship260_05 {

    /**
     * @param args the command line arguments
     */
    Player player1 = new Player("Joe","black");
    Player player2 = new Player("Lucy","red");
    
    //These are our 2 instance variables
    String name;
    int choice;
    
    String instructions = "Welcome to the game of Battleship! \n\n"
           + "Player 1 and Player 2 will be competing with each other. \n"
           + "Each Player will be given the oppurtunity to hid their ships. \n"
           + "While hiding your ships the opposite player must be honest and look away. \n"
           + "After you have completed your turn the next player will have to enter [n] to view his/or her board."
           + "Additional instructions will be added later..\n"
           + "Good Luck!"; 
    String page; 
    
    void showPlayerOne() {
        System.out.println(player1.getName());
        System.out.println(player1.getColor());
    }
    void showPlayerTwo() {
        System.out.println(player2.getName());
        System.out.println(player2.getColor());
    }
    
    // Paired Programming Assignment Lesson 3
    int hits;
    int misses;
    
    void getPlayerAccuracy(int hits, int misses) {
        if (hits < 0) {
            System.out.println("Invalid number of hits\n");
            return;
        }
        if (misses < 0) {
            System.out.println("Invalid number of misses\n");
            return;
        }
        int totalShots = hits + misses;
        double playerAccuracy =  (((double)hits * 100) / (double)totalShots);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Player Accuracy:\t" + df.format(playerAccuracy) + "%\n");
    }
    
    //Logan's week 3 individual assignment
    void getTotalDamage(int hits, int totalShipsLength ){
        if (totalShipsLength < 1) {
            System.out.println("Invalid length of all ships\n");
            return;
        }
        if (hits < 0 || hits > totalShipsLength) {
            System.out.println("Invalid number of hits\n");
            return;
        }

        double totalDamage =  ((double)hits / (double)totalShipsLength) * 100;
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("Total Damage:\t" + df.format(totalDamage) + "%\n");
    }
    //End Logan's week 3 individual assignment
    
    public static void main(String[] args) {
                
        Battleship260_05 newGame = new Battleship260_05();
        
        newGame.showPlayerOne();
        
        newGame.showPlayerTwo();
        
    /** Daniel Diaz Homework: Create a new instance of the class in the main( )  function of the main class 
    *   and call the display functions to list the values of the variables in the main ( ) funciton.
    */    
        
        ScoreBoard NewGame = new ScoreBoard ("Joe Black", 5, 4, 3, 2, 3, "Sue Red", 5, 1, 2);
        
        NewGame.getInfo();       
      
        // Creating new instances of each ship. Christian.
        Ship Submarine = new Ship("Submarine", "A 3-Space Ship", 3);
        Ship Carrier = new Ship("Aircraft Carrier", "A 5-Space Ship", 5);
        Ship Patrol = new Ship("Patrol Boat", "A 2-Space Ship", 2);
        Ship Battleship = new Ship("Battleship", "A 4-Space Ship", 4);
        Ship Destroyer = new Ship("Cruiser", "A 3-Space Ship", 3);
        
        //Displaying each ship info
        Submarine.getInfo();
        Carrier.getInfo();
        Patrol.getInfo();
        Battleship.getInfo();
        Destroyer.getInfo();
        
        Patrol.hitReduction();
        Patrol.hitReduction();
        Patrol.hitReduction();
        Patrol.hitReduction();
        Patrol.hitReduction();
        
        //Sue Francis testing
        //Alex Griffiths was here testing this out
        //Christian Molina, testing through NetBeans as well
        //Rachel Yancey here and tested
        //Wendell Tanner - Test
        //Daniel Diaz was here
        //Sterling Miller was here
           
        
        Battleship260_05 myGame = new Battleship260_05();
        myGame.getName();
        myGame.displayHelp();
        myGame.displayMenu();

        //For now I am treating this main class as the controller. Below I will
        //create a board from a size input from the BoardView, which I will pass to
        //the BoardModel. The Model will then return the grid values to the View, 
        //and the view will display it to the user.
        //Bring in the Board View and get the size from the user
        BoardView newBoard = new BoardView();
        int boardSize = newBoard.getBoardSize();
        
        //Bring in the Board Model, which requires a size and
        //a mode(setup = true, gameplay = false)
        BoardModel boardData = new BoardModel(boardSize, true);
        String[][] boardInfo = boardData.getNewBoard();
        
        //Pass the Board information back to the View
        newBoard.displayBoard(boardInfo);
        
    
        
        // Menu_temp stuff
        menu_temp newMenu = new menu_temp("NEW GAME");
        newMenu.titleShow();
        newMenu.menuShow();
        
        // TODO code application logic here
        
        //Paired Programming Assignment Lesson 3
        newGame.getPlayerAccuracy(5, 8);
        newGame.getPlayerAccuracy(-1, 6);
        newGame.getPlayerAccuracy(5, -1);
        
        //Logan's test for Individual Assignment - Lesson 3
        newGame.getTotalDamage(5, 17);
        newGame.getTotalDamage(-1, 17);
        newGame.getTotalDamage(12, 0);
        newGame.getTotalDamage(25, 17);
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
        
        Scanner answer = new Scanner(System.in); 
        System.out.println("Do you wish to continue? Type Y/N \n"
                + "For Main Menu, type M:"); 
        this.page = answer.nextLine(); 
        
        
    }
    public void displayMenu(){
        Menu menuDisp = new Menu();
        Scanner option = new Scanner(System.in);
        System.out.println(menuDisp.menuDisp()); 
        System.out.println("Select an option:");
        this.choice = Integer.parseInt(option.next());
    }
     
}
