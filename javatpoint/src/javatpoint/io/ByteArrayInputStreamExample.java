package javatpoint.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) throws IOException {
        byte[] buf = {35, 36, 37, 38};
        ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(buf);
        int k = 0;

        while ((k = arrayInputStream.read()) != -1) {
            char ch = (char) k;
            System.out.println("ASCII value of Character is: " + k + ";Special character is: " + ch);
        }
    }
}
