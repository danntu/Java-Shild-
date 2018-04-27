package javatpoint.inter;

interface Printable4 {
    void print();
}

interface Showable4 extends Printable4 {
    void show();
}

public class TestInterface4 implements Showable4 {
    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Danik");
    }

    public static void main(String[] args) {
        TestInterface4 interface4 = new TestInterface4();
        interface4.print();
        interface4.show();
    }
}
