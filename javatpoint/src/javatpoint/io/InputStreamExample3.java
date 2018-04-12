package javatpoint.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class InputStreamExample3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("a.txt");
        FileInputStream fileInputStream1 = new FileInputStream("b.txt");
        FileInputStream fileInputStream2 = new FileInputStream("c.txt");
        FileInputStream fileInputStream3 = new FileInputStream("d.txt");

        Vector vector = new Vector();
        vector.add(fileInputStream);
        vector.add(fileInputStream1);
        vector.add(fileInputStream2);
        vector.add(fileInputStream3);

        Enumeration e = vector.elements();
        SequenceInputStream sequenceInputStream = new SequenceInputStream(e);

        int i = 0;
        while ((i = sequenceInputStream.read()) != -1) {
            System.out.print((char) i);
        }
        sequenceInputStream.close();
        fileInputStream.close();
        fileInputStream1.close();
        fileInputStream2.close();
        fileInputStream3.close();
    }
}
