/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava18;

/**
 *
 * @author DMyrzaka
 */
import java.util.Scanner;
public class AvgNums {
    public static void main(String args[]){
        Scanner conin = new Scanner(System.in);
        
        int count=0;
        double sum=0.0;
        
        System.out.println("Введите числа для подсчета среднего.");
        
        while(conin.hasNext()){
            if (conin.hasNextDouble()){
                sum+=conin.nextDouble();
                count++;
            }
            else{
                String str = conin.next();
                if (str.equals("ready")) break;
                else {
                    System.out.println("Ошибка формата данных.");
                    return;
                }
            }
        }
        conin.close();
        System.out.println("Среднее равно "+sum/count);
    }
}
