package javatpoint.inter;

interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class A7 implements Printable, Showable {
    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void show() {
        System.out.println("Danik");
    }

    public static void main(String[] args) {
        A7 a7 = new A7();
        a7.print();
        a7.show();
    }
}
