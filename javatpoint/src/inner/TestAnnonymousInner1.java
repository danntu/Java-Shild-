package inner;

interface Eatable {
    void eat();
}

public class TestAnnonymousInner1 {
    public static void main(String[] args) {
        Eatable eatable = new Eatable() {
            @Override
            public void eat() {
                System.out.println("nice fruits");
            }
        };
        eatable.eat();
    }
}
