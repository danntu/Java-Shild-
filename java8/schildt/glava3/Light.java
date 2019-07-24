package schildt.glava3;

public class Light {
    public static void main(String[] args) {
        int lightSpeed;
        long days;
        long seconds;
        long distance;

        lightSpeed = 186_000;
        days = 1_000;
        seconds = days*24*60*60;
        distance = lightSpeed * seconds;

        System.out.print("За " + days);
        System.out.print(" дней свет пройдет около");
        System.out.println(distance + " миль");

    }
}
