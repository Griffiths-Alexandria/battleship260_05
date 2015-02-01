/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;
import java.util.Random;

/**
 *
 * @author tannerwe
 */
public class Menu {
    String menuContent = "This class is currently under developement. \n"
            + "In the future it will encompass a dynamic menu. \n"
            + "I plan to use switches and loops to make the magic happen.";
   public String menuDisp(){
       System.out.println("Main Menu");
       System.out.println(this.menuContent);
       return menuContent;
   }
   // Wendell - Individual Assignment 3
   Random guess = new Random();
   int lucky;
   int luckOut;
   int thisBoardSize = 10;
   //double averageGuess;
    
   public double getSuggest(){
   for (int counter=1; counter<=10;counter++){
       lucky = guess.nextInt(this.thisBoardSize);
        if (lucky == 0){
            luckOut += (lucky+1);
        }    
        else {
            luckOut += lucky;
        }
        
    }
   double averageGuess = (double) luckOut / 10;
        return averageGuess;
        //System.out.println("The average randome guess is : " + this.averageGuess);
   }
}
