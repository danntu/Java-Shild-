package javatpoint.networking;

import java.io.*;
import java.net.Socket;

/**
 * Created by mdaniyar on 6/4/18.
 */
public class MyClient2 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 3333);
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String strClient = "", strServer = "";
        while (!strClient.equals("stop")) {
            strClient = bufferedReader.readLine();
            dataOutputStream.writeUTF(strClient);
            dataOutputStream.flush();
            strServer = dataInputStream.readUTF();
            System.out.println("Server says: " + strServer);
        }
        dataOutputStream.close();
        socket.close();
    }
}
