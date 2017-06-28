package glava19;

import java.io.FileReader;
import java.io.IOException;

/**
 * Created by DMyrzaka on 28.06.2017.
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("D:\\glava19\\src\\glava19\\FileReaderDemo.java")){
            int c;
            while( (c=fr.read()) !=-1 ) System.out.print((char)c);
        } catch (IOException e){
            System.out.println("I/O Error: "+e);
        }
    }
}
