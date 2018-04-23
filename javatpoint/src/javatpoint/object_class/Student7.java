package javatpoint.object_class;

public class Student7 {
    int id;
    String name;

    public Student7(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student7() {
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student7 s1 = new Student7(222, "Danik");
        Student7 s2 = new Student7();
        s2.id = s1.id;
        s2.name = s1.name;
        s1.display();
        s2.display();
    }
}
