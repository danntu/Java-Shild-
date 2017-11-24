package m_1.by.bsu.serial;

import java.io.InvalidObjectException;

public class RunnerSerialization {
    public static void main(String[] args) {
        Student ob = new Student("MMF","Danik",1,"T39sk");
        System.out.println(ob);
        String file = "demo.data";
        Serializator sz = new Serializator();
        boolean b =sz.serialization(ob,file);
        Student.faculty="GEO";
        Student res =null;
        try{
            res=sz.deserialization(file);
        } catch (InvalidObjectException e){
            e.printStackTrace();
        }
        System.out.println(res);
    }
}
