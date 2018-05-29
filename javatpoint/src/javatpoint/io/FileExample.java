package javatpoint.io;

import java.io.File;

/**
 * Created by mdaniyar on 5/29/18.
 */
public class FileExample {
    public static void main(String[] args) {
        File file = new File("/home/mdaniyar");
        String filenames[] = file.list();
        for (String filename : filenames) {
            System.out.println(filename);
        }
    }
}
