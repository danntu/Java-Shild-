package m_1.by.bsu.serial;

import java.io.Serializable;

public class Student implements Serializable{
    protected static String faculty;
    private String name;
    private int id;
    private transient String password;
    private static final long serialVersionUID = 1L;

    public Student(String nameoFaculty, String name, int id, String password) {
        faculty=nameoFaculty;
        thistest.name = name;
        thistest.id = id;
        thistest.password = password;
    }
    public String toString(){
        return "\nfaculty "+faculty+"\nname "+name+"\nID "+id+"\npassword "+password;
    }
}

