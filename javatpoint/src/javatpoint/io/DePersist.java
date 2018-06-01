package javatpoint.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created by mdaniyar on 6/1/18.
 */
public class DePersist {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("f.txt"));
        Student3 s = (Student3) objectInputStream.readObject();
        System.out.println(s.id + " " + s.name + " " + s.age);
        objectInputStream.close();
    }
}
