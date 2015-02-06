/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

import java.util.Scanner;

/**
 *
 * @author griffiths
 */

public class PauseMenuView {
    private final static String[][] pauseMenuItems = {
        {"1.", "BACK TO GAME"},
        {"2.", "SURRENDER"},
        {"3.", "EXIT GAME"},
         
    };
   
    //Default constructor
    PauseMenuControl PauseMenuControl = new PauseMenuControl();
    
    public PauseMenuView(){
    }
  
    
    public void getInput(){
        
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();
            
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                case "1"://BACK TO GAME
                    this.PauseMenuControl.goBacktoGame();
                    break;
                case "2"://SURRENDER
                    this.PauseMenuControl.displaySurrender();
                    break;
                case "3"://EXIT GAME
                    this.PauseMenuControl.Exitgame();
                    break;
                case "4"://END
                    break;
                default: 
                    new BattleshipError().displayError("Invalid command. Please enter a valid command.");
                      
            }
        } while(!command.equals("4"));
        
        
    }
    
    public final void display(){
            System.out.println("\n**********************************************************************");
            System.out.println("\t**                           PAUSE  MENU                              **");
            System.out.println("\t**********************************************************************\n");
            System.out.print("\n\nPlease Enter Your Choice: ");
            
        for (String[] pauseMenuItem : PauseMenuView.pauseMenuItems) {
            System.out.println("\t" + pauseMenuItem[0] + " " + pauseMenuItem[1] + "\n");
        }
            System.out.println("**********************************************************************\n");
    }
}
