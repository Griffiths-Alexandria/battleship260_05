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
public class HighScoreView {
    
        String[] players = {"Alex", "Sue", "Rachel"}; 
        int[] scores = {11,52,31};
        ScoreInfo scoreInfo; 
    
        
    public ScoreInfo sortHighScores(){
        
        ScoreInfo scoreInfo = new ScoreInfo(); 
        
        
        for (int i = 1; i < scores.length; i++) {
       
       int j = i;
       
       while (j > 0 && scores[i] > scores[j-1]){
  	      j--;
        }
       
       int tmpScore = scores[i];
       String tmpName = players[i]; 
       
       for (int k = i; k > j; k--){
  	        
            scores[k] =scores[k - 1];
            players[k] = players[k-1];
       
            scores[j] = tmpScore;
            players[j] = tmpName;
        } 
        
    }
   
   scoreInfo.players = players; 
   scoreInfo.scores = scores; 
    
    return scoreInfo; 
    
        
}
    
    
    public void displayScores(){
        
        ScoreInfo scoreData; 
        
        System.out.println("\n**********************************************************************");
        System.out.println("**                        PLAYER    SCORES                          **");
        System.out.println("**********************************************************************\n");
        
         
         
         if(players.length != scores.length){
             System.out.println("Players Array and Scores Array are not the same size."); 
         } else {
              scoreData = sortHighScores();
              
              for(int i = 0; i < scoreData.players.length; i++){
                    System.out.println("\t" + (i+1) + ".\t" + scoreData.players[i] + "\t" + scoreData.scores[i]);
              }
       
            }
            
            
    }
    
    public void getInput(){
        
        Scanner input = new Scanner(System.in); 
        this.displayScores(); 
        input.nextLine(); 
        
        
    }
}
