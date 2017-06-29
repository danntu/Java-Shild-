import java.net.*;
import java.net.UnknownHostException;

/**
 * Created by DMyrzaka on 29.06.2017.
 */
public class InetAddressTest {
    public static void main(String[] args) throws UnknownHostException{
        System.out.println(InetAddress.getLocalHost());
        System.out.println(InetAddress.getByName("www.google.kz"));
        System.out.println(InetAddress.getLoopbackAddress());

        System.out.println();
        InetAddress SW[] = InetAddress.getAllByName("www.google.kz");
        for (int i = 0; i < SW.length; i++) {
            System.out.println(SW[i]);
        }
    }
}
