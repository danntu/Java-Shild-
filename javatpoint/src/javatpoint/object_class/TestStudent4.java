package javatpoint.object_class;

public class TestStudent4 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        s1.insertRecord(111, "Moldir");
        s2.insertRecord(222, "Danik");
        s1.displayInformation();
        s2.displayInformation();
    }
}
