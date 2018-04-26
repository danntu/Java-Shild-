package javatpoint.polymorphism;

public class Bike14 {
    static final int n = 5;

    int cude(final int n) {
        return n * n * n;
    }

    void show() {
        System.out.println(cude(n));
    }


    public static void main(String[] args) {
        Bike14 bike14 = new Bike14();
        bike14.show();
    }
}
