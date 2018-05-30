package javatpoint.io;

import java.io.Serializable;

/**
 * Created by mdaniyar on 5/30/18.
 */
public class Student implements Serializable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
