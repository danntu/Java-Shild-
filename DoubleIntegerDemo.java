/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package glava16;

/**
 *
 * @author DMyrzaka
 */
public class DoubleIntegerDemo {
    public static void main(String... args){
        Double d1 = new Double(123.56);
        Double d2 = new Double(256.98);
        System.out.println("Double.MAX_EXPONENT "+Double.MAX_EXPONENT);
        System.out.println("Double.MAX_VALUE "+Double.MAX_VALUE);
        System.out.println("Double.MIN_EXPONENT "+Double.MIN_EXPONENT);
        System.out.println("Double.MIN_NORMAL "+Double.MIN_NORMAL);
        System.out.println("Double.MIN_VALUE "+Double.MIN_VALUE);
        System.out.println("Double.NEGATIVE_INFINITY "+Double.NEGATIVE_INFINITY);
        System.out.println("Double.NaN "+Double.NaN);
        System.out.println("Double.POSITIVE_INFINITY "+Double.POSITIVE_INFINITY);
        System.out.println("Double.SIZE "+Double.SIZE);
        System.out.println(" "+Double.TYPE);
        System.out.println(Double.parseDouble("123"));
        
        
        System.out.println(d1+" = "+":"+d1.isInfinite()+" "+d2+" -> "+d1.equals(d2));     
        int d=d1.intValue()+d2.intValue();
        System.out.println("Double to in "+d+" "+d2.toString());
        
        Integer i = new Integer(255);
        System.out.println("Integer.toBinaryString(25) = "+Integer.toBinaryString(25));
        System.out.println("Integer.toHexString(25) = "+Integer.toHexString(25));
        System.out.println("Integer.toOctalString(25) = "+Integer.toOctalString(25));
        
    }
}
