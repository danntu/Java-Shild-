package io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFileReaderWriter {
    public static void main(String[] args) throws IOException{
        FileReader in = null;
        FileWriter out =null;
        try{
            in = new FileReader("input1.txt");
            out = new FileWriter("output1.txt");
            int c;
            while ((c = in.read()) !=-1){
                out.write(c);
            }
        } finally {
            if (in!=null){
                in.close();
            }
            if (out!=null){
                out.close();
            }
        }
    }
}
