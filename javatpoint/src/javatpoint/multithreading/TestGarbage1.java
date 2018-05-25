package javatpoint.multithreading;

/**
 * Created by mdaniyar on 5/25/18.
 */
public class TestGarbage1 {
    @Override
    protected void finalize() throws Throwable {
        System.out.println("object is garbage collected");
    }

    public static void main(String[] args) {
        TestGarbage1 s1 = new TestGarbage1();
        TestGarbage1 s2 = new TestGarbage1();
        s1 = null;
        s2 = null;
        System.gc();
    }
}
