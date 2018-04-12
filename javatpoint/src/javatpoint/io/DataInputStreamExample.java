package javatpoint.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("test.txt");
        DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        int count = fileInputStream.available();
        byte[] array = new byte[count];
        System.out.println(dataInputStream.read(array));
        for (byte bt :
                array) {
            char k = (char) bt;
            System.out.print(k + "-");
        }
    }
}
