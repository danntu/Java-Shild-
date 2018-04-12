package javatpoint.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args) throws IOException {

        FileOutputStream fout = new FileOutputStream("testout.txt");
        byte z[] = {65, 66, 97, 98};
        String s = "ADDDDD";
        byte[] b = s.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i] + "");
        }
        fout.write(z);
        fout.write(b);
        fout.close();
        System.out.println("success");


    }
}
