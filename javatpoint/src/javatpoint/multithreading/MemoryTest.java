package javatpoint.multithreading;

/**
 * Created by mdaniyar on 5/28/18.
 */
public class MemoryTest {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Total memory " + runtime.totalMemory());
        System.out.println("Free memory " + runtime.freeMemory());
        for (int i = 0; i < 10000; i++) {
            new MemoryTest();
        }
        System.out.println("After creating 10000 instance, Free memory: " + runtime.freeMemory());
        System.gc();
        System.out.println("After gc(), Free memory: " + runtime.freeMemory());
    }
}
