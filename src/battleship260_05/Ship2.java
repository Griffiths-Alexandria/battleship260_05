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
public class Ship2 {
    String description = "The 3-Space Ship";
    int size = 3;
    int hitCount = 3;
    
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
