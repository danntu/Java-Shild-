package java8.lambda;

@FunctionalInterface
interface Addable {
    int add(int a, int b);
}

public class LambdaExpressionExample5 {
    public static void main(String[] args) {
        // Multiple parameters in lambda expression
        Addable addable1 = (a, b) -> (a + b);
        System.out.println(addable1.add(10, 10));

        // Multiple parameters with data type in lambda expression
        Addable addable2 = (int a, int b) -> (a + b);
        System.out.println(addable2.add(100, 100));
    }
}
