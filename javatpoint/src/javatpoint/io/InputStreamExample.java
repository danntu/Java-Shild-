package javatpoint.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class InputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream input1 = new FileInputStream("buffered.txt");
        FileInputStream input2 = new FileInputStream("testout.txt");
        SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);
        int i;
        while ((i = sequenceInputStream.read()) != -1) {
            System.out.print((char) i);
        }
        sequenceInputStream.close();
        input1.close();
        input2.close();
    }
}
