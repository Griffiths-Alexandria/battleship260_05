/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author Sue
 */
public class Assignment5IndividualSue {
    int[] topScore = new int[10];
    Assignment5IndividualSue(){
    topScore[0] = 1000;
    topScore[1] = 900;
    topScore[2] = 800;
    topScore[3] = 700;
    topScore[4] = 600;
    topScore[5] = 500;
    topScore[6] = 400;
    topScore[7] = 300;
    topScore[8] = 200;
    topScore[9] = 100;
    }
    public int topScore(int score){
        for(int i = 0; i<topScore.length; i++){
            if(score>=topScore[i]){
               return i;
            }
        }
        return -1;
      
    }
}
