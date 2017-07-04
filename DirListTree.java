import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by DMyrzaka on 04.07.2017.
 */
class MyFileVisitor extends SimpleFileVisitor<Path> {
    public FileVisitResult visitFile(Path  path, BasicFileAttributes attributes) throws IOException{
        System.out.println(path);
        return FileVisitResult.CONTINUE;
    }
}
public class DirListTree {
    public static void main(String[] args) {
        String dirname="D:\\glava20";
        System.out.println("Directory tree starting with "+dirname+":\n");
        try{
            Files.walkFileTree(Paths.get(dirname), new MyFileVisitor());
        } catch (IOException e){
            System.out.println("I/O Error");
        }
    }
}
