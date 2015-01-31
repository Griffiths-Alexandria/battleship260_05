/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package battleship260_05;

/**
 *
 * @author rachelangilau
 */
public class Turn {
 String currentPlayer = " enter coordinates.";
 
  public void showcurrentPlayer(){
    System.out.println(currentPlayer);
 } 
 
  //This function is to be used at the expert(Salvo) level. It calculates how much Salvo shots are left. It will output numerically as a whole number and a percentage.
  int shipSunk;
   int TotaLships;
  public static void getsalvoshots(int shipSunk, int TotaLships){
//before calculating how many shots are left, the function will check the number. Typically in Salvo there are only 5 ships, however  I left it open for other programmers to decide to change the total number
      if ((shipSunk < 0 ) || ( shipSunk > TotaLships)){
    System.out.println("Invalid number");
    
}
else if ((shipSunk == TotaLships)){
    System.out.println("No shots left!");
}
else if ((shipSunk <= TotaLships)){
int calculateshotsleft = (TotaLships - shipSunk); 
   double percentofshots= (double)calculateshotsleft/TotaLships;//casting the int to double
int salvoShots = (int) (percentofshots * 100);//casting double to int since we are dealing with whole numbers in percent
System.out.println(salvoShots + "% of shots left or \n" + calculateshotsleft +" \b shots left. " );
}
 }
}






