/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author Sterling
 */


public class SterlingLessonSix {
      //computes the top five average scores
    
    public void stuff(){
        int scores [] = { 5000, 2800, 1974, 800, 700};
        int average = -1; // Error value
        int sum=0;

        /*for (int i=0; i < scores.length; i++){

        }*/

        for(int x : scores){    
            sum += x;
            average= sum /scores.length;      
        }
        System.out.println("The average score of the top 5 is: " + average);
    }
}



