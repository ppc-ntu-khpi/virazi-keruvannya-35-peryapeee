/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import static domain.Exercise.Calculate;
/**
 *
 * @author Инна
 */
public class TestResult {
    public static void main(String[] args) {
     int numb = 153;
     if(Calculate(numb)){
         System.out.println("Число "+numb+" является числом Армстронга");
     }  
     else{
         System.out.println("Число "+numb+" не является числом Армстронга");
     }  
}
}
