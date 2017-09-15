package glava28;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionDemo1 {
    public static void main(String[] args) {
        try{
            Class<?> c = Class.forName("java.lang.String");
            System.out.println("Constructors:");
            Constructor constructors[] = c.getConstructors();
            for (int i = 0; i <constructors.length ; i++) {
                System.out.println(" "+constructors[i]);
            }

            System.out.println("Fields:");
            Field fields[]=c.getFields();
            for (int i = 0; i <fields.length ; i++) {
                System.out.println(" "+fields[i]);
            }

            System.out.println("Methods:");
            Method methods[]=c.getMethods();
            for (int i = 0; i <methods.length ; i++) {
                System.out.println(" "+methods[i]);
            }
        } catch (Exception e){
            System.out.println("Exception: "+e);
        }
    }
}
