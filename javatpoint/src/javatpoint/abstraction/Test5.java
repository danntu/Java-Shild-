package javatpoint.abstraction;

interface A {
    void a();

    void b();

    void c();

    void d();
}

abstract class B implements A {
    @Override
    public void c() {
        System.out.println("I am C");
    }
}

class M extends B {
    @Override
    public void a() {
        System.out.println("I am A");
    }

    @Override
    public void b() {
        System.out.println("I am B");
    }

    @Override
    public void d() {
        System.out.println("I am D");
    }
}

public class Test5 {
    public static void main(String[] args) {
        A a = new M();
        a.a();
        a.b();
        a.c();
        a.d();
    }
}
