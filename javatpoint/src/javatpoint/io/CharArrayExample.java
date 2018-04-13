package javatpoint.io;

import java.io.CharArrayReader;
import java.io.IOException;

public class CharArrayExample {
    public static void main(String[] args) throws IOException {
        char[] array = {'D', 'a', 'n', 'i', 'k'};
        CharArrayReader reader = new CharArrayReader(array);
        int k = 0;
        while ((k = reader.read()) != -1) {
            char ch = (char) k;
            System.out.print(ch + " : ");
            System.out.println(k);
        }
    }
}
