
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
    
    public static BoardModel boardData;
    public static BoardView board;
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
        /*
        SterlingLessonSix average = new SterlingLessonSix();
        average.stuff();
        
        DanielLesson6 danielHits = new DanielLesson6();
        DanielLesson6.hitCounter();
        
        // rachel's individual assignment 6
        rachel_lesson6_individual_assignment rachel = new rachel_lesson6_individual_assignment();
        rachel.showrachelscore();
       
        //Paired programming assignment 5
        BoardView testinput = new BoardView();
        String response = testinput.getInput();
        System.out.println(response);
        
        //Alex's Individual Assignment 6
        AlexLesson6 getHitSum = new AlexLesson6(); 
        getHitSum.getHitSum(); 
        
        //Wendell Individual Assignment 6
        WendellLesson6 newAssign = new WendellLesson6();
        newAssign.totHits();
        
        //Sue's individual assignment 5
        Assignment5IndividualSue test = new Assignment5IndividualSue();
        System.out.println(test.topScore(5));
        
        
        //Sue's individual assignment 6
        
        new Assignment5IndividualSue().sumOfScore();
        
               
        /*
        // Wendell's individual assignment 5
        WendellLesson5 shipDetail = new WendellLesson5();
        shipDetail.myList();
        
        // Daniel Diaz individual assignment 5
        DanielLesso5 playersRanking = new DanielLesso5();
        playersRanking.playerRanking();
        
        //Sterling's Individual assignment 5
        //SterlingLessonFive sterling = new SterlingLessonFive();
        //sterling.showBoard();
        */
        /*
        //START 
        //To allow BoardView and BoardModel to interact, for now I am treating this main class as the controller. Logan
        
        //Bring in the Board View and get the size from the user
        board = new BoardView(); //New instance of a BoardView object.
        int boardSize = board.getBoardSize(); //Call method to allow user to input board size.
        
        //Bring in the Board Model, which requires a size and a mode(setup = true, gameplay = false)
        boardData = new BoardModel(boardSize, true); //New instance of BoardModel object, passed boardSize from input above.
        String[][] boardInfo = boardData.getNewBoard(); //The data model for the board (a two-dim String array) is created and stored in boardInfo.
        
        //Pass the Board information back to the View
        board.displayBoard(boardInfo); //Display the board to the user.
        
        String[] shipNames = {"CARRIER", "BATTLESHIP", "DESTROYER", "SUBMARINE", "PATROLBOAT"};
        String[] shipSymbols = {"C", "B", "D", "S", "P"};
        int[] shipSizes = {5,4,3,3,2};
        
        Ship[] playerShips = new Ship[shipNames.length];
        for (int s = 0; s<shipNames.length; s++){
            playerShips[s] = new Ship(shipNames[s], shipSymbols[s], shipSizes[s]);
        }
        
        for (Ship ship : playerShips){
            LocationInfo location = board.getShipPlacement(ship, boardData.getBoard());
            boardData.setShip(location, ship);
            board.displayBoard(boardData.getBoard());
        }
        boardData.shipsPlaced = true;
        
        if (boardData == null){
            new BattleshipError().displayError("There is no board to search.");
            return;
        } else if (playerShips == null){
            new BattleshipError().displayError("There are no ships to search.");
            return;
        } else if (!boardData.shipsPlaced){
            new BattleshipError().displayError("Ships have not been placed on the board.");
            return;
        } else {
            Ship search = board.getSearch(playerShips);
            int[][] result = boardData.searchBoard(search);
            board.showSearchResult(result);
        }

        /*
        // Christian's individual assignment 5
        shipPlacement christian = new shipPlacement();
        christian.gameProcessing();
        
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
        }
        //End Player DB Variables
        */
        
        Battleship260_05 newGame = new Battleship260_05(); // New instance of main class.
        
        //Show the Game Banner and Title
        new BattleshipArt().displayShip();
        new BattleshipArt().displayTitle();
        
        //Call the Main Menu View
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.getInput();
        
      
        
        
        
        
        //newGame.showPlayerOne();
        //newGame.showPlayerTwo();
        
        /*  Daniel Diaz Homework: Create a new instance of the class in the main( )  function of the main class 
        *   and call the display functions to list the values of the variables in the main ( ) funciton.
        
        ScoreBoard NewScoreboard = new ScoreBoard ("* Joe Black *", 11, 3, 5, 0, 27.28 , "\n* Sue Red *", 10, 5, 50.00);
        NewScoreboard.getInfo();
        */
        
        //  Displaying the hits by ship in a different way, I will be expecting the data from the Ship Class.
        //NewScoreboard.getShipHits(); 
        /*
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
        */
        Battleship260_05 myGame = new Battleship260_05();
        myGame.getName();
        myGame.displayHelp();
        myGame.displayMenu();

        // Menu_temp stuff
        menu_temp newMenu = new menu_temp("NEW GAME");
        newMenu.titleShow();
        newMenu.menuShow();
        
        // LESSON 3 CODE
        // Paired Programming Assignment Lesson 3
        newGame.getPlayerAccuracy(5, 8);
        newGame.getPlayerAccuracy(-1, 6);
        newGame.getPlayerAccuracy(5, -1);
        /*
        // Lesson 3 Individual : Christian
        Patrol.hitReduction();
        Patrol.hitReduction();
        Patrol.hitReduction();
        Patrol.hitReduction();
        Patrol.hitReduction();
        */
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
