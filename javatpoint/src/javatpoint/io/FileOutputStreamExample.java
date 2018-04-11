package javatpoint.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {

        FileOutputStream fout = new FileOutputStream("testout.txt");
        String s = "Welcome to javaTpoint.";
        byte[] b = s.getBytes();
        fout.write(65);
        fout.write(b);
        fout.close();
        System.out.println("success");

    }
}
