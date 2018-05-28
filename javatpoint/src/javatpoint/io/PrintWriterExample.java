package javatpoint.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/**
 * Created by mdaniyar on 5/28/18.
 */
public class PrintWriterExample {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(System.out);
        writer.write("Javatpoint provides tutorials of all technology.");
        writer.flush();
        writer.close();
        PrintWriter writer1 = null;
        writer1 = new PrintWriter(new File("testout.txt"));
        writer1.write("Like Java, Spring, Hibernate, Android, PHP etc.");
        writer1.flush();
        writer1.close();
    }
}
