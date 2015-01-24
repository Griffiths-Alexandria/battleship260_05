/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author tannerwe
 */
public class Menu {
    String menuContent = "This class is currently under developement. \n"
            + "In the future it will encompass a dynamic menu. \n"
            + "I plan to use switches and loops to make the magic happen.";
   public String menuDisp(){
       System.out.println("Main Menu");
       System.out.println(this.menuContent);
       return menuContent;
   }
}
