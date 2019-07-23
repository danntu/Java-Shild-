package schildt.glava2;

public class BlockTest {
    public static void main(String[] args) {
        int x,y;

        y = 20;

        for (x = 0;  x < 10 ; x++) {
            System.out.println("x value: "+x);
            System.out.println("y value: "+y);
            y-=2;
        }
    }
}
