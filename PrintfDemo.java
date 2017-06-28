/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava19;

/**
 *
 * @author DMyrzaka
 */

public class PrintfDemo {
    public static void main(String args[]){
        System.out.println("Ниже следуют некоторые числовые значения "+ "в различных форматтах.\n");
        System.out.printf("Различные целочисленные форматы: ");
        System.out.printf("%d %(d %+d %05d\n",3,-3,3,3);

        System.out.println();
        System.out.printf("Формат с плавающей точкой по умолчанию: %f\n",1234567.123);
        System.out.printf("Плавающая точка с запятыми: %,f\n",1234567.123);
        System.out.printf("Отрицательная плавающая точка по умолчанию: %,f\n",-1234567.123);
        System.out.printf("Параметры отрицательной плавающей точки: %,(f\n",-1234567.123);
    }
}
