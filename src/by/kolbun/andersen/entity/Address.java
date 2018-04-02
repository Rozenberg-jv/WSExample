package by.kolbun.andersen.entity;

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "address")
public class Address {
    @JacksonXmlProperty(isAttribute = true, localName = "id")
    private int id;
    private String street;
    private int house;

    public Address() {
    }

    public Address(int id, String street, int house) {
        this.id = id;
        this.street = street;
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "\t[id: " + id + ", street: " + street + ", house: " + house + "]";
    }
}
