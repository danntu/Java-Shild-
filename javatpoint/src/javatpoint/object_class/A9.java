package javatpoint.object_class;

class B9 {
    A9 obj;

    B9(A9 obj) {
        this.obj = obj;
    }

    void display() {
        System.out.println(obj.data);
    }
}

public class A9 {
    int data = 10;

    public A9() {
        B9 b = new B9(this);
        b.display();
    }

    public static void main(String[] args) {

    }
}
