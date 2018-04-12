package javatpoint.io;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream outputStream1 = new FileOutputStream("f1.txt");
        FileOutputStream outputStream2 = new FileOutputStream("f2.txt");
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();

        arrayOutputStream.write(65);
        arrayOutputStream.writeTo(outputStream1);
        arrayOutputStream.writeTo(outputStream2);

        for (int i = 0; i < arrayOutputStream.toByteArray().length; i++) {
            System.out.println((char) arrayOutputStream.toByteArray()[i]);
        }

    }
}
