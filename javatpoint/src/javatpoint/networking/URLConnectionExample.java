package javatpoint.networking;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by mdaniyar on 6/4/18.
 */
public class URLConnectionExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            int i;
            while ((i = inputStream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
