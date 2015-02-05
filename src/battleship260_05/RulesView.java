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
public class RulesView {
    
    private Rules Rules;   
    
    
    private final static String[][] RulesItems = {
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
   
    // Create instance of the Rules (action) class
    private Rules rules = new Rules(); 

    //default constructor
    public RulesView(){
    
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
                    this.Rules.displayPrepareBattle();
                    break;
                case "2"://How To Play
                    this.Rules.displayHowToPlay();
                    break;
                case "3"://Calling Shots
                    this.Rules.displayCallShots();
                    break;
                case "4"://Hit Rule
                    this.Rules.displayItsAHit();
                    break;
                case "5"://Miss Rule
                    this.Rules.displayItsAMiss();
                    break;
                case "6"://Sinking Ship Rule
                    this.Rules.displaySinkingShipRule();
                    break;
                case "7"://Winning Game Rules
                    this.Rules.displayWinningGame();
                    break;
                case "8"://Salvo Rules
                    this.Rules.displaySalvoModeRules();
                    break;
                case "9"://go back to main
                    this.Rules.goBackToMain();
                    break;
                case "10":
                    break;
                default: 
                    new BattleshipError().displayError("Invalid command. Please enter a valid command.");
                       
            }
        } while(!command.equals("10"));
        
       
    }
    
    public final void display(){
            System.out.println("\n**********************************************************************");
            System.out.println("\t**                           RULES MENU                             **");
            System.out.println("\t**********************************************************************\n");
            
            System.out.print("\n\nPlease Enter Your Choice: ");
            
        for (String[] RulesItem : RulesView.RulesItems) {
            System.out.println("\t" + RulesItem[0] + " " + RulesItem[1] + "\n");
        }
            System.out.println("**********************************************************************\n");
    }
}


