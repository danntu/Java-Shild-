package javatpoint.array;


public class TestArrayCopyDemo {
    public static void main(String[] args) {
        char copyFrom[] = {'D', 'A', 'N', 'I', 'K'};
        char copyTo[] = new char[5];
        System.arraycopy(copyFrom, 0, copyTo, 0, 5);
        System.out.println(new String(copyTo));
    }
}
