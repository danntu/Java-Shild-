package javatpoint.io;

import java.io.Serializable;

/**
 * Created by mdaniyar on 6/1/18.
 */
public class Student2 implements Serializable {
    int id;
    String name;
    Address address;

    public Student2(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
}
