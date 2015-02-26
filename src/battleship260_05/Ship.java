/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;
import java.util.Random;

/**
 *
 * @author Christian
 */
public class Ship {
    String name;
    String description;
    int size;
    int[][] coOrd;
    Boolean sunk = false;
    
    Ship(String name, String description, int size) {
        this.name = name;
        this.description = description;
        this.size = size;
        this.coOrd = new int[this.size][2];
    }
    
    void getInfo() {
        System.out.println(this.name + ", " + this.description + "\n" + "It has a Hit Count of " + this.size);
    }
    
    public int hitReduction() {
        // if coOrd is chosen
            // if the space has already been marked
                // return -1
            // otherwise
                // reduce size by 1
                // if size equals 0
                    // set the boolean sunk equal to true
                    // return 2
                // return 1
        return 0;
    }
}
