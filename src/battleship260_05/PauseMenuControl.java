/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author rachelangilau
 */
public class PauseMenuControl {
  

 public void goBacktoGame(){
//Gameview returngame = new Gameview()
 System.out.println("Go back to game");
 // returngame.Continuegame();
 }



  public void displaySurrender(){
//Scoreboard viewscore = new Scoreboard()
      System.out.println("Are you sure?");
 // viewscore.getInfo();
 }

public void Exitgame(){
 MainMenuView mMenu = new MainMenuView();
    System.out.println("Exiting game");
    mMenu.getInput();
}
}


 
