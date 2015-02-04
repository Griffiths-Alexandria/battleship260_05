/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author Logan Work
 */
public class BattleshipArt {
    
    public Object displayTitle(){
        System.out.println("**********************************************************************");
        System.out.println("*  ___     _    _____   _____   _      ___   ___   _  _   ___   ___  *");
        System.out.println("* | _ )   /_\\  |_   _| |_   _| | |    | __| / __| | || | |_ _| | _ \\ *");
        System.out.println("* | _ \\  / _ \\   | |     | |   | |__  | _|  \\__ \\ | __ |  | |  |  _/ *");
        System.out.println("* |___/ /_/ \\_\\  |_|     |_|   |____| |___| |___/ |_||_| |___| |_|   *");
        System.out.println("*                                                                    *");
        System.out.println("**********************************************************************\n");
        return null;
    }
    
    public Object displayBattle(Object object){
        String message = (String) object;
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("ERROR: " + message);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        return null;
    }
    public Object displayShip(){
        System.out.println("\n                            ||_");
        System.out.println("                         \\_/   |    ||");
        System.out.println("     ,         \\_  \\_  _/=      \\_=====_|___");
        System.out.println("     \\`--------===-===’                     |_==./__.._____.===--/");
        System.out.println("      \\________________________________________________________/\n");
        return null;
    }
    public Object displayMiss(Object object){
        String message = (String) object;
        System.out.println("\n**************************************************************");
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("ERROR: " + message);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        return null;
    }
    public Object displayHit(Object object){
        String message = (String) object;
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("ERROR: " + message);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        return null;
    }
    public Object displaySunk(Object object){
        String message = (String) object;
        System.out.println("\n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("ERROR: " + message);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
        return null;
    }
}
