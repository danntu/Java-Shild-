package javatpoint.object_class;

class Student10 {
    int rollno;
    String name, course;
    float fee;

    public Student10(int rollno, String name, String course) {
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    public Student10(int rollno, String name, String course, float fee) {
        this(rollno, name, course);
        this.fee = fee;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }
}

public class TestThis7 {
    public static void main(String[] args) {
        Student10 s1 = new Student10(111, "ankit", "java");
        Student10 s2 = new Student10(112, "sumit", "java", 6000f);
        s1.display();
        s2.display();
    }
}
