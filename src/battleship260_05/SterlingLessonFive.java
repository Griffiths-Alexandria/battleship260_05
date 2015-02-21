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
public class SterlingLessonFive {
    
    public void showBoard(){
        int length=10;
        int width=12;
        String board[][]= new String [length][width];
        
    
        for (int i=0; i<length; i++){
            for( int j=0; j<width; j++) {
                board[i][j]="~";
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }
}
    

