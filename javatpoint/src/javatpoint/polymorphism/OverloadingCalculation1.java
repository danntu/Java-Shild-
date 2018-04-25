package javatpoint.polymorphism;

public class OverloadingCalculation1 {
    void sum(int a, long b) {
        System.out.println(a + b);
    }

    void sum(int a, int b, int c) {
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        OverloadingCalculation1 calculation1 = new OverloadingCalculation1();
        calculation1.sum(20, 20);
        calculation1.sum(20, 20, 20);
    }
}
