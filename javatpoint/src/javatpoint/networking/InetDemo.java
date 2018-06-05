package javatpoint.networking;

import java.net.InetAddress;

/**
 * Created by mdaniyar on 6/5/18.
 */
public class InetDemo {
    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("google.kz");
            System.out.println("Host name: " + ip.getHostName());
            System.out.println("Ip address: " + ip.getHostAddress());
            System.out.println("Canonical name" + ip.getCanonicalHostName());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
