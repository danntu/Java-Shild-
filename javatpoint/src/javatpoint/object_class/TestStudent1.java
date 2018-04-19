package javatpoint.object_class;

class Student1 {
    int id;
    String name;

    public void insertRecord(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayInformation() {
        System.out.println(id + " " + name);
    }
}

public class TestStudent1 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}
