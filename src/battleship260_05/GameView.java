/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author griffiths
 */
public class GameView {
    
    private GameModel game; 
    private GameControl gameControl; 
    private BoardView inputBoard;
       
    public GameView(GameModel game) {
        this.game = game; 
        this.gameControl = new GameControl(game); 
    }

    public void gameLoop(){
        
        while(game.status != GameModel.GAME_OVER){
            if (game.status.equals(GameModel.PRE_GAME)){
                //Get player names
                game.player1.name = "Player 1";
                game.player2.name = "Player 2";
                
                //Set the player ship arrays with values
                game.player1.playerShips = game.player1.setPlayerShips(game);
                game.player2.playerShips = game.player2.setPlayerShips(game);
                game.player1.board.grid = game.player1.board.getNewBoard();
                game.player2.board.grid = game.player2.board.getNewBoard();
                
                game.status = GameModel.NEW_GAME;
            }
            if (game.status.equals(GameModel.NEW_GAME)){
                System.out.println(game.player1.name+", Please set your ships on the board.");
                for (Ship ship : game.player1.playerShips){
                    LocationInfo location = game.player1.boardView.getShipPlacement(ship, game.player1.board.getBoard());
                    game.player1.board.setShip(location, ship);
                    game.player1.boardView.displayBoard(game.player1.board.getBoard(), game.status);
                }
                System.out.println(game.player2.name+", Please set your ships on the board.");
                for (Ship ship : game.player2.playerShips){
                    LocationInfo location = game.player2.boardView.getShipPlacement(ship, game.player2.board.getBoard());
                    game.player2.board.setShip(location, ship);
                    game.player2.boardView.displayBoard(game.player2.board.getBoard(), game.status);
                }
                game.status = GameModel.PLAYING;                
            }
            new BattleshipArt().displayBattle();
            game.attacker = game.player1;
            game.defender = game.player2;
            game.defender.boardView.displayBoard(game.defender.board.getBoard(), null);
            System.out.println(game.attacker.name+", It is your turn, attack your opponent.");
            int result = game.defender.board.testAttack(game.attacker.boardView.getAttack(), game.defender.board.grid);
            switch (result) {
                case -1:
                    //Error message
                    continue;
                case 0:
                    new BattleshipArt().displayMiss();
                    // show board 
                    //alternate players method
                    break;
                case 1:
                    new BattleshipArt().displayHit();
                    //show board
                    //If Options.ShipID = True then tell which ship was hit
                    //alternate players
                    break;
            }
        }
        
    }

}

    