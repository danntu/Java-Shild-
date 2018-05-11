package javatpoint.str;

public final class Employee {
    final String pancardNumber = "9079";

//    public Employee(String pancardNumber) {
//        this.pancardNumber=pancardNumber;
//    }


    public String getPancardNumber() {
        return pancardNumber;
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        System.out.println(employee.getPancardNumber());
    }
}
