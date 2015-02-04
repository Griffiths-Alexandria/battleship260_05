/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

import java.util.Scanner;

/**
 *
 * @author tannerwe
 */
public class MainMenuView {
    private final static String[][] menuItems = {
        {"1.", "NEW GAME"},
        {"2.", "OPTIONS"},
        {"3.", "RULES"},
        {"4.", "CREDITS"},
        {"5.", "EXIT"}
    };
    MainMenuControl mainMenuControl = new MainMenuControl();
    
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
                case "1"://NEW GAME
                    this.mainMenuControl.playerSelect();
                    break;
                case "2"://OPTIONS
                    this.mainMenuControl.displayOptionMenu();
                    break;
                case "3"://RULES
                    this.mainMenuControl.displayRules();
                    break;
                case "4"://Credits
                    this.mainMenuControl.displayCredits();
                    break;
                case "5"://Exit
                    break;    
                default: 
                    new BattleshipError().displayError("Invalid command. Please enter a valid command.");
                    continue;    
            }
        } while(!command.equals("5"));
        
    }
    
    public final void display(){
            System.out.println("\n**************************************************************");
            System.out.println("**                       MAIN    MENU                       **");
            System.out.println("**************************************************************\n");
            
            for (int i = 0;i < MainMenuView.menuItems.length;i++){
                System.out.println("\t" + menuItems[i][0] + " " + menuItems[i][1] + "\n");
                
            }
            System.out.println();
            System.out.print("Please Enter Your Choice: ");
    }
}
