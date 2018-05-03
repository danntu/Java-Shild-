package javatpoint.encapsulation;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        Student student2 = null;
        student.setName("Danik");
        System.out.println("Student1 name is " + student.getName());
        try {
            student2 = (Student) student.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        student2.setName("Danik1");
        System.out.println("Student2 name is " + student2.getName());
    }
}
