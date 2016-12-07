/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
public class SuperSubCatch {
     public static void main(String args[]){
         try{
             int a=0;
             int b=42/a;
         } 
         catch(Exception e){
             System.out.println("Общий перехват Exception.");
         } /*catch (ArithmeticException e){
             System.out.println("Это никогда не выполниться");
         } */
     }
}
