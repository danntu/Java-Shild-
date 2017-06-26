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
public class DirListOnly {
    public static void main(String args[]){
        String dirname ="/java";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("exe");
        String s[]=f1.list(only);
        for (int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
}
