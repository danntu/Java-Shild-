package inheritance;
class Calculation{
  int z;
  public void addition(int x, int y){
    z=x+y;
    System.out.println("The sum of the given numbers:"+z);
  }

  public void substraction(int x, int y){
    z=x-y;
    System.out.println("The difference between the given numbers:"+z);
  }
}
public class My_Calculation extends Calculation{

  public void multiplication(int x, int y) {
     z = x * y;
     System.out.println("The product of the given numbers:"+z);
  }

  public static void main(String[] args) {
    int a = 20;
    int b = 10;

    My_Calculation demo = new My_Calculation();
    demo.addition(a, b);
    demo.substraction(a, b);
    demo.multiplication(a, b);
  }
}