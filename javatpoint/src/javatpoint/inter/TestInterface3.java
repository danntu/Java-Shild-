package javatpoint.inter;

interface Printable1 {
    void print();
}

interface Showable1 {
    void print();
}

public class TestInterface3 implements Printable1, Showable1 {
    @Override
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        TestInterface3 interface3 = new TestInterface3();
        interface3.print();
    }
}
