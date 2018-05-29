package javatpoint.io;

import org.jetbrains.annotations.NotNull;

import java.io.*;

/**
 * Created by mdaniyar on 5/29/18.
 */
class CustomFilterWriter extends FilterWriter {

    CustomFilterWriter(Writer out) {
        super(out);
    }

    @Override
    public void write(@NotNull String str) throws IOException {
        super.write(str.toLowerCase());
    }
}

public class FilterWriterExample {
    public static void main(String[] args) {
        try {
            FileWriter fileWriter = new FileWriter("Record.txt");
            CustomFilterWriter filterWriter = new CustomFilterWriter(fileWriter);
            filterWriter.write("I LOVE MY COUNTRY");
            filterWriter.close();
            FileReader fileReader = new FileReader("Record.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int k;
            while ((k = bufferedReader.read()) != -1) {
                System.out.print((char) k);
            }
            bufferedReader.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
