/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author griffiths
 */
public class AlexLesson5Alternate {
            
        String[] shipTypes = new String[5];
   
    public void allShipTypes(){     
        System.out.println();
        System.out.println("WE HAVE 5 DIFFERENT SHIPS FOR THIS GAME: ");
        
        
        shipTypes[0] = "aircraft carrier";
        shipTypes[1] = "battleship";
        shipTypes[2] = "cruiser";
        shipTypes[3] = "submarine";
        shipTypes[4] = "destroyer";
        
        int i; 
        for(i=0; i < shipTypes.length; i++){
            System.out.println(shipTypes[i]);
            
        }
        System.out.println();
       
    }
}

       
        
        
         

