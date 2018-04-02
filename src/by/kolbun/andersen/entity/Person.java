package by.kolbun.andersen.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import java.util.List;

@JacksonXmlRootElement(localName = "person")
public class Person {
    private int id;
    private String name;
    @JacksonXmlElementWrapper(localName = "addresses")
    @JacksonXmlProperty(localName = "address")
    private List<Address> addresses;

    public Person() {
    }

    public Person(int id, String name, List<Address> addresses) {
        this.id = id;
        this.name = name;
        this.addresses = addresses;
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

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        String result = "[id: " + id + ", name: " + name + ", addresses:]\n";
        for (Address a : addresses)
            result += a + "\n";
        return result;
    }
}
