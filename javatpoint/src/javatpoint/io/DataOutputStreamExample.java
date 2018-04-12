package javatpoint.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("test.txt");
        DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
        dataOutputStream.writeInt(65);
        dataOutputStream.write(66);
        dataOutputStream.writeBoolean(true);
        dataOutputStream.writeDouble(2.3);
        dataOutputStream.writeUTF("Тест");
        dataOutputStream.flush();
        fileOutputStream.close();
        System.out.println("success...");
    }
}
