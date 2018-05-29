package javatpoint.io;

import java.util.Scanner;

/**
 * Created by mdaniyar on 5/29/18.
 */
public class ScannerTest2 {
    public static void main(String[] args) {
        String input = "10 tea 20 coffee 30 tea buiscuits";
        Scanner sc = new Scanner(input).useDelimiter("\\s");
        System.out.println(sc.nextInt());
        System.out.println(sc.next());
        System.out.println(sc.nextInt());
        System.out.println(sc.next());
        System.out.println(sc.nextInt());
        System.out.println(sc.next());
        System.out.println(sc.next());
        sc.close();
    }
}
