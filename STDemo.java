/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava18;

import java.util.StringTokenizer;

/**
 *
 * @author DMyrzaka
 */
public class STDemo {
    static String in ="title=Java: The Complete Reference;"
            + "authot=Schildt;"
            + "publisher=McGrawe-Hill;"
            + "copyright=2011";
    public static void main(String args[]){
        StringTokenizer st = new StringTokenizer(in, "=;");
        while(st.hasMoreElements()){
            String key = st.nextToken();
            String value =st.nextToken();
            System.out.println(key+"\t"+value);
        }
    }
}
