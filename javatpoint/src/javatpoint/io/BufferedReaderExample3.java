package javatpoint.io;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample3 {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);
        String name = "";
        while (!name.equals("stop")) {
            System.out.println("Enter data: ");
            name = br.readLine();
            System.out.println("data is: " + name);
        }
        br.close();
        inputStreamReader.close();
    }
}
