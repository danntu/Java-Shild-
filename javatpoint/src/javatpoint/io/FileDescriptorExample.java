package javatpoint.io;

import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by mdaniyar on 5/29/18.
 */
public class FileDescriptorExample {
    public static void main(String[] args) {
        FileDescriptor descriptor = null;
        byte[] b = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58};
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Record.txt");
            FileInputStream fileInputStream = new FileInputStream("Record.txt");
            descriptor = fileOutputStream.getFD();
            fileOutputStream.write(b);
            fileOutputStream.flush();
            descriptor.sync();
            int value = 0;
            while ((value = fileInputStream.read()) != -1) {
                char c = (char) value;
                System.out.println(c);
            }
            System.out.println("\n Sync() successfully executed!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
