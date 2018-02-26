public class NumberExamples {
    public static void main(String[] args) {
        Integer x = 5;
        System.out.println(x.toString());
        System.out.println(Integer.toString(12));
        x = Integer.parseInt("9");
        double c = Double.parseDouble("5");
        int b = Integer.parseInt("444",16);
        System.out.println(x);
        System.out.println(c);
        System.out.println(b);

        x = -8;
        c = -100;
        float f = -90;
        System.out.println(Math.abs(x));
        System.out.println(Math.abs(c));
        System.out.println(Math.abs(f));
    }
}
