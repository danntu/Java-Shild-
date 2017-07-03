import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;

/**
 * Created by DMyrzaka on 03.07.2017.
 */
public class NIOStreamWrite {
    public static void main(String[] args) {
        try(OutputStream fout = new BufferedOutputStream(Files.newOutputStream(Paths.get("test.txt")))){
            for(int i=0;i<26;i++)
                fout.write((byte)('C'+i));
        } catch (InvalidPathException e){
            System.out.println("Path Error "+e);
        } catch (IOException e){
            System.out.println("I/O Error: "+e);
        }
    }
}
