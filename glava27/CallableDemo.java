package glava27;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Future<Integer> f1;
        Future<Double> f2;
        Future<Integer> f3;

        f1=service.submit(new Sum(10));
        f2=service.submit(new Hypot(3,4));
        f3=service.submit(new Factorial(5));
        try{
            System.out.println("Sum from 1 till 10 is "+f1.get());
            System.out.println("3 and 4 hypotenuze is "+f2.get());
            System.out.println("5 factorial is "+f3.get());
        }catch (InterruptedException e){
            System.out.println(e);
        }catch (ExecutionException e){
            System.out.println(e);
        }
    }
}
class Sum implements Callable<Integer>{
    int stop;

    public Sum(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int sum=0;
        for (int i = 0; i <=stop; i++) {
            sum+=i;
        }
        return sum;
    }
}

class Hypot implements Callable<Double>{
    double side1,side2;

    public Hypot(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override

    public Double call() throws Exception {
        return Math.sqrt((side1*side1)+(side2*side2));
    }
}
class Factorial implements Callable<Integer>{
    int stop;

    public Factorial(int stop) {
        this.stop = stop;
    }

    @Override
    public Integer call() throws Exception {
        int fact=1;
        for(int i=2;i<=stop;i++){
            fact*=i;
        }
        return fact;
    }
}