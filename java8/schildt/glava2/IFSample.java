package schildt.glava2;

public class IFSample {
    public static void main(String[] args) {
        int x,y;
        x = 10;
        y = 20;

        if (x<y) System.out.println("x меньше  y");

        x*=2;
        if (x==y) System.out.println("x теперь равно y");

        x*=2;
        if (x>y) System.out.println("x теперь больше y ");


        if (x==y) System.out.println("Вы не увидите этого");
    }
}
