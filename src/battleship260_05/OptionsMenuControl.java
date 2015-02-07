/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author Daniel Diaz
 * //I went simple on this coding so we do not get complicated Sterling.
 * //It is ready for your OptionsMenuView, Happy coding man!
 */
public class OptionsMenuControl {
    
    //I think we will have to add a subclass to get theese other options working.
    public void displayGridSize(){
        System.out.println("SMALL             MEDIUM                LARGE");
    }
    
    public void displayNumberOfShips(){
        System.out.println("LOW               MEDIUM                HIGH");
    }
    
    public void displayShipIdentification(){
        System.out.println("         ON                     OFF");
    }
    
    public void displaySalvoMode(){
        System.out.println("         ON                     OFF");
    }
    
    public void displaySaveSettings(){
        System.out.println("        SAVE                   CANCEL");
    }
    
    public void displayMainMenu(){
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.getInput(); 
    }
}
