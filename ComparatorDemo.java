/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava17;

/**
 *
 * @author DMyrzaka
 */
import java.util.Comparator;
import java.util.TreeSet;
class MyComp implements Comparator<String>{
    public int compare(String a,String b){
        String str1,str2;
        str1=a; str2=b;
        return str2.compareTo(str1);
    }
}
public class ComparatorDemo {
    public static void main(String[] args){
        TreeSet<String> ts = new TreeSet<String>(new MyComp());
        ts.add("C"); ts.add("A"); ts.add("B");ts.add("E"); ts.add("F"); ts.add("D");
        
        for(String element : ts)
            System.out.print(element+" ");
    }
}
