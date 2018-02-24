public class Puppy {

    {
        int z = 0;
    }

    private int pupyAge;
    public static int pupAgeStatic=5;

    public Puppy(String name) {

        System.out.println("Name chosen is :"+name);
    }

    public void setPupyAge(int pupyAge) {
        this.pupyAge = pupyAge;
    }

    public int getPupyAge() {
        System.out.println("Puppy's age is : "+pupyAge);
        return pupyAge;
    }

    public static void main(String[] args) {

        System.out.println(pupAgeStatic);

        Puppy puppy = new Puppy("tommy");
        System.out.println(puppy.pupyAge);
        puppy.setPupyAge(2);
        puppy.getPupyAge();
        System.out.println("Variable Value : "+puppy.pupyAge);
    }

    int pupydAge;
}
