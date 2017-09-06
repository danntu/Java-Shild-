package glava29;

import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.awt.*;

public class IntrospectorDemo {
    public static void main(String[] args) {
        try{
            Class<?> c = Class.forName("glava29.Colors");
            BeanInfo BeanInfo = Introspector.getBeanInfo(c);
            System.out.println("Property:");
            PropertyDescriptor propertyDescriptor[] = BeanInfo.getPropertyDescriptors();
            for (int i = 0; i <propertyDescriptor.length ; i++) {
                System.out.println("\t"+propertyDescriptor[i].getName());
            }

            System.out.println("Event:");
            EventSetDescriptor eventSetDescriptor[] = BeanInfo.getEventSetDescriptors();
            for (int i = 0; i <eventSetDescriptor.length ; i++) {
                System.out.println("\t"+eventSetDescriptor[i].getName());
            }

        } catch (Exception e){
            System.out.println("Exception1: "+e);
        }
    }
}
