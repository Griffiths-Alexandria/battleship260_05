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
public class HelpMenuView {
    
    private final static String[][] helpMenuItems={
        {"1.","What is a miss?"},
        {"2.","What is a Hit?"},
        {"3.","What is open water?"},
        {"4.","How do I know if my ship is sunk?"},
        {"5.","Back to Main Menu"}
            
        
    }; 
   HelpMenuControl helpMenuControl=new HelpMenuControl();
   
    //Default Constructor
   public HelpMenuView(){
       
   }
   public void getInput(){
       String help;
       Scanner inFile = new Scanner(System.in);
      do{
          this.display();
          help=inFile.nextLine();
          help=help.trim();
         
          switch (help){
              case "1":
                 this.helpMenuControl.displayMissHelp();
                  break;
                  
              case "2":
                 this.helpMenuControl.displayHitHelp();
                  break;
                  
              case "3":
                 this.helpMenuControl.displayOpenWaterHelp();
                  break;
                  
              case "4":
                 this.helpMenuControl.displaySunkHelp();
                  break;
                  
              case "5":
                 this.helpMenuControl.displayMainMenu();
                  break;
             
               default: 
                    new BattleshipError().displayError("Invalid command. Please enter a valid command.");   
          }
      } while(!help.equals("5"));
       
   }
  public final void display(){
            System.out.println("\n**********************************************************************");
            System.out.println("**                          HELP    MENU                            **");
            System.out.println("**********************************************************************\n");
    for (int i = 0;i < HelpMenuView.helpMenuItems.length;i++){ 
        System.out.println("\t" + helpMenuItems[i][0] + " " + helpMenuItems[i][1] + "\n");
    }
    System.out.println();
    System.out.println("Please enter your choice: ");
  } 
}



