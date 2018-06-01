package javatpoint.io;

import java.io.Serializable;

/**
 * Created by mdaniyar on 6/1/18.
 */
public class Employee implements Serializable {
    int id;
    String name;
    static String company = "danntu";

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
