package javatpoint.networking;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by mdaniyar on 6/4/18.
 */
public class MyServer2 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(3333);
        Socket socket = serverSocket.accept();
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String strClient = "", strServer = "";
        while (!strClient.equals("stop")) {
            strClient = dataInputStream.readUTF();
            System.out.println("Client says: " + strClient);
            strServer = bufferedReader.readLine();
            dataOutputStream.writeUTF(strServer);
            dataOutputStream.flush();
        }
        dataInputStream.close();
        socket.close();
        serverSocket.close();
    }
}
