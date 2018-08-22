package java8.lambda;

@FunctionalInterface
interface Sayable3 {
    String say(String name);
}

public class LambdaExpressionExample8 {
    public static void main(String[] args) {
        Sayable3 person = (message) -> {
            String str1 = "Myrzakanov ";
            String str2 = str1 + message;
            return str2;
        };
        System.out.println(person.say("Daniyar"));
    }
}
