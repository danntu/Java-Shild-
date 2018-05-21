package exception;

import java.io.IOException;

public class Testthrows4 {
    public static void main(String[] args) throws IOException {
        M m = new M();
        m.method();
        System.out.println("normal flow");
    }
}
