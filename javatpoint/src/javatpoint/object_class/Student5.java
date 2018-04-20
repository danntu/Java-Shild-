package javatpoint.object_class;

public class Student5 {
    int id;
    String name;
    int age;

    Student5(int i, String n) {
        id = i;
        name = n;
    }

    public Student5(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Student5 s1 = new Student5(111, "Karan");
        Student5 s2 = new Student5(222, "Aryan", 25);
        s1.display();
        s2.display();
    }
}
