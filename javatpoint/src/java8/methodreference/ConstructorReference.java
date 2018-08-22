package java8.methodreference;

@FunctionalInterface
interface Messageable {
    Message getMessage(String nessage);
}

class Message {
    public Message(String message) {
        System.out.println(message);
    }
}

public class ConstructorReference {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }
}
