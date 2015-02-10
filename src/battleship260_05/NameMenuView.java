/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

import java.util.Scanner;

/**
 *
 * @author Logan Work
 */
public class NameMenuView {
    // Constant Menu Items
    private final static String[][] menuFunctions = {
        {"A.", "ADD PLAYER"},
        {"C.", "CHANGE PLAYER NAME"},
        {"D.", "DELETE PLAYER"},
        {"N.", "SHOW NEXT"}            
    };
    // Get names from DB
    
    // Default Constructor
    public NameMenuView(){
        
    }
    // Get user selection
    public void getInput(){
        
        int x;
        String command;
        Scanner inFile = new Scanner(System.in);
        
        do {
            this.display();
            
            command = inFile.nextLine();
            command = command.trim().toUpperCase();//need toUpperCase() for letter selections
            
            switch (command){
                case "A":
                        break;
                  
            }
        }while (!command.equals(' '));
    }
    // Display method to display the menu
    public static void display(){
        
    }
}
