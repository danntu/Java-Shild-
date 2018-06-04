package javatpoint.networking;

import javatpoint.io.DataOutputStreamExample;

import java.io.DataOutputStream;
import java.net.Socket;

/**
 * Created by mdaniyar on 6/4/18.
 */
public class MyClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 6666);
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            dataOutputStream.writeUTF("Hello Server");
            dataOutputStream.flush();
            dataOutputStream.close();
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
