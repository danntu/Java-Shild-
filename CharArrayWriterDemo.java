package glava19;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by DMyrzaka on 29.06.2017.
 */

public class CharArrayWriterDemo {
    public static void main(String[] args) throws IOException {
        CharArrayWriter f = new CharArrayWriter();
        String s ="This should end up  in the array";
        char buf[] = new char[s.length()];

        s.getChars(0,s.length(),buf,0);


        try{
            f.write(buf);
        } catch (IOException e){
            System.out.println("Error Writing to Buffer");
            return;
        }
        System.out.println("Буфер в виде строки");
        System.out.println(f.toString());
        System.out.println("В массив");
        char c[] = f.toCharArray();
        for (int i=0;i<c.length;i++)
            System.out.print(c[i]);

        System.out.println("\n В FileWriter()");
        try(FileWriter f2 = new FileWriter("test.txt")){
            f.writeTo(f2);
        } catch (IOException e){
            System.out.println("I/O Error: "+e);
        }
        System.out.println("Выполнение reset()");
        f.reset();
        for (int i=0;i<3;i++)
            f.write('X');
        System.out.println(f.toString());
    }
}
