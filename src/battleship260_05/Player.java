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
  String color;
  int wins;
  int losses;
  
  //Added these variables for Player DB testing (Logan)
  int gameHits;
  int gameMisses;
  //END Player DB variables
  
  Player(String name, String color){
      this.name = name;
      this.color = color;
      this.wins = 0;
      this.losses =0;
  }
  
  public String getName(){
      return this.name;
  }
  
  public String getColor(){
      return this.color;
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
  
}
