package javatpoint.io;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("test.txt");

        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("Welcome to javaTpoint.");
        bw.newLine();
        bw.write("Welcome to javaTpoint 2.");
        bw.close();
        System.out.println("Success");
    }
}
