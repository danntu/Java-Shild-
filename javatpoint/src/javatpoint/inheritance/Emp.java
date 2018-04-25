package javatpoint.inheritance;

public class Emp {
    int id;
    String name;
    Address address;

    public Emp(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    }

    public static void main(String[] args) {
        Address address1 = new Address("Almaty", "AL", "Kazakhstan");
        Address address2 = new Address("Astana", "AS", "Kazakhstan");
        Emp emp1 = new Emp(111, "Danik", address1);
        Emp emp2 = new Emp(112, "Moldir", address2);
        emp1.display();
        emp2.display();

    }
}
