package m_1.by.bsu.xmlstudents;

import org.xml.sax.XMLReader;

import java.util.Set;

public class StudentsSAXBuilder extends AbstractStudentsBuilder {
    private StudentHandler sh;
    private XMLReader reader;

    public StudentsSAXBuilder() {
    }

    public StudentsSAXBuilder(Set<Student> students) {
        super(students);
    }

    @Override
    public void buildSetStudents(String fileName) {

    }
}
