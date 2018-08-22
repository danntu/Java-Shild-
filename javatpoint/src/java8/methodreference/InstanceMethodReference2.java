package java8.methodreference;

public class InstanceMethodReference2 {
    public void printMessage() {
        System.out.println("Hello, this is instance method");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new InstanceMethodReference2()::printMessage);
        thread.start();
    }
}
