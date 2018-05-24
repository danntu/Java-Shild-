package exception;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class TestCustomException1 {
    static void validate(int age) throws InvalidAgeException {
        if (age < 18)
            throw new InvalidAgeException("not valid");
        else
            System.out.println("welcome to vote");
    }

    public static void main(String[] args) {
        try {
            validate(13);
        } catch (Exception e) {
            System.out.println("Exception occured: " + e);
        }
        System.out.println("rest of the code");
    }
}
