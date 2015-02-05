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
public class RulesMenuView {
        
    private RulesMenuControl rulesMenuControl;   
    
    
    private final static String[][] RulesMenuItems = {
        {"1.", "PREPARE FOR BATTLE"},
        {"2.", "HOW TO PLAY"},
        {"3.", "CALL YOUR SHOT"}, 
        {"4.", "IT'S A HIT"},
        {"5.", "IT'S A MISS"}, 
        {"6.", "SINKING A SHIP"}, 
        {"7.", "WINNING THE GAME"}, 
        {"8.", "SALVO MODE"},
        {"9.", "GO BACK TO MAIN MENU"}, 
        
         };
    
     public RulesMenuView(){
    this.rulesMenuControl = new RulesMenuControl();
    }
    


       
    //display the rules menu and get the users input selection
    public void getInput(){
        
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();
            
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            
            switch (command) {
                
                case "1"://Prepare Battle Scene
                    this.rulesMenuControl.displayPrepareBattle();
                    break;
                case "2"://How To Play
                    this.rulesMenuControl.displayHowToPlay();
                    break;
                case "3"://Calling Shots
                    this.rulesMenuControl.displayCallShots();
                    break;
                case "4"://Hit Rule
                    this.rulesMenuControl.displayItsAHit();
                    break;
                case "5"://Miss Rule
                    this.rulesMenuControl.displayItsAMiss();
                    break;
                case "6"://Sinking Ship Rule
                    this.rulesMenuControl.displaySinkingShipRule();
                    break;
                case "7"://Winning Game Rules
                    this.rulesMenuControl.displayWinningGame();
                    break;
                case "8"://Salvo Rules
                    this.rulesMenuControl.displaySalvoModeRules();
                    break;
                case "9"://go back to main
                    this.rulesMenuControl.goBackToMain();
                    break;
                case "10":
                    break;
                default: 
                    new BattleshipError().displayError("Invalid command. Please enter a valid command.");
                       
            }
        } while(!command.equals("9"));
        
       
    }
    
    public final void display(){
            System.out.println("\n**********************************************************************");
            System.out.println("**                            RULES  MENU                           **");
            System.out.println("**********************************************************************\n");
            
        for (String[] RulesMenuItem : RulesMenuView.RulesMenuItems) {
            System.out.println("\t" + RulesMenuItem[0] + " " + RulesMenuItem[1] + "\n");
        }
        System.out.print("\n Please Enter Your Choice: ");    
        
    }
}
