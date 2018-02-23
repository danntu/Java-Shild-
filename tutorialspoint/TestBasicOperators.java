class Vehile {

}

public class TestBasicOperators extends Vehile {
    public static void main(String[] args) {
        int a, b;
        a = 10;
        String name = "Danik";
        b = (a == 2) ? 20 : 30;
        System.out.println("Value of b is : " + b);

        b = (a == 10) ? 20 : 30;
        System.out.println("Value of b is : " + b);

        boolean result = name instanceof String;
        System.out.println("Variable name is String " + result);

        Vehile vehile = new TestBasicOperators();
        boolean resultObject = vehile instanceof TestBasicOperators;
        System.out.println("Variable vehile is type Vehile " + result);
    }
}
