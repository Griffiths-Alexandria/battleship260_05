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
public class PlayerMenuControl {
    
    public void displayNameMenu() {
        NameMenuView nameMenu = new NameMenuView();
        //System.out.println("Starting a new two player game...");
        nameMenu.getInput();
    }
    public void startOnePlayerGame() {
        // Battleship260_05 newGame = new Battleship260_05;
        System.out.println("Starting a new single player game...");
        // newGame.generateNew1PGame();
    }
    public void returntoPreviousMenu() {
        //MainMenuView mainMenu = new MainMenuView();
        System.out.println("Returning to previous menu...");
        //mainMenu.getInput();
        return;
    }
}
