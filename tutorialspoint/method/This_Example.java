package method;

public class This_Example {
    int num =10;

    public This_Example() {
        System.out.println("This is an example program on keyword this");
    }

    public This_Example(int num) {
        this();
        this.num = num;
    }

    public void greet(){
        System.out.println("Hi Welcome to Tutorialspoint");
    }

    public void print(){
        int num =20;
        System.out.println("value of local variable num is : "+num);
        System.out.println("value of instance variable num is : "+this.num);
        this.greet();

    }

    public static void main(String[] args) {
        This_Example obj1  = new This_Example();
        obj1.print();
        System.out.println("_____________________________________");
        This_Example obj2 = new This_Example(30);
        obj2.print();
    }
}
