import java.io.IOException;
import java.nio.file.*;

/**
 * Created by DMyrzaka on 01.07.2017.
 */
public class NIOCopy {
    public static void main(String[] args) {
        if(args.length !=2){
            System.out.println("Usage: Copy from to");
            return;
        }
        try{
            Path source = Paths.get(args[0]);
            Path target = Paths.get(args[1]);
            Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING);
        } catch(InvalidPathException e){
            System.out.println("Path Error "+e);
        } catch(IOException e){
            System.out.println("I/O Error");
        }
    }
}
