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
    Boolean sunk = false;
    
    Ship(String name, String description, int size) {
        this.name = name;
        this.description = description;
        this.size = size;
    }
    
    void getInfo() {
        System.out.println(this.name + ", " + this.description + "\n" + "It has a Hit Count of " + this.size);
    }
    
    //Stuff for Individual Assignment
    Random coin = new Random(); //The random operator works great! I will try to use it on my class next time, cool.
    int result;
    
    void hitReduction() {
        result = coin.nextInt(100);
        if (result >= 50) {
            if (size == 0) {
                System.out.println("There is no ship remaining!");
            }
            else {
                size -= 1;
                System.out.println("A Ship has been hit!");
                if (size <= 0) {
                    sunk = true;
                    System.out.println("Ship Destroyed!");
                }
            }
        }
        else {
            System.out.println("You missed!");
        }
    }
}
