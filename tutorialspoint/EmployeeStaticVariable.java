public class EmployeeStaticVariable {
    private static double salary;

    private static void showSalary(){
        System.out.println(salary);
    }

    private static final String DEPARTMENT = "Development";

    public static void main(String[] args) {
        salary = 1000;
        System.out.println(DEPARTMENT);
        System.out.println("average salary");
        showSalary();
    }
}
