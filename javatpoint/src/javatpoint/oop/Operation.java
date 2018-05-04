package javatpoint.oop;

public class Operation {
    int data = 50;

    void change(int data) {
        data = data + 100;
    }

    public static void main(String[] args) {
        Operation operation = new Operation();
        System.out.println("before change " + operation.data);
        operation.change(500);
        System.out.println("after change " + operation.data);
    }
}
