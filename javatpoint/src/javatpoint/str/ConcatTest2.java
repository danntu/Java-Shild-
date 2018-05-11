package javatpoint.str;


public class ConcatTest2 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer("Java");
        for (int i = 0; i < 1000000; i++) {
            stringBuffer.append("Tpoint");
        }
        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + " ms");

        startTime = System.currentTimeMillis();
        StringBuilder stringBuilder = new StringBuilder("Java");
        for (int i = 0; i < 1000000; i++) {
            stringBuilder.append("Tpoint");
        }
        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + " ms");
    }
}
