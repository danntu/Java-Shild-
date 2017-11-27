package m_1.by.bsu.threads;

public class PriorityRunner {
    public static void main(String[] args) {
        PriorThread min =  new PriorThread("min");
        PriorThread max= new PriorThread("max");
        PriorThread normal = new PriorThread("normal");

        min.setPriority(Thread.MIN_PRIORITY);
        max.setPriority(Thread.MAX_PRIORITY);
        normal.setPriority(Thread.NORM_PRIORITY);
        min.start();
        max.start();
        normal.start();
    }
}
