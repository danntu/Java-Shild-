package inner;

interface Showable {
    void show();

    interface Message {
        void msg();
    }
}

class TestNestedInterface1 implements Showable.Message, Showable {
    @Override
    public void msg() {
        System.out.println("Hello nested interface");
    }

    @Override
    public void show() {
        System.out.println("This outer interface");
    }

    public static void main(String[] args) {
        Showable.Message message = new TestNestedInterface1();
        Showable show = new TestNestedInterface1();
        message.msg();
        show.show();

    }
}
