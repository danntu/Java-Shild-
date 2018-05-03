package javatpoint.array;

public class TestArray2 {
    static void min(int a[]) {
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        System.out.println(min);
    }

    public static void main(String[] args) {
        int a[] = {-7, 90, -234, 5};
        min(a);
    }
}
