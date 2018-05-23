package java8;

public class LambdaExample1 {
    interface Lambda1 {
        void hello();
    }

    interface Lambda2 {
        int add(int x, int y);
    }

    interface Lambda3 {
        int add2(int x);

        static int add22(int x) {
            return x;
        }
    }

    interface Lambda4 {
        String text(String a);
    }

    public static void main(String[] args) {
        Lambda1 lambda1 = () -> {
            System.out.println("Hello");
        };
        lambda1.hello();

        Lambda2 lambda2 = (x, y) -> {
            return x + y;
        };
        System.out.println("lambda2.add(3,5) " + lambda2.add(3, 5));

        Lambda3 lambda3 = x -> {
            return x + 10;
        };

        System.out.println("Lambda3.add22(5) " + Lambda3.add22(5));
        System.out.println("lambda3.add2(3) " + lambda3.add2(3));

        Lambda4 lambda4 = s -> {
            return s.toUpperCase();
        };
        System.out.println(lambda4.text("text"));
    }

}
