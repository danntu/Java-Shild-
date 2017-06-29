package glava19;

import java.io.*;
/**
 * Created by DMyrzaka on 29.06.2017.
 */
public class BufferedReaderDemo {
    public static void main(String[] args) {
        String s ="This is a &copy; copyright symbol "+
                "but this is &copy not.\n";
        char buf[] = new char[s.length()];
        s.getChars(0,s.length(),buf,0);

        CharArrayReader in1 = new CharArrayReader(buf);
        int k;
        boolean marked =false;

        try(BufferedReader f1 = new BufferedReader(in1)){
            while((k=f1.read()) !=-1){
                switch (k){
                    case '&':
                        if(!marked){
                            f1.mark(32);
                            marked=true;
                        } else{
                            marked=false;
                        }
                        break;
                    case ';':
                        if(marked){
                            marked=false;
                            System.out.print("(c)");
                        } else
                            System.out.print((char)k);
                        break;
                    case ' ':
                        if(marked){
                            marked=false;
                            f1.reset();
                            System.out.print("&");
                        } else
                            System.out.print((char)k);
                        break;
                        default:
                            if(!marked)
                                System.out.print((char)k);
                            break;
                }
            }

        }  catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }
    }
}
