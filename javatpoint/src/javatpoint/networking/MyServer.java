package javatpoint.networking;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by mdaniyar on 6/4/18.
 */
public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6666);
            Socket socket = serverSocket.accept();
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String str = (String) dis.readUTF();
            System.out.println("message = " + str);
            serverSocket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
