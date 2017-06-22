/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava18;

/**
 *
 * @author DMyrzaka
 */
import java.util.*;
import java.io.*;

public class AvgFile {
    public static void main(String args[]) throws IOException{
        int count = 0;
        double sum = 0.0;
        FileWriter fout=null;
        try {
             fout = new FileWriter("D:\\test.txt");
            fout.write("2 3,4 5 6 7,4 9,1 10,5 ready");
        } catch(IOException ioe){
            ioe.printStackTrace();
        }
            
        fout.close();
        
        FileReader fin=null;
        try{
            fin = new FileReader("D:\\test.txt");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        
        Scanner src = new Scanner(fin);
        while(src.hasNext()){
            if(src.hasNextDouble()){
                sum+=src.nextDouble();
                count++;
            }
            else {
                String str = src.next();
                if(str.equals("ready"))
                {
                    break;
                }
                else{
                    System.out.println("Ошибка формата файла.");
                    return;
                }
            }
        } 
        src.close();
        System.out.println("Среднее равно "+sum/count);
    }
}
