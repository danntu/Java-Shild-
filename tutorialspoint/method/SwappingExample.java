package method;

public class SwappingExample {
    public static int a = 30;
    public static int b = 45;

    public static void main(String[] args) {

        System.out.println("Before swapping, a = " + a + " and b = " + b);
        swapFunction(a, b);
        System.out.println("\n**Now, Before and After swapping values will be same here**:");
        System.out.println("After swapping, a = " + a + " and b is " + b);
    }

    public static void swapFunction(int a, int b) {
        System.out.println("Before swapping(Inside), a = " + a + " b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping(Inside), a = " + a + " b = " + b);
    }
}
