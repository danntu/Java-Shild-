package javatpoint.io;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout = new FileOutputStream("buffered.txt");
        BufferedOutputStream bout = new BufferedOutputStream(fout);

        String s = "Welcome to javaTpoint.";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}
