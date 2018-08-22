package java8.lambda;

@FunctionalInterface
interface Addable2 {
    int add(int a, int b);
}

public class LambdaExpressionExample6 {
    public static void main(String[] args) {
        // Lambda expression without return keyword.
        Addable2 addable1 = (a, b) -> (a + b);
        System.out.println(addable1.add(10, 20));

        // Lambda expression with return keyword.
        Addable2 addable2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(addable2.add(100, 200));
    }
}
