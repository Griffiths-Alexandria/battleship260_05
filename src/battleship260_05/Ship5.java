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
public class Ship5 {
    String description = "The Largest Ship";
    int size = 5;
    int hitCount = 5;
    
    void showDescription() {
        System.out.println(description);
    }
    void showSize() {
        System.out.println("Takes up " + size + " spaces.");
    }
    void showHitCount() {
        System.out.println("Can take " + hitCount + " hits.");
    }
}
