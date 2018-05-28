package javatpoint.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by mdaniyar on 5/28/18.
 */
public class PrintStreamTest {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("testout.txt");
        PrintStream printStream = new PrintStream(fout);
        printStream.println(2018);
        printStream.println("Hello Java");
        printStream.println("Welcome to Java");
        printStream.close();
        fout.close();
        System.out.println("Success?");
        int a = 19;
        System.out.printf("%d", a);
    }
}
