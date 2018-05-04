package javatpoint.oop;

public class Student18 implements Cloneable {
    int rollno;
    String name;

    public Student18(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        try {
            Student18 student18 = new Student18(101, "Danik");
            Student18 student181 = (Student18) student18.clone();

            System.out.println(student18.rollno + " " + student18.name);
            System.out.println(student181.rollno + " " + student181.name);

        } catch (CloneNotSupportedException e) {

        }
    }
}
