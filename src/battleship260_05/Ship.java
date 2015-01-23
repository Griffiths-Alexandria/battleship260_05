/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

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
}
