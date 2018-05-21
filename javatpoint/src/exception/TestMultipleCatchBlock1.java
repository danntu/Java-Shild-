package exception;

public class TestMultipleCatchBlock1 {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        }
// catch (Exception e){
//            System.out.println("common task completed");
//        } catch (ArithmeticException e){
//            System.out.println("task1 is completed");
//        } catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("task2 is completed");
//        }
        finally {
            System.out.println("rest of the code");
        }
    }
}
