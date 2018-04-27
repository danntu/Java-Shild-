package javatpoint.inter;

interface printable {
    void print();
}

public class A6 implements printable {
    @Override
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A6 a6 = new A6();
        a6.print();
    }
}
