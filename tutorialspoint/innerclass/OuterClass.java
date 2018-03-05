package innerclass;

public class OuterClass {
    int num = 23;

    void my_method() {


        class MethodInner_Demo {
            public void print() {
                System.out.println("This is method inner class " + num);
            }
        }
        MethodInner_Demo innerDemo = new MethodInner_Demo();
        innerDemo.print();
    }

    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        outerClass.my_method();
    }
}
