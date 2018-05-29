package javatpoint.io;

import java.util.Scanner;

/**
 * Created by mdaniyar on 5/29/18.
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your rollno");
        int rollno = sc.nextInt();
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Enter you fee");
        double fee = sc.nextDouble();
        System.out.println("Rollno: " + rollno + " name " + name + " fee: " + fee);
        sc.close();
    }
}
