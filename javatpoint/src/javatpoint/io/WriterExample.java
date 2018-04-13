package javatpoint.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) throws IOException {
        Writer w = new FileWriter("output.txt");
        String text = "Я люблю";
        w.write(text);
        w.close();
        System.out.println("Done");
    }
}
