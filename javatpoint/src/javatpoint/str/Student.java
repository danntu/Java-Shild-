package javatpoint.str;

public class Student {
    int rollno;
    String name;
    String city;

    public Student(int rollno, String name, String city) {
        this.rollno = rollno;
        this.name = name;
        this.city = city;
    }

    @Override
    public String toString() {
        return rollno + " " + name + " " + city;
    }

    public static void main(String[] args) {
        Student student = new Student(101, "Danik", "Almaty");
        Student student1 = new Student(102, "Moldir", "Astana");
        System.out.println(student);
        System.out.println(student1);
    }
}
