package javatpoint.polymorphism;

public class OverloadingCalculation3 {
    void sum(int a, long b) {
        System.out.println("a method invoked");
    }

    void sum(long a, int b) {
        System.out.println("b method invoked");
    }

    public static void main(String[] args) {
        OverloadingCalculation3 calculation3 = new OverloadingCalculation3();
        calculation3.sum(20, 20L);
        calculation3.sum(20L, 30);
    }
}
