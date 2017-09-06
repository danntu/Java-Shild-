package glava29;

import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;

public class ColorsBeansInfo extends SimpleBeanInfo{
    @Override
    public PropertyDescriptor[] getPropertyDescriptors() {
        try{
            PropertyDescriptor rectangular = new PropertyDescriptor("rectangular",Colors.class);
            PropertyDescriptor pd[] = {rectangular};
            return pd;
        } catch (Exception e){
            System.out.println("Exception: "+e);
        }
        return null;
    }
}
