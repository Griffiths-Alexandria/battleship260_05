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
public class DanielLesson6 {

    public static void hitCounter (){
        int [] hitsPerGame = new int [6];
    
        for (int i = 0; i < hitsPerGame.length; i = i + 1){
            hitsPerGame [i] = (int)(Math.random()*17);
        }
    
        for (int playerHits : hitsPerGame){
            System.out.println("Daniel's hits on each game today: " + playerHits);
        }
    }
}
