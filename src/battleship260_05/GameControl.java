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
    
    
    
    public GameControl(GameModel game) {
        this.game = game; 
        this.board = board; 
     }

    
    
    public void alternateturn(){
  
           int counter = 0; 
            if(counter % 2 == 0){
                this.game.player1 = this.game.attacker;
                this.game.player2 = this.game.defender;
                counter++; 
            }
            else if (counter % 2 == 1){               
                this.game.player1 = this.game.defender;
                this.game.player2 = this.game.attacker; 
                counter++; 
            }
   

}
    
     
    public void wonGame(){
        //when the game is over - gameover() and a winner will be declared. 
    }

        

}

    

