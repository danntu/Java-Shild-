package java8.lambda;

@FunctionalInterface
interface Sayable {
    String say();
}

public class LambdaExpressionExample3 {
    public static void main(String[] args) {
        Sayable sayable = () -> {
            return "I have nothing to say.";
        };
        System.out.println(sayable.say());
    }
}
