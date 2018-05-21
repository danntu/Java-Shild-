package exception;

import java.io.IOException;

class M {
    void method() throws IOException {
        throw new IOException();
    }
}

public class Testthrows2 {
    public static void main(String[] args) {
        M m = new M();
        try {
            m.method();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
        System.out.println("normal flow...");
    }
}
