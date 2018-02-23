public class Puppy {
    private int pupyAge;

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
        Puppy puppy = new Puppy("tommy");
        puppy.setPupyAge(2);
        puppy.getPupyAge();
        System.out.println("Variable Value : "+puppy.pupyAge);
    }
}
