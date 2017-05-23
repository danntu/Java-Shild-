/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package glava14;

/**
 *
 * @author DMyrzaka
 */
interface MinMax<T extends Comparable<T>>{
    T min();
    T max();
}
class MyClass <T extends Comparable<T>> implements MinMax<T>{
    T[] vals;

    public MyClass(T[] vals) {
        this.vals = vals;
    }
    public T min(){
        T v = vals[0];
        for (int i=1;i<vals.length;i++)
            if(vals[i].compareTo(v)<0) v=vals[i];
        return v;
    }
    
    public T max(){
        T v = vals[0];
           for (int i=1;i<vals.length;i++)
            if(vals[i].compareTo(v)>0) v=vals[i];
        return v;
    }
}
public class GenIFDemo {
    public static void main(String[] args) {
        Integer inums[]={3,6,2,8,6};
        Character chs[]={'b','r','p','w'};
        MyClass<Integer> iob = new MyClass<Integer>(inums);
        MyClass<Character> cob= new MyClass<Character>(chs);
        System.out.println("Max value is inums: "+iob.max());
        System.out.println("Min  value is inums: "+iob.min());
        System.out.println("Max value is chs: "+cob.max());
        System.out.println("Min value is chs: "+cob.min());
    }
}
