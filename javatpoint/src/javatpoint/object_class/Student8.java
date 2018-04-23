package javatpoint.object_class;

public class Student8 {
    int rollno;
    String name;
    static String college = "NTU";

    public Student8(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student8 s1 = new Student8(111, "Karan");
        Student8 s2 = new Student8(222, "Test");
        s1.display();
        s2.display();
    }
}
