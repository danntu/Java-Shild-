package javatpoint.polymorphism;

class A2 {
    public A2() {
        System.out.println("parent class constructor invoked");
    }
}

public class B2 extends A2 {
    public B2() {
        super();
        System.out.println("child class constructor invoked");
    }

    {
        System.out.println("inst initializer block is invoked");
    }

    public static void main(String[] args) {
        B2 b2 = new B2();
    }
}
