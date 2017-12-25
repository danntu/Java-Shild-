package m_1.by.bsu.xmlstudents;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class UnMarshalMain {
    public static void main(String[] args) {
        try{
            JAXBContext jaxbContext = JAXBContext.newInstance(Students.class);
            Unmarshaller u = jaxbContext.createUnmarshaller();
            FileReader reader = new FileReader("studs_marsh.xml");
            Students students = (Students) u.unmarshal(reader);
            System.out.println(students);
        } catch (JAXBException e){
            e.printStackTrace();
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
