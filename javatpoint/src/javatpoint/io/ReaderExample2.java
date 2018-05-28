package javatpoint.io;

/**
 * Created by mdaniyar on 5/28/18.
 */

import java.io.*;

public class ReaderExample2 {
    public static void main(String[] args) throws Exception {
        char ary[] = {'1', '-', '-', '2', '-', '3', '4', '-', '-', '-', '5', '6'};
        CharArrayReader reader = new CharArrayReader(ary);
        PushbackReader push = new PushbackReader(reader);
        int i;
        while ((i = push.read()) != -1) {
            if (i == '-') {
                int j;
                if ((j = push.read()) == '-') {
                    System.out.print("#*");
                } else {
                    push.unread(j); // push back single character
                    System.out.print((char) i);
                }
            } else {
                System.out.print((char) i);
            }
        }
    }
}