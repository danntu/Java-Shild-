package thistest;

public class A {
    int i = 6;

    public void show() {
        System.out.println("Это метод show");
    }

    public A() {
        this(4);
        this.show();
        System.out.println("Пустой конструктор");
    }

    public A(int i) {

        this.i = i;
        System.out.println("Конструктор с параметром");
    }

    public static void main(String[] args) {
        A object = new A();
    }


}
