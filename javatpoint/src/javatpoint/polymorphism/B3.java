package javatpoint.polymorphism;

class A3 {
    public A3() {
        System.out.println("parent class constructor invoked");
    }
}

public class B3 extends A3 {
    public B3() {
        super();
        System.out.println("child class constructor invoked");
    }

    public B3(int a) {
        super();
        System.out.println("child class constructor invoked " + a);
    }

    {
        System.out.println("instance initializer block is invoked");
    }

    public static void main(String[] args) {
        B3 b3 = new B3();
        B3 b31 = new B3(10);
    }
}
