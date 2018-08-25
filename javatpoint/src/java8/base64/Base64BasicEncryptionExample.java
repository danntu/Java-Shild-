package java8.base64;

import java.util.Base64;

public class Base64BasicEncryptionExample {
    public static void main(String[] args) {
        Base64.Encoder encoder = Base64.getEncoder();
        byte byteArr[] = {1, 2};
        byte byteArr2[] = encoder.encode(byteArr);
        System.out.println("Encodeed byte array: " + byteArr2);
        byte byteArr3[] = new byte[5];
        int x = encoder.encode(byteArr, byteArr3);
        System.out.println("Encoded byte array written to another array:" + byteArr3);
        System.out.println("Number of bytes written: " + x);
        //Encoding string
        String str = encoder.encodeToString("JavaTpoint".getBytes());
        System.out.println("Encoding string: " + str);
        //Getting decoder
        Base64.Decoder decoder = Base64.getDecoder();
        //Decoding string
        String dStr = new String(decoder.decode(str));
        System.out.println("Decoding string: " + dStr);
    }
}
