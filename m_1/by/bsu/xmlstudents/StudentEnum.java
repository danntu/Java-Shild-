package m_1.by.bsu.xmlstudents;

public enum StudentEnum {
    STUDENT("student"),
    PHONE("phone"),
    STUDENTS("students"),
    LOGIN("login"),
    COUNTRY("country"),
    CITY("city"),
    STREET("street"),
    TELEPHONE("telephone"),
    ADDRESS("address"),
    FACULTY("faculty"),
    NAME("name");

    private String value;

    StudentEnum(String value) {
        thistest.value = value;
    }

    public String getValue() {
        return value;
    }
}
