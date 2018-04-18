package javatpoint.control.statement;

public class ForExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}

class ForEachExample {
    public static void main(String[] args) {
        int arr[] = {12, 23, 44, 56, 78};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}

class LabeledForExample {
    public static void main(String[] args) {
        aa:
        for (int i = 1; i <= 3; i++) {
            bb:
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break aa;
                }
                System.out.println(i + " " + j);
            }
        }
    }
}

//infinitive loop
class ForExample2 {
    public static void main(String[] args) {
        for (; ; ) {
            System.out.println("infinitive loop");
        }
    }
}