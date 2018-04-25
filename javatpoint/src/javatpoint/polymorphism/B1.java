package javatpoint.polymorphism;

class A {
    A get() {
        return this;
    }
}

public class B1 extends A {
    B1 get() {
        return this;
    }

    void message() {
        System.out.println("welcome to covariant type");
    }

    public static void main(String[] args) {
        B1 b1 = new B1().get();
        b1.message();
    }
}
