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
public class AlexLesson6 {
        
        int[] turns = {0, 1, 2, 2, 3, 0, 4, 3, 0};

    public void getHitSum(){
        
        System.out.println(); 
        System.out.println("ALEX'S INDIVIDUAL ASSIGNMENT LESSON 6");
        System.out.println("Your Total Hit Summary:");

        int possibleHits = 17;
        int sum= 0; 
        int i;
        double average =0;
        int largest = Integer.MIN_VALUE;

            for(i=0; i < turns.length; i++){
                sum += turns[i];
                average = (double)sum/turns.length;
            }

            for (i =0; i < turns.length; i++){
                if(turns[i] > largest) {
                largest = turns[i];
                }
            }

            for(i = 0; turns.length >= i; i++){
                if(possibleHits == sum){
                System.out.println("You sunk all the ships! Congratulations!");
            }
            else if(possibleHits > sum){
                System.out.println("Almost a perfect game. Keep Trying.");
            }
            else {
                new BattleshipError().displayError("Nice Try.");
            }

            System.out.println("In " + turns.length + " turns you had " + sum + " hits!");
            System.out.println("Your average hit per turn is " + Math.round(average));
            System.out.println("Your best turn had " + largest + " hits");
            System.out.println();
            return;
        }
    }
}
