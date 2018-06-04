package javatpoint.networking;

import java.net.URL;

/**
 * Created by mdaniyar on 6/4/18.
 */
public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.javatpoint.com/java-tutorial");
            System.out.println("Протокол " + url.getProtocol());
            System.out.println("Имя хоста " + url.getHost());
            System.out.println("Номер порта " + url.getPort());
            System.out.println("Имя файла" + url.getFile());
            System.out.println();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
