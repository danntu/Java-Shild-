package innerclass;

class Outer_demo {
    private int num = 175;

    public static void show() {
        System.out.println("Static method");
    }

    public class Inner_demo {
        public void print() {
            System.out.println("This is an inner classs");
        }

        public int getNum() {
            System.out.println("This is the getnum method of the inner class");
            return num;
        }
    }

    void display_Inner() {
        Inner_demo inner = new Inner_demo();
        inner.print();

    }
}

public class My_class {
    public static void main(String[] args) {
        Outer_demo outer = new Outer_demo();
        outer.display_Inner();
        Outer_demo.show();

        Outer_demo outer_demo = new Outer_demo();
        Outer_demo.Inner_demo inner_demo = outer_demo.new Inner_demo();
        System.out.println(inner_demo.getNum());
    }
}
