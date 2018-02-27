package io;

import java.io.*;

public class FileStreamTest {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = null;
        InputStream inputStream = null;
        try {
            byte bWrite[] = {65, 66, 67, 68, 69};
            outputStream = new FileOutputStream("test.txt");
            for (int i = 0; i < bWrite.length; i++) {
                //System.out.println(bWrite[i]);
                outputStream.write(bWrite[i]);
            }

            inputStream = new FileInputStream("test.txt");
            int size = inputStream.available();

            for (int i = 0; i < size; i++) {
                System.out.print((char) inputStream.read() + "  ");
            }

        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
        }

    }
}
