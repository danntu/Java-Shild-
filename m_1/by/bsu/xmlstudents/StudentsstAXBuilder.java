package m_1.by.bsu.xmlstudents;

import javax.xml.stream.XMLInputFactory;
import java.util.Set;

public class StudentsstAXBuilder extends AbstractStudentsBuilder {
    private XMLInputFactory inputFactory;

    public StudentsstAXBuilder() {
    }

    public StudentsstAXBuilder(Set<Student> students) {
        super(students);
    }

    @Override
    public void buildSetStudents(String fileName) {

    }
}
