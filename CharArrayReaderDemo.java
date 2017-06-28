package glava19;

import java.io.CharArrayReader;
import java.io.IOException;

/**
 * Created by DMyrzaka on 28.06.2017.
 */

public class CharArrayReaderDemo {
    public static void main(String[] args) {
        String tmp="abcfefghijklmnopqrstuvwxyz";
        int length =tmp.length();
        char c[] = new char[length];
        tmp.getChars(0,length,c,0);
        int i;
        try(CharArrayReader input1 = new CharArrayReader(c)){
            System.out.println("input1: ");
            while((i=input1.read()) !=-1){
                System.out.print((char)i);
            }
            System.out.println();
        } catch (IOException e){
            System.out.println("I/O Error: "+e);
        }

        try(CharArrayReader input2 = new CharArrayReader(c,0,5)){
            System.out.println("input:");
            while((i=input2.read()) !=-1){
                System.out.print((char)i);
            }
            System.out.println();
        } catch (IOException e){
            System.out.println("I/O Error: "+e);
        }
    }
}
