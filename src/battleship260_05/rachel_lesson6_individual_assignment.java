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
public class rachel_lesson6_individual_assignment {
     
    public void showrachelscore(){ 
            int rachelsScore[] = {111,123,45,89,94,179};
        int temp;
        double average=0;
        double round;
 
        int i;
        boolean flag = true;   
        while ( flag ){
            flag= false;    
            for( i=0;  i < rachelsScore.length-1;  i++ ){
                if ( rachelsScore[ i] > rachelsScore[i+1] ){
                    temp = rachelsScore[i];               
                    rachelsScore[ i] = rachelsScore[ i+1 ];
                    rachelsScore[ i+1 ] = temp;
                    flag = true;             
                } 
            } 
        }
        System.out.println();
        System.out.print("Rachel's scores;");
        for(int x: rachelsScore){
            System.out.print(x+" ");
        }
        for(int x:rachelsScore){
            average +=x;
        }    
        System.out.println();
        average = average/rachelsScore.length;
        round = Math.round(average);
        System.out.println("Rachel's average is "+ round);
    }
}

