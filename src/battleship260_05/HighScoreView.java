/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

import java.text.DecimalFormat;
import java.util.Scanner;


/**
 *
 * @author griffiths
 */
public class HighScoreView {
    
    DBConnect playerDB;
    Statistics stats;
    Statistics sortedStats;
    
    int[] ranks;
        //String[] players = {"Alex", "Sue", "Rachel"}; 
        //int[] scores = {11,52,31};
        //ScoreInfo scoreInfo; 
    
    public HighScoreView(){
        this.playerDB = new DBConnect();
        playerDB.displayNames();
        this.stats = new Statistics();
        Statistics test = playerDB.getAllPlayerData();
        this.stats = test;
        this.stats.setAccuracies();
        this.stats.setRankings();
    }
    public Statistics sortHighScores(){
    
        for (int i = 1; i < this.stats.playerRankings.size(); i++) {
            int j = i;
            while (j > 0 && this.stats.playerRankings.get(i) > this.stats.playerRankings.get(j-1)){
                j--;
            }

            int tmpRank = this.stats.playerRankings.get(i);
            String tmpName = this.stats.playerNames.get(i); 
            int tmpWins = this.stats.playerWins.get(i); 
            int tmpLosses = this.stats.playerLosses.get(i); 
            double tmpAcc = this.stats.playerAccuracies.get(i); 

            for (int k = i; k > j; k--){

                this.stats.playerRankings.set(k, this.stats.playerRankings.get(k-1));//[k] =scores[k - 1];
                this.stats.playerNames.set(k, this.stats.playerNames.get(k-1));//[k] =scores[k - 1];
                this.stats.playerWins.set(k, this.stats.playerWins.get(k-1));//[k] =scores[k - 1];
                this.stats.playerLosses.set(k, this.stats.playerLosses.get(k-1));//[k] =scores[k - 1];
                this.stats.playerAccuracies.set(k, this.stats.playerAccuracies.get(k-1));//[k] =scores[k - 1];
                //players[k] = players[k-1];

                this.stats.playerRankings.set(j, tmpRank);
                this.stats.playerNames.set(j, tmpName);
                this.stats.playerWins.set(j, tmpWins);
                this.stats.playerLosses.set(j, tmpLosses);
                this.stats.playerAccuracies.set(j, tmpAcc);

                    //scores[j] = tmpScore;
                    //players[j] = tmpName;
            } 
        
        }
        
        //scoreInfo.players = players; 
        //scoreInfo.scores = scores; 

        return this.stats; //scoreInfo;             
    }
    
    
    public void displayScores(){
        
        //ScoreInfo scoreData; 
        Statistics highScores;
        
        System.out.println("\n**********************************************************************");
        System.out.println("**                        PLAYER    SCORES                          **");
        System.out.println("**********************************************************************\n");
        
         
        /* 
        if(players.length != scores.length){
             System.out.println("Players Array and Scores Array are not the same size."); 
        } else {
        */
        highScores = sortHighScores();//scoreData = sortHighScores();
        DecimalFormat df = new DecimalFormat("##0.0");
        for(int i = 0; i < highScores.playerNames.size(); i++){
              System.out.println("  " + (i+1) + ".\t" + highScores.playerNames.get(i) + "\t"
                      + highScores.playerWins.get(i) + "\t" + highScores.playerLosses.get(i)
                      + "\t" + df.format(highScores.playerAccuracies.get(i)) + "%\t" + highScores.playerRankings.get(i));
        }
        
    }
    
    public void getInput(){
        
        Scanner input = new Scanner(System.in); 
        this.displayScores(); 
        input.nextLine(); 
                
    }
}
