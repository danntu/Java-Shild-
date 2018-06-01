package javatpoint.io;

import java.io.Serializable;

/**
 * Created by mdaniyar on 6/1/18.
 */
public class Student3 implements Serializable {
    int id;
    String name;
    transient int age;

    public Student3(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
