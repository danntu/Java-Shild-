package javatpoint.multithreading;

public class TestJoinMethod3 extends Thread {
    @Override
    public void run() {
        System.out.println("running");
    }

    public static void main(String[] args) {
        TestJoinMethod3 t1 = new TestJoinMethod3();
        TestJoinMethod3 t2 = new TestJoinMethod3();
        System.out.println("Name of t1: " + t1.getName());
        System.out.println("Name of t2: " + t2.getName());
        System.out.println("Id of t1: " + t1.getId());
        System.out.println("Id of t2: " + t2.getId());

        t1.start();
        t2.start();

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        System.out.println("After changing name of t1: " + t1.getName());
        System.out.println("After changing name of t2: " + t2.getName());
    }
}
