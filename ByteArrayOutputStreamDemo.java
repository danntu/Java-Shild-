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
public class ByteArrayOutputStreamDemo {
    public static void main(String arg[]){
        ByteArrayOutputStream f = new ByteArrayOutputStream();
        String s="This should end up in the array";
        byte buf[]=s.getBytes();
        
        try{
            f.write(buf);
        }catch(IOException e){
            System.out.println("Error Writing to Buffer");
            return;
        }
        
        System.out.println("Buffer as a string");
        System.out.println(f.toString());
        System.out.println("Into array");
        byte b[]=f.toByteArray();
        for(int i=0;i<b.length;i++) System.out.print((char)b[i]);
        
        System.out.println("\nTo an OutputStream()");
        
        
        try( FileOutputStream f2= new FileOutputStream("test.txt")){
            f.writeTo(f2);
        } catch(IOException e){
            System.out.println("I/O Error: "+e);
            return;
        }
        
        System.out.println("Doing a reset");
        f.reset();
        
        for (int i = 0; i < 3; i++) {
            f.write('X');
        }
        System.out.println(f.toString());
        
        
    }
}
