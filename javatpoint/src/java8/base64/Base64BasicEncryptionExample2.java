package java8.base64;

import java.util.Base64;

public class Base64BasicEncryptionExample2 {
    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getEncoder();
        String eStr = encoder.encodeToString("http://google.kz".getBytes());
        System.out.println("Encoding URL: " + eStr);

        Base64.Decoder decoder = Base64.getDecoder();

        String dStr = new String(decoder.decode(eStr));
        System.out.println("Decode URL: " + dStr);
    }
}
