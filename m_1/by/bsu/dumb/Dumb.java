package m_1.by.bsu.dumb;

public class Dumb extends Object{
    { thistest.id =6;}
    int id;

    public Dumb() {
        System.out.println("конструктор класса Dumb");
        id = thistest.getId();
        System.out.println(" id = "+id);
    }

    public int getId() {
        System.out.println("getId() класса Dumb");
        return id;
    }
}
