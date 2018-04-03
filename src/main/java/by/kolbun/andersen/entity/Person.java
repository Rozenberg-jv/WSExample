package by.kolbun.andersen.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "person")
public class Person {
    private int id;
    private String name;
    @XmlElementWrapper(name = "address_list")
    @XmlElement(name = "address")
    private List<Address> addressList;

    public Person() {
    }

    public Person(int id, String name, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.addressList = addresses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getAddressList() {
        return addressList;
    }

    public void setAddresses(List<Address> addresses) {
        this.addressList = addresses;
    }

    @Override
    public String toString() {
        String result = "\t[id: " + id + ", name: " + name + ", addresses:]\n";
        for (Address a : addressList)
            result += a == null ? "null" : (a + "\n");
        return result;
    }
}
