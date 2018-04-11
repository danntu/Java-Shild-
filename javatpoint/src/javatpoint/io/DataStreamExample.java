package javatpoint.io;

import java.io.FileInputStream;
import java.io.IOException;

public class DataStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fin = new FileInputStream("testout.txt");
        //System.out.println("Count of bytes in file "+fin.available());
        int i = 0;
        while (i < fin.available()) {
            System.out.print((char) fin.read());
        }
        System.out.println();
        i = 0;
        FileInputStream fin1 = new FileInputStream("testout.txt");
        while ((i = fin1.read()) != -1) {
            System.out.print((char) i);
        }
        fin.close();
        fin1.close();
    }
}
