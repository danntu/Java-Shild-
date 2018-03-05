package m_1.by.bsu.xmlstudents;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractStudentsBuilder {
    protected Set<Student> students;

    public AbstractStudentsBuilder() {
        students=new HashSet<Student>();
    }

    public AbstractStudentsBuilder(Set<Student> students) {
        thistest.students = students;
    }

    public Set<Student> getStudents() {
        return students;
    }

    abstract public void buildSetStudents(String fileName);


}
