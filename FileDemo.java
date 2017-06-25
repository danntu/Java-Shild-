/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava18;

/**
 *
 * @author DMyrzaka
 */
import java.io.File;
public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }
  public static void main(String args[]){
      File f1 = new File("/java/COPYRIGHT");
      p("File name: "+f1.getName());
      p("File path: "+f1.getPath());
      p("Absolute path: "+f1.getAbsolutePath());
      p("Parent catalog: "+f1.getParent());
      p(f1.exists() ? " exist " : " don't exist");
      p(f1.canWrite() ? " available to write" : " don't avaiable write");
      p(f1.canRead() ? " avaiable to read" : " don't avaiable read");
      p(f1.isDirectory() ? " is directory" : "isn't directory");
      p(f1.isFile() ? " is file" : " isn't file");
      p(f1.isAbsolute() ? "is absolute" : "isn't absolute");
      p("Time modification "+f1.lastModified());
      p("Size "+f1.length()+" byte");
      
  }  
}
