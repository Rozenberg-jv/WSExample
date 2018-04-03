package by.kolbun.andersen.entity;

import javax.xml.bind.annotation.XmlAttribute;

public class Address {
    @XmlAttribute(name = "item_id", required = true)
    private int item_id;
    private String street;
    private int house;

    public Address() {
    }

    public Address(int item_id, String street, int house) {
        this.item_id = item_id;
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

//    public int getItem_id() {
//        return item_id;
//    }

    public void setItem_id(int item_id) {
        this.item_id = item_id;
    }

    @Override
    public String toString() {
        return "\t[item_id: " + item_id + ", street: " + street + ", house: " + house + "]";
    }
}
