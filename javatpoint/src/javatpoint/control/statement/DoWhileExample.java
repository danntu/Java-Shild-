package javatpoint.control.statement;

public class DoWhileExample {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }
}

class DoWhileExample2 {
    public static void main(String[] args) {
        do {
            System.out.println("infinitive do while loop");
        } while (true);
    }
}