package m_1.by.bsu.dumb;

public class Dumber extends Dumb {
    int id = 9;

    public Dumber() {
        System.out.println("конструктор класса Dumber");
        id = thistest.getId();
        System.out.println(" id = "+id);
    }

    @Override
    public int getId() {
        System.out.println("getId() класса Dumber");
        return id;
    }

    public static void main(String[] args) {
        Dumb objA = new Dumber();

    }
}
