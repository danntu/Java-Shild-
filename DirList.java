/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava19;

/**
 *
 * @author DMyrzaka
 */
import java.io.File;

public class DirList {
    public static void main(String args[]){
        String dirname="/java";
        File f1 = new File(dirname);
        if (f1.isDirectory()){
            System.out.println("Catalog "+dirname);
            String s[]=f1.list();
            for (int i=0;i<s.length;i++){
                File f = new File(dirname+"/"+s[i]);
                if (f.isDirectory()){
                    System.out.println(s[i]+" is catalog");
                }
                else {
                    System.out.println(s[i]+" is file");
                }
            }
        }
            else{
                 
            System.out.println(dirname+" isn't directory");
        }
    }
}
