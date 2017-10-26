package m_1.by.bsu.console;

import java.util.Scanner;

public class RunScanner {
    public static void main(String[] args) {
        System.out.println("Введите Ваше имя и нажмите <Enter>:");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Привет, "+name);
        sc.close();
    }
}
