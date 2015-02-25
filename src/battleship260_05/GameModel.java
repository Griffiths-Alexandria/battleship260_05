/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author lmitchell
 */
public class GameModel {
    
    //Game Defaults - Hard-coded for now
    public static final int boardSize = 10;
    public static final int numShips = 5;
    public static final boolean shipID = true;
    public static final boolean salvoMode = false;
    public static String[] shipNames = {"CARRIER", "BATTLESHIP", "DESTROYER", "SUBMARINE", "PATROLBOAT"};
    public static String[] shipSymbols = {"C", "B", "D", "S", "P"};
    public static int[] shipSizes = {5,4,3,3,2};
    
    //Game Type Variables
    public static final String PvP = "TWO_PLAYER";
    public static final String PvCPU = "ONE_PLAYER";
    
    //Game Status Variables
    public static final String PRE_GAME = "PRE_GAME";
    public static final String NEW_GAME = "NEW_GAME";
    public static final String PLAYING = "PLAYING";    
    public static final String PLAY_AGAIN = "PLAY_AGAIN";
    public static final String SURRENDER = "SURRENDER";
    public static final String WINNER = "WINNER";
    public static final String GAME_OVER = "GAME_OVER";
    public static final String ERROR = "ERROR";
    
    //Instance variables
    public String type;
    public String status;
    public Player player1;
    public Player player2;
    public Player attacker;
    public Player defender;
    public Player winner;
    public Player loser;
    
    //Default Constructor
    public GameModel() {
        this.player1 = new Player();
        this.player2 = new Player();
    }
    public GameModel(String gameType){
        this();
        this.type = gameType;
        this.player1.board = new BoardModel(GameModel.boardSize, true);
        this.player2.board = new BoardModel(GameModel.boardSize, true);
        this.player1.playerShips = new Ship[GameModel.numShips];
        this.player2.playerShips = new Ship[GameModel.numShips];
        
    }
    
    public void start() {
        this.player1.board.getNewBoard();
        this.player2.board.getNewBoard();
        this.status = GameModel.NEW_GAME;
    }
}
