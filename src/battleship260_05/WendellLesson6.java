/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author tannerwe
 */
public class WendellLesson6 {
    public void totHits(){
        String[] shipList = {"Aircraft Carrier", "Battleship", "Destroyer", "Submarine", "Patrol boat"};
        int[] shipSize = {5,4,3,3,2};
        int sum = 0;
        int x = 0;
        
        for(int i: shipSize){ // for-each style for loop
            System.out.println("Ship Name: " + shipList[x] + " Size: " + i);
            sum +=i;
            x += 1; // increment variable x to pull from my String array
        }  
        System.out.println("Total Hits to Win: " + sum); //Output the total hits
    }      
}
