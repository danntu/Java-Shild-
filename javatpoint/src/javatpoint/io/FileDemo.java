package javatpoint.io;

import java.io.File;
import java.io.IOException;

/**
 * Created by mdaniyar on 5/28/18.
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("javaFile123.txt");
        if (file.createNewFile()) {
            System.out.println("New File is created");
        } else {
            System.out.println("File already exists");
        }
    }
}
