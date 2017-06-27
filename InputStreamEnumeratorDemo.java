/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava19;

/**
 *
 * @author DMyrzaka
 */
import java.io.*;
import java.util.*;
class InputStreamEnumerator implements Enumeration<FileInputStream>{
    private Enumeration<String> files;
    public InputStreamEnumerator(Vector<String> files){
        this.files=files.elements();
    }
    
    public boolean hasMoreElements(){
        return files.hasMoreElements();
    }
    
    public FileInputStream nextElement(){
        try{
            return new FileInputStream(files.nextElement().toString());
        } catch(IOException e){
            return null;
        }
    }
} 
public class InputStreamEnumeratorDemo {
    public static void main(String args[]){
        int c;
        Vector<String> files = new Vector<>();
        files.addElement("file1.txt");
        files.addElement("file2.txt");
        files.addElement("file3.txt");
        InputStreamEnumerator ise = new InputStreamEnumerator(files);
        InputStream input = new SequenceInputStream(ise);
        
        try{
            while((c=input.read()) !=-1)
                System.out.print((char)c);
        } catch (IOException e){
            System.out.println("I/O Error: "+e);
        } finally {
            try{
                input.close();
            } catch(IOException e){
                System.out.println("Error Closing SequenceInputStream");
            }
        }
    }
}
