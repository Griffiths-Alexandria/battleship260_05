/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;


import java.util.Scanner;

/**
 *
 * @author Christian
 */

/*
* This is something I came up with that might help you out Wendell.
* Just take a look and tell me what you think.
*/

public class menu_temp {
    String title_edges = "**************************************************************";
    String title_content;
    Scanner input = new Scanner(System.in);
    
    menu_temp(String title) {
        this.title_content = title;
    }
    
    void titleShow() {
        System.out.println(this.title_edges);
        System.out.println("**" + "             " + "           " + this.title_content + "             " + "             " + "**");
        System.out.println(this.title_edges);
    }
    
    void menuShow() {
        System.out.println("\n" + "1. START A NEW GAME" + "\n" + "2. QUIT GAME");
        System.out.println("\n" + "Press the number of your choice...");
        int choice = input.nextInt();
        if (choice == 1) {
            System.out.println("You will start a new game.");
        }
        else if (choice == 2) {
            System.out.println("You have quit the game.");
        }
        else {
            System.out.println("That is not a choice...");
        }
    }
}
