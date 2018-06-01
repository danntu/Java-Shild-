package javatpoint.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Created by mdaniyar on 5/30/18.
 */
public class Depersist {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("serial.txt"));
        Student s = (Student) in.readObject();
        System.out.println(s.id + " " + s.name + " " + s.course + " " + s.fee);
        s.show();
        in.close();
    }
}
