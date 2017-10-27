package m_1.by.bsu.template;

public class Runner {
    public static void main(String[] args) {
        Message<Integer> ob1 = new Message<>();
        ob1.setValue(1);
        int v1=ob1.getValue();
        System.out.println(v1);

        Message<String> ob2 = new Message<>("Java");
        ob2.setValue("Java 7");
        String v2= ob2.getValue();
        System.out.println(v2);

        Message ob3 = ob1;
        System.out.println(ob3.getValue());
        ob3.setValue(new Byte((byte)1));
        ob3.setValue("Java SE 7");
        System.out.println(ob3);

        ob3.setValue(71);
        System.out.println(ob3);
        ob3.setValue(null);
    }
}
