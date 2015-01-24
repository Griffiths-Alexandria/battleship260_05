/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author Sue Francis
 */
public class Player {
  String name;
  String color;
  int wins;
  
  Player(String name, String color){
      this.name = name;
      this.color = color;
      this.wins = 0;
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
}
