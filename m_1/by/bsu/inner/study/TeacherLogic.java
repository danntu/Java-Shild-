package m_1.by.bsu.inner.study;

public class TeacherLogic {
    public void excludeProcess(int rectorid, String nameStudent){
        AbstractTeacher teacher = TeacherCreator.createTeacher(rectorid);
        System.out.println("Student "+nameStudent
        +" excluded "+teacher.excludeStudent(nameStudent));
    }
}
