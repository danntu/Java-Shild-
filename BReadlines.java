
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
public class BReadlines {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Вводите строки текста.");
        System.out.println("Введите 'стоп' для завершения");
        
        do{
            str=br.readLine();
            System.out.println(str);
        } while(!str.equals("stop"));
    }
    
}
