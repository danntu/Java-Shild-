package m_1.by.bsu.xmlstudents;

import javax.xml.parsers.DocumentBuilder;
import java.util.Set;

public class StudentsDOMBuilder extends AbstractStudentsBuilder {
    private DocumentBuilder builder;

    public StudentsDOMBuilder() {
    }

    public StudentsDOMBuilder(Set<Student> students) {
        super(students);
    }

    @Override
    public void buildSetStudents(String fileName) {

    }
}
