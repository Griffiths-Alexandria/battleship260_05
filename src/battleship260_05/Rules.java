/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

//import java.text.DecimalFormat;


/**
 * Rules Class 
 * @author alex griffiths
 */
public class Rules {
    
    //Individual Assignment 3 Alex Griffiths
    double pageselect;
    double nextpage;
        
    void getNextPage(double pageselect, double nextpage) {
        if (pageselect >= 8 && pageselect < 0) {
            System.out.println("Invalid Page Selection\n");
          return;
        }
        if (1 < nextpage) {
            System.out.println("Please Select 1 to Continue\n");
           return;
        }
        
        double pagecalc = (nextpage - 1); 
      int determinepage = (int)(pageselect)+ (int)(pagecalc);
        
       System.out.println("We will direct you to page: \t" + determinepage + "\n");
    }
    //End Individual Assignment 3 
    
    String instructions = "This is Battleship!!\n\n"
            + "You will be playing against your friend. \n\n"
            + "Here is where I will put the official rules. \n\n"
            +"Good Luck! \n\n"; 

    // Individual Assignment Week 2 
        public void displayRules() {
        System.out.println("\n Welcome \n\n "); //add name to this greeting
        System.out.println(this.instructions); 
    }
   //End Assignment Week 2 

    public String getRules() {
        return instructions;
       
    }
    
      
      

}
    