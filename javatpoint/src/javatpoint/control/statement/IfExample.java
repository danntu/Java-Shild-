package javatpoint.control.statement;

class IfExample {
    public static void main(String[] args) {
        int age = 20;
        if (age > 18) {
            System.out.print("Age is greater than 18");
        }
    }
}

class IfElseExample1 {
    public static void main(String[] args) {
        int number = 13;
        if (number % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }
}

class IfElseIfExample2 {
    public static void main(String[] args) {
        int marks = 65;

        if (marks < 50) {
            System.out.println("fail");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("D grade");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("C grade");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("B grade");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("A grade");
        } else if (marks >= 90 && marks < 100) {
            System.out.println("A+ grade");
        } else {
            System.out.println("Invalid!");
        }
    }
}