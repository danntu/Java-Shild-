package javatpoint.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by mdaniyar on 5/30/18.
 */
public class Persist {
    public static void main(String[] args) throws IOException {
        Student student = new Student(111, "Danik", "Java", 15000);
        FileOutputStream fileOutputStream = new FileOutputStream("serial.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student);
        objectOutputStream.flush();
        System.out.println("success");
    }
}
