package javatpoint.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by mdaniyar on 6/1/18.
 */
public class Persist2 {
    public static void main(String[] args) throws IOException {
        Student2 student2 = new Student2(111, "Moldir", new Address());
        FileOutputStream fileOutputStream = new FileOutputStream("serial2.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(student2);
        objectOutputStream.flush();
        System.out.println("success");
    }
}
