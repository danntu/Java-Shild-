package javatpoint.inheritance;

class Operation {
    int square(int n) {
        return n * n;
    }
}

public class Circle {
    double pi = Math.PI;

    double area(int radius) {
        Operation operation = new Operation();
        return pi * operation.square(radius);
    }

    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle.area(5));
    }
}
