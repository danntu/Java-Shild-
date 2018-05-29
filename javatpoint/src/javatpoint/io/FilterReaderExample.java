package javatpoint.io;

import org.jetbrains.annotations.NotNull;

import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by mdaniyar on 5/29/18.
 */
class CustomFilterReader extends FilterReader {
    public CustomFilterReader(@NotNull Reader in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int x = super.read();
        if ((char) x == ' ')
            return ((int) '?');
        else
            return x;
    }
}

public class FilterReaderExample {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("Record.txt");
            CustomFilterReader customFilterReader = new CustomFilterReader(reader);
            int i;
            while ((i = customFilterReader.read()) != -1) {
                System.out.print((char) i);
            }
            customFilterReader.close();
            reader.close();
        } catch (Exception e) {

        }
    }
}
