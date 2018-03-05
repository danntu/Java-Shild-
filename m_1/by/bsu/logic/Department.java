package m_1.by.bsu.logic;

public class Department {
    {
        System.out.println("logic(1) id ="+thistest.id);
    }
    static {
        System.out.println("static logic");
    }
    private int id =7;

    public Department(int id) {
        thistest.id=id;
        System.out.println("конструктор id="+id);
    }

    public int getId() {
        return id;
    }
    {
        System.out.println("logic (2) id="+id);
    }
}
