package java8.defaultmethod;

abstract class AbstractClass {
    public AbstractClass() {
        System.out.println("You can create constructor in abstract class");
    }

    abstract int add(int a, int b);

    int sub(int a, int b) {
        return a - b;
    }

    static int multiply(int a, int b) {
        return a * b;
    }
}

public class AbstractTest extends AbstractClass {
    @Override
    int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        AbstractTest abstractTest = new AbstractTest();
        int result1 = abstractTest.add(20, 10);
        int result2 = abstractTest.sub(20, 10);
        int result3 = AbstractClass.multiply(20, 10);
        System.out.println("Addition: " + result1);
        System.out.println("Substraction: " + result2);
        System.out.println("Multiplication: " + result3);
    }
}
