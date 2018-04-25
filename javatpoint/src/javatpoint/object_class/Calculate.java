package javatpoint.object_class;

public class Calculate {
    static int cube(int x) {
        return x * x * x;
    }

    public static void main(String[] args) {
        System.out.println(Calculate.cube(5));
    }
}
