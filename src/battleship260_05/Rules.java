/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 * Rules Class 
 * @author alex griffiths
 */
public class Rules {
    String instructions = "Welcome, This is Battleship!!\n\n"
            + "You will be playing against your frieind \n\n"
            + "Here is where I will put the official rules \n\n"
            +"Good Luck! \n\n"; 
    
    
    public void displayRules() {
        System.out.println("\n Welcome "); //add name to this greeting
        System.out.println(this.instructions); 
    }
}
