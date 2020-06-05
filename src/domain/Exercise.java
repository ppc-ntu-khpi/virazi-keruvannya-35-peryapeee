/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Инна
 */
public class Exercise {

    /**
  * Checks if a given number is an Armstrong number
  * @param number 
  * @return Arm 
  */   
public static boolean Calculate(int number) {
    int count=0;             
    int num=number;           
    int Arm=0;                
    int[] digits = new int[5];
    //array filling and number counting in a number
    while(number>0){
         digits[count]=number%10;
         number=number/10;
         count++;
     }
        for(int i=0;i<count;i++){
        Arm+=Math.pow(digits[i], count);
    }
        //check if the number is Armstrong's number and return the result
    return num==Arm;
}
}
