package javatpoint.io;

import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

public class FilePermissionExample {
    public static void main(String[] args) throws IOException {
        String srg = "/home/mdaniyar/io/java.txt";
        FilePermission file1 = new FilePermission("/home/mdaniyar/io/-", "read");
        PermissionCollection permissionCollection = file1.newPermissionCollection();
        permissionCollection.add(file1);
        FilePermission file2 = new FilePermission(srg, "write");
        permissionCollection.add(file2);
        if (permissionCollection.implies(new FilePermission(srg, "read,write"))) {
            System.out.println("Read, Write permission is granted for the path " + srg);
        } else {
            System.out.println("No Read, Write permission is granted for the path " + srg);
        }
    }
}
