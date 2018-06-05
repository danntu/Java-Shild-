package javatpoint.networking;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by mdaniyar on 6/4/18.
 */
public class HttpURLConnectionDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://www.javatpoint.com/java-tutorial");
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            for (int i = 1; i <= 9; i++) {
                System.out.println(httpURLConnection.getHeaderFieldKey(i) + " = " + httpURLConnection.getHeaderField(i));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
