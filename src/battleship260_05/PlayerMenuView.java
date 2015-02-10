/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;
import java.util.Scanner;
/**
 *
 * @author SUE
 */
public class PlayerMenuView {
    private final static String[][] menuItems = {
        {"1.", "PLAYER VS PLAYER"},
        {"2.", "PLAYER VS COMPUTER"},
        {"3.", "EXIT"}
        };
    PlayerMenuControl playerMenuControl = new PlayerMenuControl();

    public PlayerMenuView() {

    }
    
    public void getInput(){

            String command;
            Scanner inFile = new Scanner(System.in);

            do {
                this.display();

                command = inFile.nextLine();
                command = command.trim().toUpperCase();

                switch (command) {
                    case "1"://PLAYER VS PLAYER
                        this.playerMenuControl.displayNameMenu();
                        break;
                    case "2"://PLAYER VS COMPUTER
                        this.playerMenuControl.startOnePlayerGame();
                        break;
                    case "3"://EXIT
                        this.playerMenuControl.returntoPreviousMenu();
                        break;
                    default: 
                        new BattleshipError().displayError("Invalid command. Please enter a valid command.");
                        //continue;    
                }
            }while(!command.equals("3"));
    }
    
    public final void display(){
                System.out.println("\n**********************************************************************");
                System.out.println("**                          PLAYER  MENU                            **");
                System.out.println("**********************************************************************\n");

                for (int i = 0;i < PlayerMenuView.menuItems.length;i++){
                    System.out.println("\t" + menuItems[i][0] + " " + menuItems[i][1] + "\n");

                }
                System.out.println();
                System.out.print("Please Enter Your Choice: ");
    }
}
