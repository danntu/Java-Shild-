package javatpoint.polymorphism.inst;

interface Printable {

}

class A implements Printable {
    public void a() {
        System.out.println("a method");
    }
}

class B implements Printable {
    public void b() {
        System.out.println("b method");
    }
}

class Call {
    void invoke(Printable p) {
        if (p instanceof A) {
            A a = (A) p;
            a.a();
        }
        if (p instanceof B) {
            B b = (B) p;
            b.b();
        }
    }
}

public class Test4 {
    public static void main(String[] args) {
        Printable printableB = new B();
        Printable printableA = new A();
        Call call = new Call();
        call.invoke(printableB);
        call.invoke(printableA);

    }
}
