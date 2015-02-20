/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author griffiths
 */
public class HighScoreControl {


    ScoreInfo scoreInfo;


public ScoreInfo sortHighScores() {
    
    
    
    String[] players = {"Alex", "Sue", "Rachel"}; 
    int[] scores = {11,52,31};
    
    this.scoreInfo.scores = new int[scores.length];
    this.scoreInfo.players = new String[players.length]; 
    
    
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
    
    
    this.scoreInfo.scores = scores; 
    
    this.scoreInfo.players = players;
    
    return scoreInfo; 
    
}



    
    
    
}
