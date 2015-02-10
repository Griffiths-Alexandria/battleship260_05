/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

import java.util.*;

/**
 *
 * @author Christian
 */
public class shipPlacement {
    void getCoordinates() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter some coordinates (Letter and number):");
        String coOrds = input.nextLine();
        String coOrdA = coOrds.substring(0, 2);
        coOrdA = coOrdA.toUpperCase();
        String coOrdB = coOrds.substring(2);
        System.out.println();
        System.out.println("You entered: " + coOrds + "\nWe see: " + coOrdA + coOrdB);
        System.out.println("\nPress Enter to Continue...");
        input.nextLine();
    }
}
