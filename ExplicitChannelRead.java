/**
 * Created by DMyrzaka on 30.06.2017.
 */
import java.io.*;
import java.nio.*;
import java.nio.channels.*;
import java.nio.file.*;
public class ExplicitChannelRead {
    public static void main(String[] args) {
        int count;
        Path filepath = null;
        try{
            filepath = Paths.get("test.txt");
        }catch (InvalidPathException e){
            System.out.println("Path Error "+e);
            return;
        }

        try(SeekableByteChannel fChan =Files.newByteChannel(filepath)){
            ByteBuffer mBuf = ByteBuffer.allocate(128);
            do{
                count=fChan.read(mBuf);
                if(count !=-1){
                    mBuf.rewind();
                    for (int i=0;i<count;i++)
                        System.out.print((char)mBuf.get());
                }
            } while(count !=-1);
            System.out.println();
        } catch (IOException e){
            System.out.println("I/O Error "+e);
        }
    }
}
