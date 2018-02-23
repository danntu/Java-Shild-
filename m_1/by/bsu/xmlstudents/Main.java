package m_1.by.bsu.xmlstudents;

public class Main {
    public static void main(String[] args) {
//        StudentsStAXBuilder stAXBuilder = new StudentsStAXBuilder();
//        stAXBuilder.buildSetStudents("students.xml");
//        System.out.println(stAXBuilder.getStudents());
        StudentBuilderFactory sFactory = new StudentBuilderFactory();
        AbstractStudentsBuilder builder = sFactory.createStudentBuilder("stax");
        builder.buildSetStudents("students.xml");
        System.out.println(builder.getStudents());
    }
}
