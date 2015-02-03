/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Rules Class 
 * @author alex griffiths
 */
public class Rules {
    
    //Individual Assignment 3 Alex Griffiths
    double pageselect;
      double nextpage;
       
      
    
    void getNextPage(double pageselect, double nextpage) {
        if (pageselect >= 8 && pageselect < 0) {
            System.out.println("Invalid Page Selection\n");
            return;
        }
        if (1 < nextpage) {
            System.out.println("Please Select 1 to Continue\n");
            return;
        }
        
        double pagecalc = (nextpage - 1); 
        int determinepage = (int)(pageselect)+ (int)(pagecalc);
        
        System.out.println("We will direct you to page: \t" + determinepage + "\n");
    }
    //End Individual Assignment 3 
    
    String instructions = "This is Battleship!!\n\n"
            + "You will be playing against your frieind. \n\n"
            + "Here is where I will put the official rules. \n\n"
            +"Good Luck! \n\n"; 
      
//experimenting with page and Y/N if/then loops
    String pageone = "PREPARE FOR BATTLE\n\n"
        +" Each player will place their fleet of 5 ships on your ocean \n" 
        +"grid. Each ship can be placed in any horizontal or vertical \n" 
        +"position. All ships must be placed within the boundaries of\n" 
        +"the grid, and no two ships can occupy the same gridspace. Once\n" 
        +"the ships have been set they cannot be moved and the game will\n" 
        +"begin.\n\n"; 
    
     String pagetwo= "HOW TO PLAY\n\n"
        +"Choose which partner will go first. Turns will\n" 
        +"alternate with each player calling out one shot per turn to\n"
        +"try to hit each other’s ships.\n"; 
    
    String pagethree = "CALL YOUR SHOT!\n\n"
        +" On your turn, enter a target coordinate by typing the\n" 
        +"horizontal and vertical coordinate values."; 
    
    String pagefour = "IT’S A HIT!\n\n"
        +" If your target location is occupied by an enemy ship, the \n" 
        +"shot is a hit. You will be notified that a hit has been made,\n" 
        +"as well as which ship was hit. The hit will be recorded on \n" 
        +"your opponent’s grid by a ‘X’."; 
    
    String pagefive = "IT’S A MISS!\n\n"
        +" If your target location is not occupied by an enemy ship, it \n" 
        +"is a miss. You will be notified that the shot missed and it \n" 
        +"will be recorded on the opponent’s grid by an ‘O’."; 
    
    String pagesix = "SINKING A SHIP\n\n" 
        +"Once all of one ship’s occupied grid spaces have been hit, the \n"
        +"ship has been sunk. You will be notified which ship was sunk \n" 
        +"and the grid will convert all hit locations from ‘X’ to ‘#’."; 
    
    String pageseven = "WINNING THE GAME\n\n" 
        +"The first player to sink all 5 of the opponent’s ship wins the\n" 
        +"game. Just try not to sprain anything with your victory dance."; 
    
    String pagesalvo = "SALVO MODE\n\n" 
        + "Salvo Mode uses the basic rules of the game, except each \n" 
        +"player fires as many shots as they have ships in play each\n" 
        +"turn. For example, at the start of play, the first player \n" 
        +"gives 5 sets of coordinates(one for each ship), after which he\n" 
        +"is notified of the hits and misses. When one of his ship’s is \n" 
        +"sank, he will only call 4 shots on his next turn. The more of\n" 
        +"your ships sink, the less shots you get."; 
    
  /* Individual Assignment Week 2 
        public void displayRules() {
        System.out.println("\n Welcome \n\n "); //add name to this greeting
        System.out.println(this.instructions); 
    }
    */
    
    
    
    public String getRules() {
        return pageone;
       
    }
    
      
      

}
    