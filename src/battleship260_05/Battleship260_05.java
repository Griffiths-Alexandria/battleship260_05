
package battleship260_05;

/**
 * @author Logan Work
 */

//Player DB import statements (LOGAN)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
//END Player DB import statements

import java.util.Scanner;
import java.text.*;

public class Battleship260_05 {

    
  
    
    // VARIABLE DECLARATIONS
    String name;
    int choice;
    
    String page;
    
    Player player1 = new Player("Joe","black");
    Player player2 = new Player("Lucy","red");
    
    //I don't think we are using these anywhere. NO we are not, let's delete? 
    /*String instructions = "Welcome to the game of Battleship! \n\n"
           + "Player 1 and Player 2 will be competing with each other. \n"
           + "Each Player will be given the oppurtunity to hide their ships. \n"
           + "While hiding your ships the opposite player must be honest and look away. \n"
           + "After you have completed your turn the next player will have to enter [n] to view his/or her board."
           + "Additional instructions will be added later..\n"
           + "Good Luck!"; 
    */
    
    // MAIN METHOD
    public static void main(String[] args) {
        
        shipPlacement test = new shipPlacement();
        //test.getCoordinates();
        test.cpuPlacement(test.createBoard());
        
        
        //Remote Host MySQL Test (Logan)
        DBConnect playerDB = new DBConnect();
        playerDB.displayNames();
        
        
        //**RETIRED**Player DB Connection and query (Logan)
        /*try {
            String host         = "jdbc:derby://localhost:1527/Battleship";
            String userName     = "team";
            String pwd          = "260-05";
            Connection conDB    = DriverManager.getConnection(host, userName, pwd);
            
            Statement stmt = conDB.createStatement();
            String SQL = "select * from TEAM.PLAYERS where PLAYERNAME != 'CPU'";
            ResultSet rs = stmt.executeQuery(SQL);
            String playerName;
            while (rs.next()) {
                playerName = rs.getString("PLAYERNAME");
                System.out.println(playerName);
            }
            
        }
        catch (SQLException err){
            System.out.println( err.getMessage());
        }*/
        //End Player DB Variables
        
        Battleship260_05 newGame = new Battleship260_05(); // New instance of main class.
        
        //Show the Game Banner and Title
        new BattleshipArt().displayShip();
        new BattleshipArt().displayTitle();
        
        //Temporary Test of Game Art
        /*
         * new BattleshipArt().displayBattle();
         * new BattleshipArt().displayHit();
         * new BattleshipArt().displayMiss();
         * new BattleshipArt().displaySunk();
         */
        
        
        //Call the Main Menu View
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.getInput();
        
      
        
        
        
        
        newGame.showPlayerOne();
        newGame.showPlayerTwo();
        
        /*  Daniel Diaz Homework: Create a new instance of the class in the main( )  function of the main class 
        *   and call the display functions to list the values of the variables in the main ( ) funciton.
        */
        ScoreBoard NewScoreboard = new ScoreBoard ("* Joe Black *", 11, 3, 5, 0, 27.28 , "\n* Sue Red *", 10, 5, 50.00);
        NewScoreboard.getInfo();
    
        //  Displaying the hits by ship in a different way, I will be expecting the data from the Ship Class.
        NewScoreboard.getShipHits(); 
        
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
        
        Battleship260_05 myGame = new Battleship260_05();
        myGame.getName();
        myGame.displayHelp();
        myGame.displayMenu();

        //START 
        //To allow BoardView and BoardModel to interact, for now I am treating this main class as the controller. Logan
        
        //Bring in the Board View and get the size from the user
        BoardView newBoard = new BoardView(); //New instance of a BoardView object.
        int boardSize = newBoard.getBoardSize(); //Call method to allow user to input board size.
        
        //Bring in the Board Model, which requires a size and a mode(setup = true, gameplay = false)
        BoardModel boardData = new BoardModel(boardSize, true); //New instance of BoardModel object, passed boardSize from input above.
        String[][] boardInfo = boardData.getNewBoard(); //The data model for the board (a two-dim String array) is created and stored in boardInfo.
        
        //Pass the Board information back to the View
        newBoard.displayBoard(boardInfo); //Display the board to the user.
        
        // Menu_temp stuff
        menu_temp newMenu = new menu_temp("NEW GAME");
        newMenu.titleShow();
        newMenu.menuShow();
        
        // LESSON 3 CODE
        // Paired Programming Assignment Lesson 3
        newGame.getPlayerAccuracy(5, 8);
        newGame.getPlayerAccuracy(-1, 6);
        newGame.getPlayerAccuracy(5, -1);
        
        // Lesson 3 Individual : Christian
        Patrol.hitReduction();
        Patrol.hitReduction();
        Patrol.hitReduction();
        Patrol.hitReduction();
        Patrol.hitReduction();
        
        //Logan's test for Individual Assignment - Lesson 3
        newGame.getTotalDamage(5, 17);
        newGame.getTotalDamage(-1, 17);
        newGame.getTotalDamage(12, 0);
        newGame.getTotalDamage(25, 17);
        // END LESSON 3 CODE
    }
    
    // Paired Programming Assignment Lesson 2
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
    // End Lesson 2 Assignment
    
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
    // End Lesson 3 Assignment
    
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
    void showPlayerOne() {
        System.out.println(player1.getName());
        System.out.println(player1.getColor());
    }
    void showPlayerTwo() {
        System.out.println(player2.getName());
        System.out.println(player2.getColor());
    }
    public void displayMenu(){
        Menu menuDisp = new Menu();
        Scanner option = new Scanner(System.in);
        System.out.println(menuDisp.menuDisp()); 
        System.out.println("Select an option:");
        this.choice = Integer.parseInt(option.next());
        
        //Wendell - Individual Assignment 3
        //Menu getSuggest = new Menu();
        //System.out.println("This is my average guess :");
        System.out.println("This is my average guess: " + menuDisp.getSuggest());
        //System.out.println("The average random guess is : " + getSuggest.averageGuess);

    }
}
