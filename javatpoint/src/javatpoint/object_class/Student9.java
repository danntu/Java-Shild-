package javatpoint.object_class;

public class Student9 {
    int rollno;
    String name;
    static String college = "NTU";

    static void change() {
        college = "KBTU";
    }

    public Student9(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

    public static void main(String[] args) {
        Student9.change();
        Student9 s1 = new Student9(111, "Danik");
        Student9 s2 = new Student9(222, "Akmaral");
        Student9 s3 = new Student9(333, "Usen");
        s1.display();
        s2.display();
        s3.display();
    }
}