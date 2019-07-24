package schildt.glava3;

public class BoolTest {
    public static void main(String[] args) {
        boolean b;

        b = false;
        System.out.println("b equal "+b);
        b = true;
        System.out.println("b equal "+b);

        if (b){
            System.out.println("Этот код выполняется.");
        }
        b = false;
        if (b) System.out.println("Этот код не выполняется");

        System.out.println("10>9 equal "+(10>9));
    }
}
