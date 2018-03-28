package javatpoint.tutorial;

public class OperatorExample10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        a += 4;//a=a+4 (a=10+4)
        b -= 4;//b=b-4 (b=20-4)
        System.out.println(a);
        System.out.println(b);
        a = 10;
        a += 3;//10+3
        System.out.println(a);
        a -= 4;//13-4
        System.out.println(a);
        a *= 2;//9*2
        System.out.println(a);
        a /= 2;//18/2
        System.out.println(a);

        short a1 = 10;
        short b1 = 10;
        a1 = (short) (a1 + b1);
        System.out.println(a1);
    }
}
