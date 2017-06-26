/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava19;

/**
 *
 * @author DMyrzaka
 */
import java.io.*;
public class OnlyExt implements FilenameFilter {
    String ext;
    
    public OnlyExt(String ext){
        this.ext="."+ext;
    }
    
    public boolean accept(File dir, String name){
        return name.endsWith(ext);
    }

   
}
