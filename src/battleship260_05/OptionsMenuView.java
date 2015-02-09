/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

import java.util.Scanner;

/**
 *
 * @author Sterling
 */
public class OptionsMenuView {
    private final static String[][] menuItems = {
        {"1.","Grid Size","Small","Medium","Large",":"},
        {"2.","Number of Ships","Low","Medium","High",":"},
        {"3.","Ship Identification","On/Off",":"},
        {"4.","Salvo Mode","On/Off",":"},
        {"5.","Save Settings","Yes/No",":"},
        {"6.","Exit to Main Menu","Yes/No",":"}
    };
   OptionsMenuControl OptionsMenu= new OptionsMenuControl();

   public OptionsMenuView(){
       
   }
   
    public void getInput(){
        String options;
        Scanner inFile= new Scanner(System.in);
       do{
           this.display();
           
           options= inFile.nextLine();
           options=options.trim();
        
           switch (options) {
               case "1":
                   this.OptionsMenu.displayGridSize();
                   break;
               case "2":
                   this.OptionsMenu.displayNumberOfShips();
                   break;    
               case "3":
                   this.OptionsMenu.displayShipIdentification();
                   break;
               case "4":
                   this.OptionsMenu.displaySalvoMode();
                   break;
                case "5":
                   this.OptionsMenu.displaySaveSettings();
                   break;
                case "6":
                   this.OptionsMenu.displayMainMenu();
                   break;
                default:
                    new BattleshipError().displayError("Invalid input");
                 
           } 
       }while (!options.equals("6"));
    }
    
   public final void display(){
        System.out.println("\n**********************************************************************");
        System.out.println("**                          OPTIONS  MENU                            **");
        System.out.println("**********************************************************************\n");
        for (int i = 0;i < OptionsMenuView.menuItems.length;i++){
                    System.out.println("\t" + menuItems[i][0] + " " + menuItems[i][1] + "\n");
        }
        System.out.println();
        System.out.println("Please select option: ");
   }
}
