/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Logan Work
 */
public class NameMenuView {
    
    
    // Constant Menu Items
    private final static String[][] menuFunctions = {
        {"A.", "ADD PLAYER"},
        {"C.", "CHANGE PLAYER"},
        {"D.", "DELETE PLAYER"},
        {"E.", "EDIT PLAYER NAME"}            
    };
    // Get names from DB
    DBConnect playerDB = new DBConnect();
    ArrayList<String> playerList = playerDB.getNames();
    String[] playerNames = playerList.toArray(new String[playerList.size()]);
    // Default Constructor
    public NameMenuView(){
        
    }
    // Get user selection
    public void getInput(){
        
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();
            
            command = inFile.nextLine();
            command = command.trim().toUpperCase();//need toUpperCase() for letter selections
            
            switch (command){
                case "1":
                        break;
                  
            }
        }while (!command.equals(' '));
    }
    // Display method to display the menu
    public void display(){
        System.out.println("\n**********************************************************************");
            System.out.println("**                        PLAYER    SELECT                          **");
            System.out.println("**********************************************************************\n");
            Integer count = 1;
            for (String player : playerNames){
                System.out.println("\t" + count + ". " + player + "\n");
            }
            
            for (int i = 0;i < NameMenuView.menuFunctions.length;i++){
                System.out.println("\t" + menuFunctions[i][0] + " " + menuFunctions[i][1] + "\n");
                
            }
            System.out.println();
            System.out.print("Please Enter Your Choice: ");
    }
}
