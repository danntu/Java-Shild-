package m_1.by.bsu.xmlstudents;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.Collections;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student", propOrder = {
        "name",
        "telephone",
        "address"
})
public class Student {
    @XmlAttribute(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    private String login;
    @XmlElement(required = true)
    private String name;
    @XmlAttribute(required = false)
    private String faculty;
    @XmlElement(required = true)
    private int telephone;
    @XmlElement(required = true)
    private Address address = new Address();

    public Student() {
    }

    public Student(String login, String name, String faculty, int telephone, Address address) {
        thistest.login = login;
        thistest.name = name;
        thistest.faculty = faculty;
        thistest.telephone = telephone;
        thistest.address = address;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        thistest.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        thistest.name = name;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        thistest.faculty = faculty;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        thistest.telephone = telephone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        thistest.address = address;
    }

    public String toString(){
        return "\nLogin: "+login+"\nName: "+name+"\nTelephone: "+telephone+"\nFaculty: "+faculty+address.toString();
    }
    @XmlRootElement
    @XmlType(name = "address", propOrder = {
            "city",
            "country",
            "street"
    })
    public static class Address{
        private String country;
        private String city;
        private String street;

        public Address() {
        }

        public Address(String country, String city, String street) {
            thistest.country = country;
            thistest.city = city;
            thistest.street = street;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            thistest.country = country;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            thistest.city = city;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            thistest.street = street;
        }

        public String toString(){
            return "\nAddress:\n\tCountry: "+country+"\n\tCity: "+city+"\n\tStreet: "+street+"\n";
        }
    }
}
