package javatpoint.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by mdaniyar on 6/1/18.
 */
public class Persist3 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("serial3");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(new Employee(111, "Danik"));
        objectOutputStream.flush();
        fileOutputStream.close();
    }
}
