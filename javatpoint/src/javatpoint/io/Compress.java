package javatpoint.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.DeflaterOutputStream;

/**
 * Created by mdaniyar on 5/30/18.
 */
public class Compress {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("testout.txt");
            FileOutputStream fout = new FileOutputStream("def.txt");
            DeflaterOutputStream out = new DeflaterOutputStream(fout);
            int i;
            while ((i = fin.read()) != -1) {
                out.write((byte) i);
                out.flush();
            }
            fin.close();
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("rest of the code");
    }
}
