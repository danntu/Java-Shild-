
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DMyrzaka
 */
public class ShowFile {
    public static void main(String[] args) {
        int i;
        FileInputStream fin;
           
        if (args.length !=1) {
            System.out.println("Using: ShowFile filename");
            return;
        }
        
    
        //
        try{
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException e){
            System.out.println("I can't open file"); 
            return;
        }
        
        try{
            do {
                i = fin.read();
                if (i !=-1) System.out.print((char)i);
            } while (i != -1);
        } catch(IOException e){
            System.out.println("Error reading file");
        }
        
        finally{
        try{
            fin.close();
        } catch(IOException e){
            System.out.println("Error close file");
        }
        }
        
    }
}
