package m_1.by.bsu.xmlstudents;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class MarshalMain {
    public static void main(String[] args) {
        try{
            JAXBContext context = JAXBContext.newInstance(Students.class);
            Marshaller m = context.createMarshaller();
            Students st = new Students(){
                {
                    Student.Address addr = new Student.Address("BLR","Minsk","Asyl Arman 4");
                    Student s = new Student("gochette","Myrzakanov","mmf",2095306,addr);
                    this.add(s);
                }


            };
            m.marshal(st,new FileOutputStream("studs_marsh.xml"));
            m.marshal(st,System.out);
            System.out.println("XML file created");
        } catch (FileNotFoundException e){
            System.out.println("XML file cannot create "+e);
        } catch (JAXBException e){
            System.out.println("JAXB context is error");
        }
    }
}
