/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author Daniel Diaz
 */
public class DanielLesso5 {
    public void playerRanking(){
            String[] playerName = {"Joe Black", "Nina Turner", "Pete Parker", "Mike Tyson", "Daniel Diaz"};
            int[] playerRank = {1,2,3,4,5};
            int i;
            for(i = 0; i < 5; i++){
                System.out.println("Player Name: " + playerName[i] + " Player Rank: " + playerRank[i]);
            }
    }
}