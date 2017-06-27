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
public class BuffrredInputStreamDemo {
    public static void main(String args[]){
        String s="This is a &copy; copyright symbol "+
                "but this is &copy not.\n";
        byte buf[]=s.getBytes();
        
        ByteArrayInputStream in = new ByteArrayInputStream(buf);
        int c;
        boolean marked=false;
        try(BufferedInputStream f = new BufferedInputStream(in)){
            while ((c=f.read())!=-1){
                switch(c){
                    case '&':
                        if (!marked){
                            f.mark(32);
                            marked=true;
                        } else {
                            marked=false;
                        }
                        break;
                    case ';':
                        if (marked){
                            marked=false;
                            System.out.print("(c)");
                        } else 
                            System.out.print((char)c);
                        break;
                    case ' ':
                        if (marked){
                            marked=false;
                            f.reset();
                            System.out.print("&");
                        } else 
                            System.out.print((char)c);
                        break;
                        
                        default:
                            if (!marked)
                                System.out.print((char)c);
                            break;
                }
            }
        }catch(IOException e){
            System.out.println("I/O Error: "+e);
        }
    }
}
