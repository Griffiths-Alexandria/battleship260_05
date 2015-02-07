/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author Sterling
 */
public class OptionsMenuView {
    private final static string[][] menuItems = {
        {"1.","Grid Size","Small","Medium","Large",":"},
        {"2.","Number of Ships","Low","Medium","High",":"},
        {"3.","Ship Identification","On/Off",":"},
        {"4.","Salvo Mode","On/Off",":"},
        {"5.","Save Settings","Yes/No",":"},
        {"6.","Exit to Main Menu","Yes/No",":"}
    };
   OptionsMenu OptionsMenu= new optionsMenu();

   public OptionsMenuView(){
       
   }
   
    public void getInput(){
        String options;
        Scanner inFile= new Scanner(System.in);
       do{
           this.display();
           
           options= inFile.nextLine();
           options=options.trim();
        
           switch (options) {
               case "1":
                   this.OptionsMenu.gridSize();
                   break;
               case "2":
                   this.OptionsMenu.numShips();
                   break;    
               case "3":
                   this.OptionsMenu.shipId();
                   break;
               case "4":
                   this.OptionsMenu.salvo();
                   break;
                case "5":
                   this.OptionsMenu.save();
                   break;
                case "6":
                   this.OptionsMenu.exitMainMenu();
                   break;
                default:
                    new optionsError().displayError("Invalid input");
                 
           } 
       }while (!options.equals("6"));
    }
    
   public final void display(){
                System.out.println("\n**********************************************************************");
                System.out.println("**                          OPTIONS  MENU                            **");
                System.out.println("**********************************************************************\n");
               
    
for (int i = 0;i < PlayerMenuView.menuItems.length;i++){
                    System.out.println("\t" + menuItems[i][0] + " " + menuItems[i][1] + "\n");

}
System.out.println();
System.out.println("Please select option: ");
   }
