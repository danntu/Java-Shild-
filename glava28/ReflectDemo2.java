package glava28;

import com.sun.org.apache.xpath.internal.operations.Mod;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class ReflectDemo2 {
    public static void main(String[] args) {
       try{
           A a = new A();
           Class<?> c = a.getClass();
           Method methods[]=c.getDeclaredMethods();
           for (int i = 0; i <methods.length ; i++) {
               int modifiers = methods[i].getModifiers();
               if(Modifier.isPublic(modifiers)){
                   System.out.println("Public methods "+methods[i].getName());
               }
               if(Modifier.isProtected(modifiers)){
                   System.out.println("Protected method "+methods[i]);
               }
           }
       } catch (Exception e){
           System.out.println("Exception: "+e);
       }
    }
}
class A{
    public void a1(){

    }
    public void a2(){

    }
    protected  void a3(){

    }
    private void a4(){

    }
}
