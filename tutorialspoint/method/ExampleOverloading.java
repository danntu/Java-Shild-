package method;

public class ExampleOverloading {
    public static void main(String[] args) {
        int a  =11;
        int b = 6;
        double c =7.3;
        double d = 9.4;
        System.out.println("Minimum value "+min(a,b));
        System.out.println("Minimum value "+min(c,d));
    }

    public static int min(int a, int b){
        if (a<b)
            return a;
        else
            return b;
    }
    public static double min(double a, double b){
        if (a<b)
            return a;
        else
            return b;
    }
}
