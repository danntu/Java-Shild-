package m_1.by.bsu.xmlstudents;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;

@XmlRootElement
public class Students {
    @XmlElement(name = "student")
    private ArrayList<Student> list = new ArrayList<Student>();

    public Students() {
        super();
    }

    public void setList(ArrayList<Student> list){
        thistest.list=list;
    }

    public boolean add(Student st){
        return list.add(st);
    }

    public String toString(){
        return "Students [list = "+list+"]";
    }
}
