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
            System.out.println("It is " + game.currentPlayer.name )
        }
        
    }

}

    