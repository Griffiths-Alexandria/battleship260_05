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
                
                
                
                game.status = GameModel.NEW_GAME;
            }
            
            
        }
        
    }

}

    