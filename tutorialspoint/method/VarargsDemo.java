package method;

public class VarargsDemo {
    public static void main(String[] args) {
        printmax(34,5,6,7,8,99.7);
        printmax(new double[]{5,3,1,1});
    }

    public static void printmax(double... numbers){
        if (numbers.length == 0){
            System.out.println("No argument passed");
            return;
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i]>result)
                result=numbers[i];
        }
        System.out.println("The max value value is "+result);
    }
}
