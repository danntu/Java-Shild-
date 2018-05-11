package javatpoint.str;

import java.util.StringTokenizer;

public class Simple {
    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer("My name is Daniyar");
        while (tokenizer.hasMoreElements()) {
            System.out.println(tokenizer.nextToken());
        }
    }
}

class Test {
    public static void main(String[] args) {
        StringTokenizer tokenizer = new StringTokenizer("My,name,is,Danik");
        while (tokenizer.hasMoreElements()) {
            System.out.print("Next token " + tokenizer.nextToken(",") + " ");
        }
    }
}