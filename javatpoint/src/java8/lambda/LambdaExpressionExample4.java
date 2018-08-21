package java8.lambda;

@FunctionalInterface
interface Sayable2 {
    String say(String name);
}

public class LambdaExpressionExample4 {
    public static void main(String[] args) {
        Sayable2 surname = (String name) -> {
            return "Hello " + name;
        };
        System.out.println(surname.say("Myrzakanov"));

//        Sayable2 name = (name) -> {
//            return "Hello " + name;
//        };
//        System.out.println(name.say("Daniyar"));

        Sayable2 lastname = name -> ("Hello " + name);
        System.out.println(lastname.say("Usenovich"));
    }
}
