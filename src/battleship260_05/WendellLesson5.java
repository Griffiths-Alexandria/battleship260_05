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
public class WendellLesson5 {
    public void myList(){
        String[] shipList = {"Aircraft Carrier", "Battleship", "Destroyer", "Submarine", "Patrol boat"};
        int[] shipSize = {5,4,3,3,2};
        int i;
            for(i = 0; i < 5; i++){
                    System.out.println("Ship Name: " + shipList[i] + " Size: " + shipSize[i]);
                }
    }        

}
