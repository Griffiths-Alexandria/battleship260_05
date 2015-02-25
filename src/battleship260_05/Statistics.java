/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lmitchell
 */
public class Statistics {
    //stored value variables
    public ArrayList<String> playerNames;
    public ArrayList<Integer> playerWins;
    public ArrayList<Integer> playerLosses;
    public ArrayList<Integer> playerTotalHits;
    public ArrayList<Integer> playerTotalMisses;
    public List<Double> playerAccuracies;
    public ArrayList<Integer> playerRankings;
    
    //calculated value variables
    public double playerAccuracy;
    public int playerRanking;
    
    public Statistics(){
        this.playerAccuracies = new ArrayList<>();
    }
    public double getAccuracy(int hits, int misses){
        if (hits < 0) {
            //new BattleshipError().displayError("Invalid number of hits: " + hits);
            return -1.0;
        }
        if (misses < 0) {
            //new BattleshipError().displayError("Invalid number of misses: " + misses);
            return -1.0;
        }
        int totalShots = hits + misses;
        this.playerAccuracy =  (((double)hits * 100) / (double)totalShots);
        
        return playerAccuracy;
    }
    
    public int getRanking(double winRatio, double accuracy){
        if (winRatio < 0) {
            //new BattleshipError().displayError("Invalid number of hits: " + hits);
            return -999;
        }
        if (accuracy < 0) {
            //new BattleshipError().displayError("Invalid number of misses: " + misses);
            return -999;
        }
        this.playerRanking = (int) (1000*(winRatio/accuracy));
        
        return playerRanking;
    }
    
    public void setAccuracies(){
        for (int i = 0; i < playerNames.size(); i++){
            double acc = getAccuracy(this.playerTotalHits.get(i), this.playerTotalMisses.get(i));
            this.playerAccuracies.add(acc);
        }
    }
    public void setRankings(){
        for (int i = 0; i < playerNames.size(); i++){
            int totalGames = playerWins.get(i)+playerLosses.get(i);
            double ratio = (double) (playerWins.get(i)/totalGames);
            int rank = getRanking(ratio, playerAccuracies.get(i));
            this.playerRankings.add(rank);
        }
    }
            
}
