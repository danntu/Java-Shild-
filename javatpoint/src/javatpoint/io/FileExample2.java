package javatpoint.io;

import java.io.File;

/**
 * Created by mdaniyar on 5/29/18.
 */
public class FileExample2 {
    public static void main(String[] args) {
        File dir = new File("/home/mdaniyar");
        File files[] = dir.listFiles();
        for (File file : files) {
            System.out.println(file.getName() + "Can Write : " + file.canWrite() + "" +
                    "Is Hidden: " + file.isHidden() + " Length: " + file.length() + "bytes");
        }
    }
}
