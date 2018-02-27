package method;

public class MinFunction {
    public static int min(int a, int b){
        if (a<b)
            return a;
        else
            return b;
    }

    public static int max(int a, int b){
        if (a>b)
            return a;
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println("min(2,5) = "+min(2,5));
        System.out.println("max(2,5) = "+max(2,5));
    }
}
