/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author DMyrzaka
 */
public class ParseDemo {
    public static void main(String args[]) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter number. 0 for exit");
        int i;
        int sum=0;
        do{
            try{
               i=Integer.parseInt(br.readLine());
            } catch (NumberFormatException e){
                System.out.println("Wrong format");
                i=0;
            }
            sum+=i;
            System.out.println("Current sum "+sum);
        } while(i !=0);
    }
}
