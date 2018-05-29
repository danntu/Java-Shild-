package javatpoint.io;

import java.io.File;

/**
 * Created by mdaniyar on 5/29/18.
 */
public class FileDemo2 {
    public static void main(String[] args) {
        String path = "";
        boolean bool = false;
        try {
            File file = new File("testFile1.txt");
            file.createNewFile();
            System.out.println(file);
            File file2 = file.getCanonicalFile();
            System.out.println(file2);
            bool = file.exists();
            path = file2.getAbsolutePath();
            System.out.println(bool);
            if (bool) {
                System.out.println(path + " Exists ? " + bool);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
