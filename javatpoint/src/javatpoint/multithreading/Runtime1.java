package javatpoint.multithreading;

import java.io.IOException;

/**
 * Created by mdaniyar on 5/28/18.
 */
public class Runtime1 {
    public static void main(String[] args) throws IOException {
        Runtime.getRuntime().exec("gedit");
    }
}
