public class EmployeeInstanceVariable {
    public String name;
    private double salary;

    public EmployeeInstanceVariable(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void printEmployee() {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }

    public static void main(String[] args) {
        EmployeeInstanceVariable instanceVariable = new EmployeeInstanceVariable("Daniyar");
        instanceVariable.setSalary(1000);
        instanceVariable.printEmployee();
    }
}
