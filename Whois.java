/**
 * Created by DMyrzaka on 29.06.2017.
 */
import java.net.*;
import java.io.*;
public class Whois {
    public static void main(String[] args) throws Exception {
        Socket  s = new Socket("whois.internic.net",43);
        InputStream in = s.getInputStream();
        OutputStream out = s.getOutputStream();

        String str=(args.length == 0 ? "kaznitu.kz" :  args[0])+"\n";
        byte buf[]= str.getBytes();
        out.write(buf);
        int c;
        while((c=in.read()) !=-1){
            System.out.print((char)c);
        }
        s.close();
    }
}
