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
    int hitCount;
    
    Ship(String name, String description, int size) {
        this.name = name;
        this.description = description;
        this.hitCount = size;
    }
    
    void getInfo() {
        System.out.println(this.name + ", " + this.description + "\n" + "It has a Hit Count of " + this.hitCount);
    }
    
    //Stuff for Individual Assignment
    Random coin = new Random();
    int result;
    int i;
    
    void hitReduction() {
        result = coin.nextInt(2);
        if (result == 1) {
            hitCount -= 1;
            System.out.println("A Ship has been hit!");
            if (hitCount <= 0) {
                System.out.println("Ship Destroyed!");
            }
        }
        else {
            System.out.println("You missed!");
        }
    }
}
