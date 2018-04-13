package javatpoint.io;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CharArrayWriterExample {
    public static void main(String[] args) throws IOException {
        CharArrayWriter arrayWriter = new CharArrayWriter();
        arrayWriter.write("Welcome to Kazakhstan");
        FileWriter f1 = new FileWriter("a.txt");
        FileWriter f2 = new FileWriter("b.txt");
        FileWriter f3 = new FileWriter("c.txt");
        FileWriter f4 = new FileWriter("d.txt");
        arrayWriter.writeTo(f1);
        arrayWriter.writeTo(f2);
        arrayWriter.writeTo(f3);
        arrayWriter.writeTo(f4);
        f1.close();
        f2.close();
        f3.close();
        f4.close();
        System.out.println("Success...");
    }
}
