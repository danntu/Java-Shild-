package javatpoint.io;

import java.io.Serializable;

/**
 * Created by mdaniyar on 6/1/18.
 */
public class Person implements Serializable {
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
