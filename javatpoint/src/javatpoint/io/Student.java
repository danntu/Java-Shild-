package javatpoint.io;

import java.io.Serializable;

/**
 * Created by mdaniyar on 5/30/18.
 */
public class Student extends Person {
    String course;
    int fee;

    public Student(int id, String name, String course, int fee) {
        super(id, name);
        this.course = course;
        this.fee = fee;
    }

    public void show() {
        System.out.println("id =" + id + " name=" + name + " course=" + course + " fee=" + fee);
    }
}
