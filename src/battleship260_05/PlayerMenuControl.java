/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author Christian
 */
public class PlayerMenuControl {
    
    public void startGame(int numPlayers) {
        GameModel game = new GameModel();
        if (numPlayers == 2){
            game = this.createGame("TWO_PLAYER");
            
        }
        GameView gameView = new GameView(game);
        gameView.gameLoop();

    }
    public void returntoPreviousMenu() {
        //MainMenuView mainMenu = new MainMenuView();
        System.out.println("Returning to previous menu...");
        //mainMenu.getInput();
        return;
    }
    private GameModel createGame(String gameType){
        GameModel game = null;
        Player player1 = null;
        Player player2 = null;
        
        if (gameType.equals(GameModel.PvP)){
            game = new GameModel(GameModel.PvP);
            player1 = new Player();
            player2 = new Player();
            
        }
        game.player1 = player1;
        game.player2 = player2;
        game.status = GameModel.PRE_GAME;
        
        return game;
    }
}
