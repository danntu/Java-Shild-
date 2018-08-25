package java8.base64;

import java.util.Base64;

public class Base64BasicEncryptionExample3 {
    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getMimeEncoder();
        String message = "Myrzakanov Daniyar Usenovich";
        String eStr = encoder.encodeToString(message.getBytes());
        System.out.println("Encoding MIME message: " + eStr);

        Base64.Decoder decoder = Base64.getMimeDecoder();
        String dStr = new String(decoder.decode(eStr));
        System.out.println("Decode message: " + dStr);
    }
}
