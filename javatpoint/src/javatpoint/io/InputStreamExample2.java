package javatpoint.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class InputStreamExample2 {
    public static void main(String[] args) throws IOException {
        FileInputStream input1 = new FileInputStream("buffered.txt");
        FileInputStream input2 = new FileInputStream("testout.txt");
        FileOutputStream outputStream = new FileOutputStream("another.txt");
        SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);
        int i;
        while ((i = sequenceInputStream.read()) != -1) {
            outputStream.write(i);
        }
        sequenceInputStream.close();
        outputStream.close();
        input1.close();
        input2.close();
    }
}
