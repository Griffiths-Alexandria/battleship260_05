/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author Sue FrancisString name;
  String color;
  int wins;
  * revision Sue
 */
public class Player {
  String name;
  BoardModel board;
  BoardView boardView;
  Ship[] playerShips;
  int wins;
  int losses;
  
  //Added these variables for Player DB testing (Logan)
  int gameHits;
  int gameMisses;
  //END Player DB variables
  
  public Player(){
      /*this.name = name;
      this.wins = 0;
      this.losses =0;*/
  }
  
  public String getName(){
      return this.name;
  }
  
  public int getWins(){
      return this.wins;
  }
  public int getLosses(){
      return this.losses;
  }
  public double GetWinningStatistics(){
      if (wins < 0){ 
        System.out.println("Invalid number of wins\n");
        return -1;
      }
      if (losses < 0){
        System.out.println("Invalid number of losses\r");
        return -1;
      }
      if (wins == 0) return 0;
      return (double)(wins/gameTotals())*100;
      
  } 
  public int gameTotals(){
      return (wins + losses);
      
}
    public Ship[] setPlayerShips(GameModel game){
        int numShips = GameModel.numShips;
        Ship[] playerShips = new Ship[numShips];
        for (int s = 0; s < numShips; s++){
            playerShips[s] = new Ship(GameModel.shipNames[s], GameModel.shipSymbols[s], GameModel.shipSizes[s]);
        }
        return playerShips;
    }
  
}
