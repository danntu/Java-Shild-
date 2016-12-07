/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
public class NestTry {
    public static void main(String args[]){
        try{
        int a = args.length;
        int b = 42/a;
        try{
            if (a==1) a=a/(a-a);
            if (a==2) {
                int c[]={1};
                c[42]=99;
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Индекс за пределами массива: "+e);
        }
        } catch(ArithmeticException e){
            System.out.println("Деление на 0 :"+e);
                    
        }
        
    }
}
