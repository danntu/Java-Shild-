package glava19;

import java.io.*;

/**
 * Created by DMyrzaka on 29.06.2017.
 */
public class SerializationDemo {
    public static void main(String[] args) {
        try(ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("serial"))){
            MyClass object1 = new MyClass("Hello",-7,2.7e10);
            System.out.println("object1: "+object1);
            objectOutputStream.writeObject(object1);
        } catch (IOException e){
            System.out.println("Исключение во время сериализации : "+e);
        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("serial"))){
            MyClass object2 = (MyClass)objectInputStream.readObject();
            System.out.println("object2: "+object2);
        } catch (Exception e){
            System.out.println("Исключение во время сериализации :"+e);
            System.exit(0);
        }
    }
}

class MyClass implements Serializable{
    String s;
    int i;
    double d;

    public MyClass(String s, int i, double d) {
        this.s = s;
        this.i = i;
        this.d = d;
    }
    public String toString(){
        return "s="+s+"; i="+i+"; d="+d;
    }
}
