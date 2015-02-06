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
public class HelpMenuControl {
   
    public void displayMissHelp(){
        System.out.println("A miss is recorded on the grid as a letter [O].");
    }
    
    public void displayHitHelp(){
        System.out.println("A hit is recorded on the grid as a letter [X].");
    }
    
    public void displayOpenWaterHelp(){
        System.out.println("The open water is represented by a space [ ].");
    }
    
    public void displaySunkHelp(){
        System.out.println("The sunken ship will be recorded on the grid with [#].");
    }
    
    public void displayMainMenu(){
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput(); 
    }
}
