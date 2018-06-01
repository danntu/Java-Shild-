package javatpoint.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by mdaniyar on 6/1/18.
 */
public class PersistExample {
    public static void main(String[] args) throws IOException {
        Student3 student3 = new Student3(11, "Daniyar", 32);
        FileOutputStream fileOutputStream = new FileOutputStream("f.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student3);
        objectOutputStream.flush();
        fileOutputStream.close();
        objectOutputStream.close();
        System.out.println("success");
    }
}
