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
public class AlexLesson5 {
        
        int[] totalHits = new int[18];
   
    public void totalHitWin(){     
                
        
        
        totalHits[0] = 0; 
        totalHits[1] = 1; 
        totalHits[2] = 2;
        totalHits[3] = 3;
        totalHits[4] = 4;
        totalHits[5] = 5;
        totalHits[6] = 6;
        totalHits[7] = 7;
        totalHits[8] = 8;
        totalHits[9] = 9;
        totalHits[10] = 10;
        totalHits[11] = 11;
        totalHits[12] = 12;
        totalHits[13] = 13;
        totalHits[14] = 14;
        totalHits[15] = 15;
        totalHits[16] = 16;
        totalHits[17] = 17;
        
        
          
        System.out.println();
  
        int calculateHits;             
        int i;
        
        for(i = 0; totalHits.length >= i; i++){ 
            System.out.println("Please enter your total hits: ");
            Scanner ph = new Scanner(System.in); 
            int playerHits = ph.nextInt(); 
            
            calculateHits = totalHits[17] - playerHits; 
            
            if(calculateHits == totalHits[0]){
                System.out.println("You sunk all the ships! Congratulations!\n\n");
            } 
            else if(calculateHits > totalHits[0] && calculateHits <= totalHits[5]){
                System.out.println("Excellent! Party On.\n\n"); 
            }
            else if(calculateHits > totalHits[5] && calculateHits <= totalHits[8]){
                System.out.println("Hmm..Not too shabby!\n\n"); 
            }
             else if(calculateHits > totalHits[8] && calculateHits <= totalHits[13]){
                System.out.println("Try again, you'll get better.\n\n"); 
            }
            else if(calculateHits > totalHits[13] && calculateHits <= totalHits[17]){
                System.out.println("Ouch. Better luck next time.\n\n"); 
            }
            else {
                new BattleshipError().displayError("Nice Try."); 
            }
            return; 
          
        }
    }
   
}

        
    

    



