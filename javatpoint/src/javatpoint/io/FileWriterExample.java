package javatpoint.io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("test.txt");
        fw.write("Welcome to javaTpoint");
        fw.close();
    }
}
