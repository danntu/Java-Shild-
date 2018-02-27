package method;

public class MyClass {
    int x;

    public MyClass() {
        x = 10;
    }

    public MyClass(int i){
        x = i;
    }

    public static void main(String[] args) {
        MyClass t1 = new MyClass(20);
        MyClass t2 = new MyClass();
        System.out.println(t1.x+" "+t2.x);
    }
}
