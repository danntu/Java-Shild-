import java.io.IOException;
import java.io.InvalidClassException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by DMyrzaka on 03.07.2017.
 */
public class DirList {
    public static void main(String[] args) {
        String dirname="D:\\glava20";

        try(DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(dirname))){
            System.out.println("Directory of "+dirname);
            for(Path entry : directoryStream){
                BasicFileAttributes attributes=Files.readAttributes(entry,BasicFileAttributes.class);
                if (attributes.isDirectory())
                    System.out.print("<DIR> ");
                else
                    System.out.print("File ");
                System.out.println(entry.getName(1));
            }
        } catch (InvalidClassException e){
            System.out.println("Path Error "+e);
        } catch(NotDirectoryException e){
            System.out.println(dirname+ " is not a directory");
        }
        catch (IOException e){
            System.out.println("I/O Error "+e);
        }
    }
}
