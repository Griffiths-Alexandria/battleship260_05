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
 public void showsalvoShots(){
  int shipSunk[] = new int[6];
    //this is an array of possible ships sunk
    shipSunk[0] = 0;
    shipSunk[1] = 1;
    shipSunk[2] = 2;
    shipSunk[3] = 3;
    shipSunk[4] = 4;
    shipSunk[5] = 5;
    
    int i;
    int Calculateshotsleft;
    int numshipSunk = 3;//if this were to be used this is where the user input 
    for(i = 0; i < shipSunk.length;i++){
   Calculateshotsleft = 5 - shipSunk[i];//this is substracting 5 and the values
   if (numshipSunk == i){
    System.out.println("You have "+ Calculateshotsleft+ " shot(s) left.");
   } 
   //there are a couple things I realize I could add to make this code better like check the users input and display an error, however we already have a function that does this. For the purpose of the individual assignment, I kept it really basic as this isn't what we will use. 
  
    } 
 }
  
  
  
  
  
  
  //This function is to be used at the expert(Salvo) level. It calculates how much Salvo shots are left. It will output numerically as a whole number and a percentage.
  /*int shipSunk;
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
 }*/
}






