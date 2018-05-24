package inner;

public class localInner1 {
    private int data = 30;

    void display() {
        int data = 50;
        class Local {
            void msg() {
                System.out.println("Data is " + data);
            }
        }
        Local local = new Local();
        local.msg();
    }

    public static void main(String[] args) {
        localInner1 obj = new localInner1();
        obj.display();
    }
}
