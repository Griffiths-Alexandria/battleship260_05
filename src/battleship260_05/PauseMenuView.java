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
       private final static String[][] menuItems = {
        {"1.", "BACK TO GAME"},
        {"2.", "SURRENDER"},
        {"3.", "EXIT GAME"},
         };
    PauseMenuControl PauseMenuControl = new PauseMenuControl();
    
    //Default contructor
    public MainMenuView(){
        
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
                    this.PauseMenuControl.displayBacktogame();
                    break;
                case "2"://SURRENDER
                    this.PauseMenuControl.displaySurrender();
                    break;
                case "3"://EXIT GAME
                    this.PauseMenuControl.displayExitgame();
                    break;
                case "4"://Credits
                    break;
                default: 
                    new BattleshipError().displayError("Invalid command. Please enter a valid command.");
                    //continue;    
            }
        } while(!command.equals("3"));
        
    }
    
    public final void display(){
            System.out.println("\n**********************************************************************");
            System.out.println("**                           PAUSE  MENU                              **");
            System.out.println("**********************************************************************\n");
            
            for (int i = 0;i < MainMenuView.menuItems.length;i++){
                System.out.println("\t" + menuItems[i][0] + " " + menuItems[i][1] + "\n");
                
            }
            System.out.println();
            System.out.print("Please Enter Your Choice: ");
    }
}
