package javatpoint.polymorphism;

class Bike10 {
    final void run() {
        System.out.println("running");
    }
}

public class Honda extends Bike10 {
    //method cannot override
//    final void run(){
//        System.out.println("running safely with 100kmph");
//    }

    public static void main(String[] args) {
        Honda honda = new Honda();
        honda.run();
    }
}

