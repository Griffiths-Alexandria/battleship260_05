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
public class GameControl {

    private GameModel game; 
    private BoardView board; 
    private Player player; 
    
    
    public GameControl(GameModel game) {
        this.game = game; 
     }

    
    
    public void alternateturn(){
           
        while(game.status == GameModel.PLAYING){
            int counter = 1;
            if(counter % 2 == 0){
                this.game.player1 = this.game.attacker;
                this.game.player2 = this.game.defender;
            }
            if (counter % 2 != 0){               
                this.game.player1 = this.game.defender;
                this.game.player2 = this.game.attacker; 
            }
        counter++;
        }
    }

    
    public void takeTurn(){
          while(game.status != GameModel.GAME_OVER){
            
        }
    }
     
    public void wonGame(){
        //when the game is over - gameover() and a winner will be declared. 
    }
    
    public void gameOver(){
        //a player reaches 17 hits 
    }
    
    public void clearBoard(){
        //go through board and change all filled to null
         // Player[][] locations = this.game.getBoard().getShipPlacement();
        
        //for (int i = 0; i < this.board.getShipPlacement().length; i++) {
           // Player[] rowlocations = locations[i];
           // for (int j = 0; j < rowlocations.length; j++) {
            //    rowlocations[j] = null;
    }

     //public void startNewGame(GameModel game) {
      //  game.start();
     //   this.clearBoard();
    }
//}

    

