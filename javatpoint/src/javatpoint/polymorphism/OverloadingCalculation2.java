package javatpoint.polymorphism;

public class OverloadingCalculation2 {
    void sum(int a, int b) {
        System.out.println("int arg method invoked");
    }

    void sum(long a, long b) {
        System.out.println("long arg method invoked");
    }

    public static void main(String[] args) {
        OverloadingCalculation2 calculation2 = new OverloadingCalculation2();
        calculation2.sum(20, 20);
        calculation2.sum(20L, 20L);
    }
}
