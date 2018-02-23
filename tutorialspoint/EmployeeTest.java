public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 =  new Employee("Danniyar Myrzakanov");
        Employee employee2 = new Employee("Usen Myrzakanov");

        employee1.setAge(26);
        employee1.setDesignation("Senior Software Engineer");
        employee1.setSalary(1000);
        employee1.printEmployee();
        System.out.println();
        employee2.setAge(21);
        employee2.setDesignation("Software Engineer");
        employee2.setSalary(500);
        employee2.printEmployee();

    }
}
